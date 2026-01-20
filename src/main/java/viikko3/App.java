package viikko3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Scanner sc = new Scanner(System.in);

        Safe safe = new Safe("0000");


        boolean exit = false;
        while(!exit) {
        System.out.println("1) Aseta PIN-koodi");
        System.out.println("2) Lisää tietoja kansioon");
        System.out.println("3) Listaa tiedot kansiosta");
        System.out.println("0) Lopeta ohjelma");

        if(sc.hasNext()) {
            int i = 0;
            String stringInput = sc.nextLine();
            i = Integer.parseInt(stringInput);

            switch (i) {
                case 1:
                    System.out.println("Anna uusi PIN-koodi");
                    String code = sc.nextLine();
                    safe.setPin(code);
                    break;
                case 2:
                    System.out.println("Anna kansioon lisättävä tieto:");
                    String newThink = sc.nextLine();
                    safe.addSafe(newThink);
                    break;
                case 3:
                    System.out.println("Anna PIN-koodi:");
                    String safeCode = sc.nextLine();
                    ArrayList<String> folder = safe.getlist(safeCode);
                    int indeksi = 0;
                    do {
                        System.out.println(folder.get(indeksi));
                        indeksi++;
                    } while(folder.size() > indeksi);
                    break;
                case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                    exit = true;
                    break;
                default:
                    System.out.println("Tuntematon valinta, yritä uudestaan");
                    break;
            }

        
        }
        }






        sc.close();

    }

}

