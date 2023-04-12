package peaksoft.laptop;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import peaksoft.student.Student;
import peaksoft.util.HibernateUtil;

import java.util.List;

public class LaptopService {
    public static int create(Laptop laptop){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(laptop);
        session.getTransaction().commit();
        session.close();
        System.out.println("OK");
        return laptop.getId();
    }

    public static Laptop getById(int id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Laptop laptop = (Laptop) session.get(Laptop.class, id);
        session.getTransaction().commit();
        session.close();
        return laptop;
    }

    public static List<Laptop> getAll() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Laptop> laptops = session.createQuery("FROM Laptop").getResultList();
        session.getTransaction().commit();
        session.close();
        return laptops;
    }
}
