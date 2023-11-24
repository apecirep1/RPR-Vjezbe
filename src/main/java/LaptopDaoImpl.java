package ba.unsa.etf.rpr;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LaptopDaoImpl implements LaptopDao {
    private List<Laptop> laptopi;

    public LaptopDaoImpl() {
        this.laptopi = new ArrayList<>();
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("laptopi.dat", true))) {
            outputStream.writeObject(laptop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Laptop getLaptop(String procesor) {
        for (Laptop laptop : laptopi) {
            if (laptop.getProcesor().equals(procesor)) {
                return laptop;
            }
        }
        return null;
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi.addAll(laptopi);
    }

    @Override
    public void vratiPodatkeIzDatoteke() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("laptopi.dat"))) {
            while (true) {
                Laptop laptop = (Laptop) inputStream.readObject();
                laptopi.add(laptop);
            }
        } catch (EOFException e) {
            // Kraj datoteke, dobro je
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

