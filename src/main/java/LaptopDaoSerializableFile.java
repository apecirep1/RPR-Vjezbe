package ba.unsa.etf.rpr;

import java.io.*;
import java.util.ArrayList;

public class LaptopDaoSerializableFile implements LaptopDao, Serializable {

    private File file;
    private ArrayList<Laptop> laptopi;

    public LaptopDaoSerializableFile(File file) {
        this.file = file;
        this.laptopi = new ArrayList<>();
    }

    @Override
    public void dodajLaptopUListu(Laptop laptop) {
        laptopi.add(laptop);
    }

    @Override
    public void dodajLaptopUFile(Laptop laptop) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file, true))) {
            outputStream.writeObject(laptop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Laptop getLaptop(String procesor) throws NeodgovarajuciProcesorException {
        for (Laptop laptop : laptopi) {
            if (laptop.getProcesor().equals(procesor)) {
                return laptop;
            }
        }
        throw new NeodgovarajuciProcesorException("Nema laptopa sa zadanim procesorom");
    }

    @Override
    public void napuniListu(ArrayList<Laptop> laptopi) {
        this.laptopi = laptopi;
    }

    @Override
    public void vratiPodatkeIzDatoteke() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                Laptop laptop = (Laptop) inputStream.readObject();
                laptopi.add(laptop);
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("laptopi.txt");
        LaptopDaoSerializableFile daoSerializableFile = new LaptopDaoSerializableFile(file);

        Laptop laptop1 = new Laptop("HP", "Envy", 1500.0, 16, 512, 0, "Intel i7", "Nvidia GTX 1650", 15.6);
        Laptop laptop2 = new Laptop("Dell", "XPS", 2000.0, 32, 1, 1000, "Intel i9", "Nvidia RTX 3080", 17.0);

        daoSerializableFile.dodajLaptopUFile(laptop1);
        daoSerializableFile.dodajLaptopUFile(laptop2);

        try {
            Laptop foundLaptop = daoSerializableFile.getLaptop("Intel i7");
            System.out.println("Found laptop: " + foundLaptop);
        } catch (NeodgovarajuciProcesorException e) {
            System.out.println(e.getMessage());
        }
    }

}
