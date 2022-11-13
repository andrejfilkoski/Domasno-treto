import java.util.Scanner;

public class MainClass {

    public static void main(String[] args){
        Avtomobil avtomobil = new Avtomobil("Volkswagen", "GOLF 7R", "Crna", 2343, 2022, "BT-546-DF");

        avtomobil.pecatenje();
        System.out.println(avtomobil.presmetkaKilometri());
    }
}
