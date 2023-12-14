package com.example.lv78;

import javafx.beans.property.SimpleStringProperty;

public class Korisnik {
    private SimpleStringProperty ime;
    private SimpleStringProperty prezime;
    private SimpleStringProperty mail;
    private SimpleStringProperty username;
    private SimpleStringProperty lozinka;

    public Korisnik(String a, String b, String c, String d, String e) {
        ime = new SimpleStringProperty(a);
        prezime = new SimpleStringProperty(b);
        mail = new SimpleStringProperty(c);
        username = new SimpleStringProperty(d);
        lozinka = new SimpleStringProperty(e);

    }

    public SimpleStringProperty imeProperty() {
        return ime;
    }
    public String getIme() {
        return ime.get();
    }
    public SimpleStringProperty prezimeProperty() {
        return prezime;
    }
    public String getPrezime() {
        return prezime.get();
    }
    public SimpleStringProperty mailProperty() {
        return mail;
    }
    public String getMail() {
        return mail.get();
    }
    public SimpleStringProperty usernameProperty() {
        return username;
    }
    public String getUsername() {
        return username.get();
    }
    public SimpleStringProperty lozinkaProperty() {
        return lozinka;
    }
    public String getLozinka() {
        return lozinka.get();
    }
    public void setIme(String ime) {
        this.ime.set(ime);
    }
    public void setPrezime(String prezime) {
        this.prezime.set(prezime);
    }
    public void setEMail(String mail) {
        this.mail.set(mail);
    }
    public void setUsername(String username) {
        this.username.set(username);
    }
    public void setLozinka(String lozinka) {
        this.lozinka.set(lozinka);
    }
}
