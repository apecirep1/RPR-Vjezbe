public class Korisnik extends Osoba{
    private Racun racun;

    public Korisnik(String ime, String prezime){
        super(ime,prezime);
    }

    public void dodajRacun(Racun racun){
        this.racun = racun;
    }

    public Racun getRacun() {
        return racun;
    }
}
