package ba.unsa.etf.rpr;

import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Imenik imenik = new Imenik();
        Scanner scanner = new Scanner(System.in);

        Grad sarajevo = Grad.SARAJEVO;
        FiksniBroj fiksniBroj = new FiksniBroj(sarajevo, "123-456");
        System.out.println(fiksniBroj.ispisi()); // Ispisat će "033/123-456"


        MobilniBroj mobilniBroj = new MobilniBroj(61, "987654");
        System.out.println(mobilniBroj.ispisi()); // Ispisat će "061/987-654"

        MedunarodniBroj medunarodniBroj = new MedunarodniBroj("+387", "123-456");
        System.out.println(medunarodniBroj.ispisi()); // Ispisat će "+387/123-456"

        while (true) {
            System.out.println("\nOdaberite opciju: ");
            System.out.println("1. Dodaj osobu u imenik");
            System.out.println("2. Dohvati broj osoba prema imenu");
            System.out.println("3. Dohvati ime osobe prema broju");
            System.out.println("4. Dohvati osobe čije ime počinje na slovo");
            System.out.println("5. Dohvati osobe iz određenog grada");
            System.out.println("6. Dohvati brojeve osoba iz određenog grada");
            System.out.println("7. Izlaz");

            int opcija = scanner.nextInt();
            scanner.nextLine();

            switch(opcija){

                case 1:
                    System.out.println("Unesite ime: ");
                    String ime = scanner.nextLine();
                    System.out.println("Unesite broj (format: '061/123-456' za mobilni ili '033/123-456' za fiskni: ");
                    String broj = scanner.nextLine();

                    try {
                        TelefonskiBroj telefonskiBroj = parseBroj(broj);
                        imenik.dodaj(ime, telefonskiBroj);
                        System.out.println("Osoba dodana u imenik.");

                    }catch(IllegalArgumentException e){
                        System.out.println("Neispravan format broja. Molimo unesite ispravan broj.");

                    }

                    break;

                case 2:
                    System.out.println("Unesite ome osobe: ");
                    String imeOsobe = scanner.nextLine();
                    System.out.println(imenik.dajBroj(imeOsobe));
                    break;

                case 3:
                    System.out.println("Unesite broj osobe (format: '061/123-456' ili 033/123-456): ");
                    String brojOsobe = scanner.nextLine();
                    TelefonskiBroj telefonskiBroj = parseBroj(brojOsobe);
                    System.out.println(imenik.dajIme(telefonskiBroj));
                    break;

                case 4:
                    System.out.println("Unesite slovo za pretragu: ");
                    char slovo = scanner.next().charAt(0);
                    System.out.println(imenik.naSlovo(slovo));
                    break;
                case 5:
                    System.out.println("Unesite grad za pretragu (npr. SARAJEVO): ");
                    Grad grad = Grad.valueOf(scanner.next().toUpperCase());
                    Set<String> imenaIzGrada = imenik.izGrada(grad);
                    for(String imeIPrezime: imenaIzGrada){
                        System.out.println(imeIPrezime);
                    }
                    break;
                case 6:
                    System.out.println("Unesite grad za pretragu (npr. SARAJEVO): ");
                    Grad gradZaBrojeve = Grad.valueOf(scanner.next().toUpperCase());
                    Set<TelefonskiBroj> brojeviIzGrada = imenik.izGradaBrojevi(gradZaBrojeve);
                    for(TelefonskiBroj brojOsobaIzGrada: brojeviIzGrada){
                        System.out.println(brojOsobaIzGrada.ispisi());
                    }
                    break;
                case 7:
                    System.out.println("Izlaz iz programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Neispravna opcija. Molimo odaberite ispravnu opciju.");

            }
        }
    }

    /**
     * Metoda za parsiranje broja u odgovarajući TelefonskiBroj objekt
     */

    private static TelefonskiBroj parseBroj(String broj){
        if(broj.matches("\\d{3}/\\d{3}-\\d{3}")){
            return new FiksniBroj(Grad.valueOf(broj.substring(0, 3)),broj.substring(4));
        }
        else if(broj.matches("\\d{3}/\\d{3}-\\d{3}")){
            return new MobilniBroj(Integer.parseInt(broj.substring(0, 3)),broj.substring(4));
        }
        else {
            throw new IllegalArgumentException("Neispravan format broja.");
        }
    }
}