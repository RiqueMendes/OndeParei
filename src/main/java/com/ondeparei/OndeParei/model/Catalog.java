package com.ondeparei.OndeParei.model;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Catalog")

public class Catalog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCatalog;

    @NotNull
    @Size(min=3, max = 100)
    private String cat_name;

    @NotNull
    @Size(min=3, max=100)
    private String  author;

    @NotNull
    @Size(min=1, max=100)
    private String totalep;


    public long getIdCatalog() {
        return idCatalog;
    }

    public void setIdCatalog(long idCatalog) {
        this.idCatalog = idCatalog;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTotalep() {
        return totalep;
    }

    public void setTotalep(String totalep) {
        this.totalep = totalep;
    }



}
