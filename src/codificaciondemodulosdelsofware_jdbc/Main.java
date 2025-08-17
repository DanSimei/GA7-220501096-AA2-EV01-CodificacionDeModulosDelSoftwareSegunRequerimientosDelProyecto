/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codificaciondemodulosdelsofware_jdbc;

/**
 *
 * @author DanSimei
 */
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();

        // Inserción
        Student newStudent = new Student(0, "Juan Perez", 20, "juan@gmail.com");
        dao.insertStudent(newStudent);

        // Consulta
        List<Student> students = dao.getAllStudents();
        System.out.println("Estudiantes:");
        for (Student s : students) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName() + ", Age: " + s.getAge() + ", Email: " + s.getEmail());
        }

        // Actualización
        Student updatedStudent = new Student(1, "Juan Actualizado", 21, "juan2@gmail.com");
        dao.updateStudent(updatedStudent);

        // Eliminación
        dao.deleteStudent(1);
    }
}
