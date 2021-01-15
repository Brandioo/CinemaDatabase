package model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "ticketcategories")
public class TicketCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticketCategoryId")
    private Integer ticketCategoryId;
    private String type;
    private Integer price;

    @OneToMany(mappedBy = "ticketCategory")
    private Set<Tickets> tickets=new HashSet<>();

    public Integer getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(Integer ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Set<Tickets> getTickets() {
        return tickets;
    }

    public void setTickets(Set<Tickets> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "TicketCategory{" +
                "ticketCategoryId=" + ticketCategoryId +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
