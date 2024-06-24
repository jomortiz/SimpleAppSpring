package com.sistema.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    private static final long SerialVersionUID= 1L;
    public Persona() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long document;
    private  String name;
    private String address;
    private String mail;

    public Long getDocument() {
        return document;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    public void setDocument(Long document) {
        this.document = document;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
