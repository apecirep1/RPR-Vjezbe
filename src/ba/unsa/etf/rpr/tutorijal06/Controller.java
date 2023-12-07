package ba.unsa.etf.rpr.tutorijal06;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;



public class Controller {

    private String izlaz="";
    public TextField ekran;
    public Button posto;
    public Button podjeljeno;
    public Button puta;
    public Button sedam;
    public Button osam;
    public Button devet;
    public Button cetiri;
    public Button pet;
    public Button minus;
    public Button sest;
    public Button jedan;
    public Button dva;
    public Button tri;
    public Button plus;
    public Button jednako;
    public Button nula;
    public Button tacka;

    public void podjeljenoAction(ActionEvent actionEvent) {
        izlaz += "/";
        ekran.setText(izlaz);
    }

    public void putaAction(ActionEvent actionEvent) {
        izlaz += "*";
        ekran.setText(izlaz);
    }

    public void sedamAction(ActionEvent actionEvent) {
        izlaz += "7";
        ekran.setText(izlaz);
    }

    public void osamAction(ActionEvent actionEvent) {
        izlaz += "8";
        ekran.setText(izlaz);
    }

    public void devetAction(ActionEvent actionEvent) {
        izlaz += "9";
        ekran.setText(izlaz);
    }

    public void cetiriAction(ActionEvent actionEvent) {
        izlaz += "4";
        ekran.setText(izlaz);
    }

    public void petAction(ActionEvent actionEvent) {
        izlaz += "5";
        ekran.setText(izlaz);
    }

    public void minusAction(ActionEvent actionEvent) {
        izlaz += "-";
        ekran.setText(izlaz);
    }

    public void sestAction(ActionEvent actionEvent) {
        izlaz += "6";
        ekran.setText(izlaz);
    }

    public void jedanAction(ActionEvent actionEvent) {
        izlaz += "1";
        ekran.setText(izlaz);
    }

    public void dvaAction(ActionEvent actionEvent) {
        izlaz += "2";
        ekran.setText(izlaz);
    }

    public void triAction(ActionEvent actionEvent) {
        izlaz += "3";
        ekran.setText(izlaz);
    }

    public void plusAction(ActionEvent actionEvent) {
        izlaz += "+";
        ekran.setText(izlaz);
    }

    public void jedankoAction(ActionEvent actionEvent) {
        izlaz += "=";
        ekran.setText(izlaz);
    }

    public void nulaAction(ActionEvent actionEvent) {
        izlaz += "0";
        ekran.setText(izlaz);
    }

    public void tackaAction(ActionEvent actionEvent) {
        izlaz += ".";
        ekran.setText(izlaz);
    }
}
