public class MainClass {

    public static void main(String[] args){ 
        Brojach brojach = new Brojach();
        VrtenjeParicka vrtenjeParicka = new VrtenjeParicka();

        while (true) {
            brojach.BrojachMeni();

            vrtenjeParicka.pecatiE = brojach.pecati;
            vrtenjeParicka.izbrisiE = brojach.izbrisi;
            vrtenjeParicka.vrtenja = brojach.brNaVrtenje;

            vrtenjeParicka.Vrtenje();
        }

    }
}