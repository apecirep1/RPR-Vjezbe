public class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
    }
    public Osoba(){}

    public String toString(){
        String s="";
        s += this.ime;
        s += " ";
        s += this.prezime;
        return s;
    }
}
