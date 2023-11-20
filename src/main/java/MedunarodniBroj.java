package ba.unsa.etf.rpr;

public class MedunarodniBroj extends TelefonskiBroj {

    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    @Override

    public String ispisi() {
        return drzava + "/" + broj;
    }

    /***
     *Koristi se XOR operator za kombinovanje hash vrijednosti drzave i broja
     * @return vraća hash code na osnovu broja i drzave
     */
    @Override
    public int hashCode() {
        return drzava.hashCode()^broj.hashCode();
    }
}
