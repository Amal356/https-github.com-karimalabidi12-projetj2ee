package com.example.miniprojet.model;
import jakarta.persistence.*;

@Entity

public class Contenir {
    @Id
    private Long artId;

    @Id
    private Long comId;

    private Integer qteCom;

    @ManyToOne
    @JoinColumn(name = "artId", insertable = false, updatable = false)
    private Article article;

    @ManyToOne
    @JoinColumn(name = "comId", insertable = false, updatable = false)
    private Commande commande;

    public Long getArtId() {
        return artId;
    }

    public void setArtId(Long artId) {
        this.artId = artId;
    }

    public Long getComId() {
        return comId;
    }

    public void setComId(Long comId) {
        this.comId = comId;
    }

    public Integer getQteCom() {
        return qteCom;
    }

    public void setQteCom(Integer qteCom) {
        this.qteCom = qteCom;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public Commande getCommande() {
        return commande;
    }

    public void setCommande(Commande commande) {
        this.commande = commande;
    }
}