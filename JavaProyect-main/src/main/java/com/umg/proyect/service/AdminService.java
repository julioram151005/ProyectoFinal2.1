/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyect.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.umg.proyect.model.Admin;
import java.io.InputStream;
import java.util.List;
import com.umg.proyect.util.PasswordEncryptor;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.entity.EntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;

/**
 *
 * @author josth
 */
public class AdminService {
    private static final String BASE_URL = "https://proyectoprogramacion2-1.onrender.com/api/admins";
    private static final ObjectMapper mapper = new ObjectMapper();

    public List<Admin> getAdmin() throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(BASE_URL);
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, new TypeReference<List<Admin>>() {});
        }
    }
    
    public boolean login(String correo, String contrasena) throws Exception {
        try (CloseableHttpClient admin = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(BASE_URL);
            ClassicHttpResponse response = (ClassicHttpResponse) admin.execute(request);

            if (response.getCode() == 200) {
                InputStream is = response.getEntity().getContent();
                List<Admin> estudiantes = mapper.readValue(is, new TypeReference<List<Admin>>() {});

                String hashIngresada = PasswordEncryptor.hashMD5(contrasena);


                for (Admin s : estudiantes) {
                    if (s.getEmail().equalsIgnoreCase(correo) && s.getPassword().equals(hashIngresada)) {
                        return true; 
                    }
                }
            }
        }
        return false;
    }
    
    public Admin createAdmin(Admin m) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost request = new HttpPost(BASE_URL + "/create");
            String hashPass = PasswordEncryptor.hashMD5(m.getPassword());
            m.setPassword(hashPass);            
            String json = mapper.writeValueAsString(m);
            request.setEntity(EntityBuilder.create()
                    .setText(json)
                    .setContentType(ContentType.APPLICATION_JSON)
                    .build());
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, Admin.class);
        }
    }

    public Admin updateAdmin(int id, Admin m) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPut request = new HttpPut(BASE_URL + "/update/" + id);
            String json = mapper.writeValueAsString(m);
            request.setEntity(EntityBuilder.create()
                    .setText(json)
                    .setContentType(ContentType.APPLICATION_JSON)
                    .build());
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, Admin.class);
        }
    }
        
}
