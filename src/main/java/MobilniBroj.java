package ba.unsa.etf.rpr;

/***
 * BH Mobile: 60
 * Happy: 60
 * BH Mobile: 61
 * BH Mobile: 62
 * ERONET: 63
 * Haloo: 64
 * m:tel: 65
 * m:tel: 66
 * Izi mobil: 67
 */

public class MobilniBroj extends TelefonskiBroj{

    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        if(mobilnaMreza < 60 || mobilnaMreza > 67)
            throw new IllegalArgumentException("Neispravna oznaka mobilne mreže.");
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    @Override

    public String ispisi()
    {
        return "0" + mobilnaMreza + "/" + broj.substring(0, 3)+ "-" + broj
                .substring(3);
    }

    @Override

    public int hashCode(){
        return mobilnaMreza * 31 + broj
                .hashCode();
    }
}
