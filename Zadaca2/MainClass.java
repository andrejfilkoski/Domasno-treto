import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        Fakultet fakultet = new Fakultet("FIKT", 9, 120, "Aleksandar", "Bitola");

        Fakultet fakultet1 = new Fakultet("TFB", 8, 100,"Stefce", "Bitola");

        fakultet.pecatiMetod();
        fakultet.zgolemiMetod();
        System.out.println("Namalen broj na studenti: " + fakultet.namaliMetod(20));

        System.out.println("\n");

        fakultet1.pecatiMetod();
        fakultet1.zgolemiMetod();
        System.out.println("Namalen broj na studenti: " + fakultet1.namaliMetod(20));

    }
}