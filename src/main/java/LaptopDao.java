package ba.unsa.etf.rpr;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface LaptopDao {

    void dodajLaptopUListu(Laptop laptop);
    void dodajLaptopUFile(Laptop laptop);
    Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException;
    void napuniListu(ArrayList<Laptop> laptopi);
    void vratiPodatkeIzDatoteke();

}
