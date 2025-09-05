/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyect.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 *
 * @author josth
 */
public class Asignacion {
    private int asigned_id;
    private Student student_id;
    private Curso curso_id;
    public Asignacion(){
    } 

    public int getAsigned_id() {
        return asigned_id;
    }

    public void setAsigned_id(int asigned_id) {
        this.asigned_id = asigned_id;
    }

    public Student getStudent_id() {
        return student_id;
    }

    public void setStudent_id(Student student_id) {
        this.student_id = student_id;
    }

    public Curso getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(Curso curso_id) {
        this.curso_id = curso_id;
    }
     
}