import java.util.ArrayList;
import java.util.List;

public class Banka {
    private List<Korisnik> korisnici = new ArrayList<>();
    private List<Uposlenik> uposlenici = new ArrayList<>();
    private Long brojRacuna;

    Banka(){}

    Korisnik kreirajNovogKorisnika(String ime, String prezime){
        Korisnik k = new Korisnik(ime,prezime);
        return k;
    }

    Uposlenik kreirajNovogUposlenika(String ime, String prezime){
        Uposlenik u = new Uposlenik(ime,prezime);
        return u;
    }

    Racun kreirajRacunZaKorisnika(Korisnik k){
        Racun r = new Racun(k.getRacun().getBrojRacuna(), k);
        return r;
    }
}
