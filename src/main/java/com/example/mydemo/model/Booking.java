package com.example.mydemo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table
@Inheritance(strategy =  InheritanceType.SINGLE_TABLE)
public class Booking {
    @Id
    @GenericGenerator(name="itemIdGen" , strategy="increment")
    @GeneratedValue(generator="itemIdGen")
    @Column(name = "id_booking")
    private Long id;

    private Date timeBook;

    private Date timeBookOut;

    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "id_home")
    private Long idHome;

    private Long statusBook;

    public Booking(){

    }

    public Long getStatusBook() {
        return statusBook;
    }

    public void setStatusBook(Long statusBook) {
        this.statusBook = statusBook;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTimeBook() {
        return timeBook;
    }

    public void setTimeBook(Date timeBook) {
        this.timeBook = timeBook;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public Long getIdHome() {
        return idHome;
    }

    public void setIdHome(Long idHome) {
        this.idHome = idHome;
    }

    public Date getTimeBookOut() {
        return timeBookOut;
    }

    public void setTimeBookOut(Date timeBookOut) {
        this.timeBookOut = timeBookOut;
    }
}
