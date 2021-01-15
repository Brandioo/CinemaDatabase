package model;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketId")
    private Integer ticketId;

    @ManyToOne
    @JoinColumn(name = "scheduleId")
    private Schedules schedules;

    @ManyToOne
    @JoinColumn(name = "seatId")
    private Seats seat;

    @ManyToOne
    @JoinColumn(name = "categoryId")
    private TicketCategory ticketCategory;

    public Integer getTicketId() {
        return ticketId;
    }

    public void setTicketId(Integer ticketId) {
        this.ticketId = ticketId;
    }

    public Schedules getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedules schedules) {
        this.schedules = schedules;
    }

    public Seats getSeat() {
        return seat;
    }

    public void setSeat(Seats seat) {
        this.seat = seat;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }



    @Override
    public String toString() {
        return "Tickets{" +
                "ticketId=" + ticketId +
                ", schedules=" + schedules +
                ", seats=" + seat +
                ", ticketCategory=" + ticketCategory +
                '}';
    }


//    @Override
//    public String toString() {
//        return "Tickets{" +
//                "ticketId=" + ticketId +
//                '}';
//    }
}
