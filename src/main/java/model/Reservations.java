package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "reservations")
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservationId")
    private Integer reservationId;
    private Integer isPaid;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Clients clients;

    @ManyToOne
    @JoinColumn(name = "scheduleId")
    private Schedules schedules;

    @ManyToMany
    @JoinTable(
            name = "reservation_seat",
            joinColumns = {@JoinColumn(name = "reservationId")},
            inverseJoinColumns = {@JoinColumn(name = "seatId")}
    )
    private Set<Seats> seats = new HashSet<>();

    public Integer getReservationId() {
        return reservationId;
    }

    public void setReservationId(Integer reservationId) {
        this.reservationId = reservationId;
    }

    public Integer getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(Integer isPaid) {
        this.isPaid = isPaid;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Set<Seats> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seats> seats) {
        this.seats = seats;
    }

    public Schedules getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedules schedules) {
        this.schedules = schedules;
    }

    @Override
    public String toString() {
        return "Reservations{" +
                "reservationId=" + reservationId +
                ", isPaid=" + isPaid +
                ", clients=" + clients +
                ", seats=" + seats +
                '}';
    }
}
