package Utils;


import model.*;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtils {
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if(sessionFactory==null) {
            try {// sessionFactory = (SessionFactory) new Department();
                Configuration configuration = new Configuration();

                configuration.addAnnotatedClass(Clients.class);
                configuration.addAnnotatedClass(Movie.class);
                configuration.addAnnotatedClass(Reservations.class);
                configuration.addAnnotatedClass(Room.class);
                configuration.addAnnotatedClass(Schedules.class);
                configuration.addAnnotatedClass(Seats.class);
                configuration.addAnnotatedClass(TicketCategory.class);
                configuration.addAnnotatedClass(Tickets.class);

                ServiceRegistry serviceRegistry = new
                        StandardServiceRegistryBuilder()
                        .applySettings(configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sessionFactory;
    }
}
