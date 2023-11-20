package ba.unsa.etf.rpr;

public enum Grad {

    SARAJEVO("033"),
    TUZLA("035"),
    ZENICA("032"),
    JAJCE("030"),
    ODZAK("031"),
    LIVNO("034"),
    MOSTAR("036"),
    BIHAC("037"),
    GORAZDE("038"),
    ŠIROKIBRIJEG("039"),
    BRCKO("049"),
    MRKONJICGRAD("050"),
    BANJALUKA("051"),
    PRIJEDOR("052"),
    DOBOJ("053"),
    SAMAC("054"),
    BIJELJINA("055"),
    ZVORNIK("056"),
    PALE("057"),
    FOCA("058"),
    TREBINJE("059")
    ;

    private String pozivniBroj;

    Grad(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String toString()
    {
        return pozivniBroj;
    }
}
