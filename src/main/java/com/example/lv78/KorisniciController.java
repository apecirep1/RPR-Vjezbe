package com.example.lv78;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class KorisniciController {
    private KorisniciModel model;
    public ListView<Korisnik> listaKorisnika;
    public TextField fldIme;
    public TextField fldPrezime;
    public TextField fldMail;
    public TextField fldUesrname;
    public TextField fldLozinka;

    @FXML
    public void initialize() {
        fldIme.textProperty().bindBidirectional(model.getTrenutniKorisnik().imeProperty());
        fldPrezime.textProperty().bindBidirectional(model.getTrenutniKorisnik().prezimeProperty());
        fldMail.textProperty().bindBidirectional(model.getTrenutniKorisnik().mailProperty());
        fldUesrname.textProperty().bindBidirectional(model.getTrenutniKorisnik().usernameProperty());
        fldLozinka.textProperty().bindBidirectional(model.getTrenutniKorisnik().lozinkaProperty());
        listaKorisnika.setItems(model.getKorisnici());
    }

    public KorisniciController(KorisniciModel m) {
        model = m;
    }
}