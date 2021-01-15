package model;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movieId")
    private Integer movieId;
    private String name;
    private String category;
    private Integer durationInMinutes;
    private String description;
    @OneToMany(mappedBy = "movie")
    private Set<Schedules> schedules = new HashSet<>();
    public Integer getmovieId() {
        return movieId;
    }
    public void setmovieId(Integer movieId) {
        movieId = movieId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }
    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Set<Schedules> getSchedules() {
        return schedules;
    }
    public void setSchedules(Set<Schedules> schedules) {
        this.schedules = schedules;
    }
    @Override
    public String toString() {
        return "Movie{" +
                "MovieId=" + movieId +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", description='" + description + '\'' +
                '}';
    }
}