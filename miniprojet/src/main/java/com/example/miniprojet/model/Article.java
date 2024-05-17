package com.example.miniprojet.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ArtId;
    private String Codeart;
    private String Desart;
    private String Coleur;
    private double Puart;
    private int Otestock;

    @ManyToMany(mappedBy = "articles")
    private List<Commande> commandes;

    // Getters and setters
    public Long getArtId() {
        return ArtId;
    }

    public void setArtId(Long artId) {
        ArtId = artId;
    }

    public String getCodeart() {
        return Codeart;
    }

    public void setCodeart(String codeart) {
        Codeart = codeart;
    }

    public String getDesart() {
        return Desart;
    }

    public void setDesart(String desart) {
        Desart = desart;
    }

    public String getColeur() {
        return Coleur;
    }

    public void setColeur(String coleur) {
        Coleur = coleur;
    }

    public double getPuart() {
        return Puart;
    }

    public void setPuart(double puart) {
        Puart = puart;
    }

    public int getOtestock() {
        return Otestock;
    }

    public void setOtestock(int otestock) {
        Otestock = otestock;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
