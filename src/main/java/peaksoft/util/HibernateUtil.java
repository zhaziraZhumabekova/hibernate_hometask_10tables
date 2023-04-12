package peaksoft.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import peaksoft.examTasks.ExamTasks;
import peaksoft.examTasks.TasksService;
import peaksoft.laptop.Laptop;
import peaksoft.laptop.LaptopService;
import peaksoft.student.Student;
import peaksoft.student.StudentService;

public class HibernateUtil {
    private static SessionFactory buildSessionFactory(){
        SessionFactory sessionFactory = null;
        try{
            sessionFactory = new Configuration()
                    .configure("hibernate.cfg.xml")
//                    .addAnnotatedClass(Student.class)
//                    .addAnnotatedClass(StudentService.class)
//                    .addAnnotatedClass(Laptop.class)
//                    .addAnnotatedClass(LaptopService.class)
                    .addAnnotatedClass(ExamTasks.class)
                    .addAnnotatedClass(TasksService.class)
                    .buildSessionFactory();
        } catch (Exception ex){
            ex.printStackTrace();
        }
        return sessionFactory;
    }
    public static SessionFactory getSessionFactory(){
        return buildSessionFactory();
    }
}
