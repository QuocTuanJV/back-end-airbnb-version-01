package com.example.mydemo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Home {
    @Id
    @GenericGenerator(name="itemIdGen" , strategy="increment")
    @GeneratedValue(generator="itemIdGen")
    @Column(name = "id_home")
    private Long id;

    private String name;
    private Double price;
    private String image;
    private String address;
    private String description;
    private int numberBath;
    private int numberBad;
    private int statusHome;

    @Column(name = "cate_room_id")
    private Long cateRoom;

    @Column(name = "cate_home_id")
    private Long cateHome;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_home", referencedColumnName = "id_home")
    private Booking booking;

    @OneToMany(cascade =  CascadeType.ALL)
    @JoinColumn(name = "id_home", referencedColumnName = "id_home")
    private List<Comment> comments;


    public Home(){

    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCateRoom() {
        return cateRoom;
    }

    public void setCateRoom(Long cateRoom) {
        this.cateRoom = cateRoom;
    }

    public Long getCateHome() {
        return cateHome;
    }

    public void setCateHome(Long cateHome) {
        this.cateHome = cateHome;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberBath() {
        return numberBath;
    }

    public void setNumberBath(int numberBath) {
        this.numberBath = numberBath;
    }

    public int getNumberBad() {
        return numberBad;
    }

    public void setNumberBad(int numberBad) {
        this.numberBad = numberBad;
    }

    public int getStatusHome() {
        return statusHome;
    }

    public void setStatusHome(int statusHome) {
        this.statusHome = statusHome;
    }
}
