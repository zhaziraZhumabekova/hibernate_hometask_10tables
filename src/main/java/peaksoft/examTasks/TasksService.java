package peaksoft.examTasks;

import org.hibernate.Session;
import peaksoft.util.HibernateUtil;

public class TasksService {
    public static Long create(ExamTasks service){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(service);
        session.getTransaction().commit();
        session.close();
        System.out.println("Added exam tasks are " + service);
        return service.getId();
    }

}
