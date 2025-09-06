/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyect.util;

/**
 *
 * @author josth
 */
public class UserRoleChecker {
    
    public static final int STUDENT = 1;
    public static final int TEACHER = 2;
    public static final int ADMIN = 3;
    public static final int UNKNOWN = 4;

    public static int comprobarCorreo(String correo) {
        if (esStudent(correo)) return STUDENT;
        if (esTeacher(correo)) return TEACHER;
        if (esAdmin(correo)) return ADMIN;
        return UNKNOWN;
    }

    private static boolean esStudent(String correo) {
        String dominioStudent = "student.umg.com";
        try {
            String[] cSeparar = correo.split("@");
            return cSeparar[1].equalsIgnoreCase(dominioStudent);
        } catch (Exception e) {
            return false;
        }
    }

    private static boolean esTeacher(String correo) {
        String dominioTeacher = "teacher.umg.com";
        try {
            String[] cSeparar = correo.split("@");
            return cSeparar[1].equalsIgnoreCase(dominioTeacher);
        } catch (Exception e) {
            return false;
        }
    }
    private static boolean esAdmin(String correo) {
        String dominioTeacher = "admin.umg.com";
        try {
            String[] cSeparar = correo.split("@");
            return cSeparar[1].equalsIgnoreCase(dominioTeacher);
        } catch (Exception e) {
            return false;
        }
    }    
}