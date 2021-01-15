package model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "rooms")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")

    private Integer roomId;
    private Integer number;
    private Integer maxSeats;
    private String Location;

    @OneToMany(mappedBy = "room")
    private Set<Seats> seats=new HashSet<>();

    @OneToMany(mappedBy = "room")
    private Set<Schedules> schedules=new HashSet<>();

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(Integer maxSeats) {
        this.maxSeats = maxSeats;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Set<Seats> getSeats() {
        return seats;
    }

    public void setSeats(Set<Seats> seats) {
        this.seats = seats;
    }

    public Set<Schedules> getSchedules() {
        return schedules;
    }

    public void setSchedules(Set<Schedules> schedules) {
        this.schedules = schedules;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", number=" + number +
                ", maxSeats=" + maxSeats +
                ", Location='" + Location + '\'' +
                '}';
    }
}
