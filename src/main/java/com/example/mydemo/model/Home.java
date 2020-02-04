package com.example.mydemo.model;

import javax.persistence.*;

@Entity
@Table
public class Home {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Double price;
    private String image;
    private String address;
    private String description;
    private int numberBath;
    private int numberBad;

//    @ManyToOne() ver-01
//    @ManyToOne(cascade = CascadeType.ALL) ver-02
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cate_room_id")
    private CategoryRoom cateRoom;

//    @ManyToOne()
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "home_room_id")
    private CategoryHome cateHome;

    public Home(){

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

    public CategoryRoom getCateRoom() {
        return cateRoom;
    }

    public void setCateRoom(CategoryRoom cateRoom) {
        this.cateRoom = cateRoom;
    }

    public CategoryHome getCateHome() {
        return cateHome;
    }

    public void setCateHome(CategoryHome cateHome) {
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
}
