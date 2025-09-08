/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.umg.proyect.util;

/**
 *
 * @author josth
 */
import com.umg.proyect.model.Student;
import com.umg.proyect.model.Teacher;

public class SessionManager {
    private static Object currentUser;
    private static String userType;

    public static void setStudentSession(Student student) {
        currentUser = student;
        userType = "STUDENT";
    }

    public static void setTeacherSession(Teacher teacher) {
        currentUser = teacher;
        userType = "TEACHER";
    }

    public static Student getCurrentStudent() {
        if ("STUDENT".equals(userType)) {
            return (Student) currentUser;
        }
        return null;
    }

    public static Teacher getCurrentTeacher() {
        if ("TEACHER".equals(userType)) {
            return (Teacher) currentUser;
        }
        return null;
    }

    public static String getUserType() {
        return userType;
    }
    
    public static String getUserName() {
        if ("STUDENT".equals(userType)) {
            return ((Student) currentUser).getNombre();
        } else if ("TEACHER".equals(userType)) {
            return ((Teacher) currentUser).getNombre();
        }
        return "";
    }
    
    public static String getUserEmail() {
        if ("STUDENT".equals(userType)) {
            return ((Student) currentUser).getEmail();
        } else if ("TEACHER".equals(userType)) {
            return ((Teacher) currentUser).getEmail();
        }
        return "";
    }

    public static void clearSession() {
        currentUser = null;
        userType = null;
    }
    
    public static boolean isLoggedIn() {
        return currentUser != null;
    }
}