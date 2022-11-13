import java.util.Scanner;

public class Brojach{

    int brNaVrtenje = 1;
    boolean izbrisi;
    boolean pecati;

    public void BrojachMeni(){

        Scanner scanner = new Scanner(System.in);
        int odgovor = 0;

        izbrisi = false;
        pecati = false;

        while (odgovor != 1){

            System.out.println("\t~~Vrtenja: " + brNaVrtenje + "~~");

            System.out.println("1. Igraj" +
                    "\n2. Zgolemi vrtenja" +
                    "\n3. Restartiraj vrtenja" +
                    "\n4. Izbrisi predhodni podatoci za parickata" +
                    "\n5. Ispecati gi podatocite na parickata" +
                    "\n6. Iskluci");

            odgovor = scanner.nextInt();

            switch (odgovor){

                case 2:
                    brNaVrtenje++;
                    System.out.println("Brojot na vrtenja se zgolemi!");
                    break;

                case 3:
                    brNaVrtenje = 1;
                    System.out.println("Brojot na vrtenja se vrati na 1!");
                    break;

                case 4:
                    izbrisi = true;
                    odgovor = 1;
                    break;

                case 5:
                    pecati = true;
                    odgovor = 1;
                    break;

                case 6:
                    System.out.println("\nProgramata se isklucuva...\n");
                    System.exit(1);

                default: break;

            }
        }
    }
}
