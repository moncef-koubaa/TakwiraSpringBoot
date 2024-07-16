package com.moncef.rest.webservices.restful_web_services.user;

import com.moncef.rest.webservices.restful_web_services.reservation.Reservation;
import jakarta.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.HashSet;
import java.util.Set;


@Document(collection = "users")
public class User {
    @Id
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Set<Reservation> reservations = new HashSet<>();
    // getters and setters
    public User() {
    }
    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }
    String getEmail() {
        return email;
    }
    void setEmail(String email) {
        this.email = email;
    }
    String getPassword() {
        return password;
    }
    void setPassword(String password) {
        this.password = password;
    }
    Set<Reservation> getReservations() {
        return reservations;
    }
    void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
