package ba.unsa.etf.rpr;

/**
 * Klasa koja nasljeđuje klasu TelefonskiBroj
 * Primjer broja 033/123-456
 * @author Ilhana
 */

public class FiksniBroj extends TelefonskiBroj {

    /**
     * Parametri klase
     */
    private Grad grad;
    private String broj;

    /**
     *Konstruktor klase
     */
    public FiksniBroj(Grad grad, String broj) {
        this.grad = grad;
        this.broj = broj;
    }

    /**
     * Funkcija ispisi koja ispisuje broj u obliku "033/123-456"
     */
    @Override

    public String ispisi(){

        return grad.toString() + "/" + broj;
    }

    /**
     *Metoda za generisanje hash koda od grada i broja
     * @return hash kod stvoren od broja i pozicije grada u enumeraciji gradova
     */
    @Override

    public int hashCode() {
        return grad.ordinal() * 31 + broj.hashCode();
    }

    /**
     * Getter za parametar grad
     * @return grad
     */
    public Grad getGrad(){
        return grad;
    }
}

