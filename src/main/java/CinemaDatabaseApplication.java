//Brand Citozi SDA Academy
import Utils.HibernateUtils;
import model.*;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class CinemaDatabaseApplication {
    public static void main(String[] args) {
        Session session = HibernateUtils.getSessionFactory().openSession();
//        Query query=session.createQuery("from Clients ");
//        List<Clients> clients=query.getResultList();
//        clients.forEach(System.out::println);
//        System.out.println("--------------------------------------------------------------");
//        Query query1=session.createQuery("from Movie ");
//        List<Movie> movies=query1.getResultList();
//        movies.forEach(System.out::println);
//        System.out.println("--------------------------------------------------------------");
//        Query query2=session.createQuery("from Reservations ");
//        List<Reservations> reservations=query2.getResultList();
//        reservations.forEach(System.out::println);
//        System.out.println("--------------------------------------------------------------");
//        Query query3=session.createQuery("from Room ");
//        List<Room> rooms=query3.getResultList();
//        rooms.forEach(System.out::println);
//        System.out.println("--------------------------------------------------------------");
//        Query query4=session.createQuery("from Schedules ");
//        List<Schedules> schedules=query4.getResultList();
//        schedules.forEach(System.out::println);
//        System.out.println("--------------------------------------------------------------");
//        Query query5=session.createQuery("from Seats ");
//        List<Seats> seats=query5.getResultList();
//        seats.forEach(System.out::println);
//        System.out.println("--------------------------------------------------------------");
//        Query query6=session.createQuery("from TicketCategory ");
//        List<TicketCategory> ticketCategories=query6.getResultList();
//        ticketCategories.forEach(System.out::println);
//        System.out.println("--------------------------------------------------------------");
//        Query query7=session.createQuery("from Tickets ");
//        List<Tickets> tickets=query7.getResultList();
//        tickets.forEach(System.out::println);
//        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n");
//        System.out.println("Optional Exercises: " + "\n");
//        Query query8 = session.createQuery("from Movie ");
//        List<Movie> movies1 = query8.getResultList();
//        System.out.println("List all movies: " + "\n");
//        movies1.forEach(System.out::println);
//        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +
//                "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n");
//        System.out.println("Optional Exercises: " + "\n");
//        Query query9 = session.createQuery("from Schedules where startTime like '2020-01-01%'");
//        List<Schedules> moviesAfterFirstJanaury2020 = query9.getResultList();
//        System.out.println("List all movies running on 2020-01-01: " + "\n");
//        moviesAfterFirstJanaury2020.forEach(System.out::println);
//        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +
//                "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n");
//        System.out.println("Optional Exercises: " + "\n");
//        Query query10 = session.createQuery("from Movie m left join m.schedules s  where s.startTime is null");
//        List<Movie> moviesThatDoesntHaveSchedules = query10.getResultList();
//        System.out.println("List all movies not having a schedule yet: " + "\n");
//        moviesThatDoesntHaveSchedules.forEach(System.out::println);
//        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" +
//                "-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-" + "\n");
//        System.out.println("Optional Exercises: " + "\n");
//        Query sessionQuery = session.createQuery("from Clients \n" +
//                "inner join Reservations on Reservations.clients.clientId=Clients.clientId\n" +
//                " inner join Schedules on Schedules.scheduleId= Reservations.schedules.scheduleId \n" +
//                " left join Movie on Schedules.movie.movieId=Movie.movieId where Clients.firstName='John'");
//        List<Movie> john = sessionQuery.getResultList();
//        System.out.println("List all movies scheduled by john: " + "\n");
//        john.forEach(System.out::println);

        // Session session = HibernateUtils.getSessionFactory().openSession();

        //session.createQuery("from Clients").getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("from Movie ").getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("from Schedules where startTime like '2020-01-01%'").getResultList()
                .forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select m  from Movie m left join m.schedules s  where s.startTime is null")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select m from Movie m inner join m.schedules s inner join s.reservations k where k.clients.firstName like 'John%' ")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select s.row from Seats s join s.reservations r where r.clients.firstName= 'John' and r.clients.lastName='Johnson' ")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select s from Seats s join s.reservations r where r.clients.firstName= 'John' and r.clients.lastName='Johnson' ")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select count(s.ticketCategoryId) from TicketCategory s inner join s.tickets r inner join r.schedules k where k.movie.name = 'Joker'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select s from TicketCategory s inner join s.tickets r inner join r.schedules k where k.movie.name = 'Joker'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select count(s.ticketId) from Tickets s inner join s.ticketCategory r inner join r.tickets e inner join e.schedules k where k.movie.name='Joker'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select s from Tickets s inner join s.ticketCategory r inner join r.tickets e inner join e.schedules k where k.movie.name='Joker'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select coalesce(avg(s.ticketId),0) from Tickets s right join s.schedules r right join r.movie e where e.name='Men in Black: International'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select coalesce(avg(s.ticketId),0) from Tickets s right join s.schedules r right join r.movie e where e.name='Joker'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select coalesce(avg(s.ticketId),0) from Tickets s right join s.schedules r right join r.movie e where e.name='Frozen II'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select coalesce(avg(s.ticketId),0) from Tickets s right join s.schedules r right join r.movie e where e.name='Parasite'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select coalesce(max(s.ticketId),0) from Tickets s right join s.schedules r right join r.movie e")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select l.row from Movie m inner join m.schedules s inner join s.room k inner join k.seats l left join l.reservations b where b.reservationId is null and m.name='Joker'")
                .getResultList().forEach(System.out::println);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_--_-_-_-_-");
        session.createQuery("select l.number from Movie m inner join m.schedules s inner join s.room k inner join k.seats l left join l.reservations b where b.reservationId is null and m.name='Joker'")
                .getResultList().forEach(System.out::println);
    }
}
