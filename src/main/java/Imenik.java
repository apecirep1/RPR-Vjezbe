package ba.unsa.etf.rpr;

import java.util.*;

/**
 * Klasa Imenik koja omogućava pretraživanje brojeva koristeći HashMap
 *
 * @author Ilhana
 */

public class Imenik {

    private HashMap<String, TelefonskiBroj> imenik = new HashMap<>();

    public Imenik(HashMap<String, TelefonskiBroj> imenik) {
        this.imenik = imenik;
    }

    /**
     * Dodavanje osobe u imenik
     */

    public void dodaj(String ime, TelefonskiBroj broj){
        imenik.put(ime, broj);
    }

    /**
     * Dohvaćanje broja osobe prema imenu
     */

    public String dajBroj(String ime){
        TelefonskiBroj broj = imenik.get(ime);
        if(broj != null) {
            return broj.ispisi();
        }
        return null;
    }

    public String dajIme(TelefonskiBroj broj){
        for(Map.Entry<String,TelefonskiBroj> entry: imenik.entrySet())
        {
            if(entry.getValue().equals(broj)) {
                return entry.getKey();
            }
        }
        return "Broj nije pronađen u imeniku.";
    }
    /**
     * Vraća sve brojeve u tel.imeniku za osobe čije ime počinje na slovo s u formatu:
     * 1. Ime Prezime - broj
     *
     */
    public String naSlovo(char s){

        StringBuilder rez = new StringBuilder();
        int brojac = 1;
        for(Map.Entry<String,TelefonskiBroj> entry: imenik.entrySet())
        {
            String ime = entry.getKey();
            if(ime.charAt(0) == s){
                rez.append(brojac).append(". ").append(ime).append(" - ").append(entry.getValue().ispisi()).append("\n");
                brojac++;
            }
        }
        return rez.toString();
    }

    /**
     * Dohvaćanje imena i prezimena osoba iz pdređenog grada, sortirane abecedno
     *
     * @return imena
     */
    public Set<String> izGrada(Grad g) {
        TreeSet<String> imena = new TreeSet<>();
        for (Map.Entry<String, TelefonskiBroj> entry : imenik.entrySet()) {
            if (entry.getValue() instanceof FiksniBroj) {
                FiksniBroj fiksniBroj = (FiksniBroj) entry.getValue();
                if (fiksniBroj.getGrad() == g) {
                    imena.add(entry.getKey());
                }
            }
        }
        return imena;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        TreeSet<TelefonskiBroj> brojevi = new TreeSet<>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj broj1, TelefonskiBroj broj2) {
                return broj1.ispisi().compareTo(broj2.ispisi());
            }
        });

        for(TelefonskiBroj broj: imenik.values()){
            if(broj instanceof FiksniBroj){
                FiksniBroj fiksniBroj = (FiksniBroj) broj;
                if(fiksniBroj.getGrad() == g){
                    brojevi.add(broj);
                }
            }
        }
        return brojevi;
    }





}