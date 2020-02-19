package com.example.mydemo.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy= InheritanceType.TABLE_PER_CLASS)
public class Comment {
    @Id
    @GenericGenerator(name="itemIdGen" , strategy="increment")
    @GeneratedValue(generator="itemIdGen")
    @Column(name = "id_comment")
    private Long id;

    @Column(name = "id_home")
    private Long idHome;

    @Column(name = "id_user")
    private Long idUser;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdHome() {
        return idHome;
    }

    public void setIdHome(Long idHome) {
        this.idHome = idHome;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
