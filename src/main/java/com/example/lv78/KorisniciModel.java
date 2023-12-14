package com.example.lv78;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class KorisniciModel {
    private ObservableList<Korisnik> korisnici = FXCollections.observableArrayList();
    private ObjectProperty<Korisnik> trenutniKorsnik = new SimpleObjectProperty<>();
    public ObjectProperty<Korisnik> trenutniKorisnikProperty() {
        return trenutniKorsnik;
    }
    public Korisnik getTrenutniKorisnik() {
        return trenutniKorsnik.get();
    }
    public void setTrenutniKorsnik(Korisnik k) {
        trenutniKorsnik.set(k);
    }
    public ObservableList<Korisnik> getKorisnici() {
        return korisnici;
    }

    void napuni() {
        korisnici.add(new Korisnik("korisnik1", "prezime1", "mail1", "username1", "lozinka1"));
        korisnici.add(new Korisnik("korisnik2", "prezime2", "mail2", "username2", "lozinka2"));
        korisnici.add(new Korisnik("korisnik3", "prezime3", "mail3", "username3", "lozinka3"));
    }
}
