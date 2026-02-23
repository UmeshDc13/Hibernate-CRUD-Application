package com.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.entity.Student;
import com.util.HibernateUtil;

public class StudentDAO {

    // 🔹 CREATE
    public void saveStudent(Student student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.save(student);

        tx.commit();
        session.close();
        System.out.println("Student Saved Successfully ✅");
    }

    // 🔹 READ
    public Student getStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Student student = session.get(Student.class, id);
        session.close();
        return student;
    }

    // 🔹 UPDATE
    public void updateStudent(int id, double newMarks) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, id);
        if (student != null) {
            student.setMarks(newMarks);
            session.update(student);
            System.out.println("Student Updated Successfully ✅");
        } else {
            System.out.println("Student Not Found ❌");
        }

        tx.commit();
        session.close();
    }

    // 🔹 DELETE
    public void deleteStudent(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = session.get(Student.class, id);
        if (student != null) {
            session.delete(student);
            System.out.println("Student Deleted Successfully ✅");
        } else {
            System.out.println("Student Not Found ❌");
        }

        tx.commit();
        session.close();
    }
}