package peaksoft.student;

import org.hibernate.Query;
import org.hibernate.Session;
import peaksoft.util.HibernateUtil;

import java.util.List;

public class StudentService {
    public  static Long create(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("Table was created");
        return student.getId();
    }

    public static Student getById(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = (Student) session.get(Student.class, id);
        session.getTransaction().commit();
        session.close();
        return student;
    }

    public static void deleteById(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = (Student) session.get(Student.class, id);
        session.delete(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("Student by id " + student + " was deleted!");
    }

    public static List<Student> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Student> students = session.createQuery("FROM Student").getResultList();
        session.getTransaction().commit();
        session.close();
        return students;
    }

    public static void deleteAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("DELETE FROM Student");
        query.executeUpdate();
        session.getTransaction().commit();
        session.close();
        System.out.println("Successfully was deleted all students data");
    }


}
