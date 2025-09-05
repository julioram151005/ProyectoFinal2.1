/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyect.service;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.umg.proyect.model.Student;
import com.umg.proyect.util.PasswordEncryptor;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.classic.methods.HttpPut;
import org.apache.hc.client5.http.classic.methods.HttpDelete;
import org.apache.hc.client5.http.entity.EntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.ContentType;

import java.io.InputStream;
import java.util.List;

/**
 *
 * @author josth
 */
public class StudentService {
    private static final String BASE_URL = "https://proyectoprogramacion2-1.onrender.com/api/estudiantes";
    private static final ObjectMapper mapper = new ObjectMapper();


    public List<Student> getStudent() throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(BASE_URL);
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, new TypeReference<List<Student>>() {});
        }
    }

    public boolean login(String correo, String contrasena) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet request = new HttpGet(BASE_URL);
            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);

            if (response.getCode() == 200) {
                InputStream is = response.getEntity().getContent();
                List<Student> estudiantes = mapper.readValue(is, new TypeReference<List<Student>>() {});

                String hashIngresada = PasswordEncryptor.hashMD5(contrasena);


                for (Student s : estudiantes) {
                    if (s.getEmail().equalsIgnoreCase(correo) && s.getPassword().equals(hashIngresada)) {
                        return true; 
                    }
                }
            }
        }
        return false;
    } 
    
    public Student createStudent(Student m) throws Exception {
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
            return mapper.readValue(is, Student.class);
        }
    }

    public Student updateStudent(int id, Student m) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPut request = new HttpPut(BASE_URL + "/update/" + id);
            String hashPass = PasswordEncryptor.hashMD5(m.getPassword());
            m.setPassword(hashPass);
            String json = mapper.writeValueAsString(m);
            request.setEntity(EntityBuilder.create()
                    .setText(json)
                    .setContentType(ContentType.APPLICATION_JSON)
                    .build());

            ClassicHttpResponse response = (ClassicHttpResponse) client.execute(request);
            InputStream is = response.getEntity().getContent();
            return mapper.readValue(is, Student.class);
        }
    }
/*
    public void deleteStudent(int id) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpDelete request = new HttpDelete(BASE_URL + "/delete/" + id);
            client.execute(request).close();
        }
    }
*/
}
