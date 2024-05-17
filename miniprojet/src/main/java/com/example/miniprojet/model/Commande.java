package com.example.miniprojet.model;

import jakarta.persistence.*;
import java.util.Date;

import java.util.List;



@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ComId;
    private String Numcom;
    private Date Datecom;

    @ManyToOne
    @JoinColumn(name = "ClId")
    private Client client;

    @ManyToMany
    @JoinTable(
            name = "commande_article",
            joinColumns = @JoinColumn(name = "com_id"),
            inverseJoinColumns = @JoinColumn(name = "art_id")
    )
    private List<Article> articles;

    // Getters and setters
    public Long getComId() {
        return ComId;
    }

    public void setComId(Long comId) {
        ComId = comId;
    }

    public String getNumcom() {
        return Numcom;
    }

    public void setNumcom(String numcom) {
        Numcom = numcom;
    }

    public Date getDatecom() {
        return Datecom;
    }

    public void setDatecom(Date datecom) {
        Datecom = datecom;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }
}
