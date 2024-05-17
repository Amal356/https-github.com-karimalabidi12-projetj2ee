package com.example.miniprojet.model;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ClId;
    private String NumCl;
    private String NomCl;
    private String PrenomCl;
    private String AdresseCl;
    private String TelCl;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes;

    // Getters and setters
    public Long getClId() {
        return ClId;
    }

    public void setClId(Long clId) {
        ClId = clId;
    }

    public String getNumCl() {
        return NumCl;
    }

    public void setNumCl(String numCl) {
        NumCl = numCl;
    }

    public String getNomCl() {
        return NomCl;
    }

    public void setNomCl(String nomCl) {
        NomCl = nomCl;
    }

    public String getPrenomCl() {
        return PrenomCl;
    }

    public void setPrenomCl(String prenomCl) {
        PrenomCl = prenomCl;
    }

    public String getAdresseCl() {
        return AdresseCl;
    }

    public void setAdresseCl(String adresseCl) {
        AdresseCl = adresseCl;
    }

    public String getTelCl() {
        return TelCl;
    }

    public void setTelCl(String telCl) {
        TelCl = telCl;
    }

    public List<Commande> getCommandes() {
        return commandes;
    }

    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
