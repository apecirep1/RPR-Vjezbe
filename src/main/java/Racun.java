public class Racun {
    private Long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private Double stanjeRacuna;
    private Double prekoracenje;

    public Racun(Long brojRacuna, Osoba korisnikRacuna){
        this.stanjeRacuna = 0.0;
        this.korisnikRacuna = korisnikRacuna;
        this.brojRacuna = brojRacuna;
        this.prekoracenje = 0.0;
    }

    public boolean provjeriOdobrenjePrekoracenja(Double d){
        if(d < this.prekoracenje)return true;

        return false;

    }
    public boolean izvrsiUplatu(Double d){
        this.stanjeRacuna += d;
        return true;
    }

    public boolean izvrsiIsplatu(Double d){
        this.stanjeRacuna -= d;
        return true;
    }

    public Long getBrojRacuna() {
        return brojRacuna;
    }

    void odobriPrekoracenje(Double d){
        this.prekoracenje = d;
    }

}
