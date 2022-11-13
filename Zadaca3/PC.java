public class PC {

    int memorija;
    String tipNaMemorija;
    int ssd;
    String golemina = "GB";

    public PC() {
        this.memorija = 2;
        this.tipNaMemorija = "DDR4";
        this.ssd = 256;
    }

    public void promenaNaMemorija(int zgolemiMemorija, int novSSD){
        int predhodnaMemorija = memorija;
        int predhodenSSD = ssd;

        memorija += zgolemiMemorija;
        ssd = novSSD;

        System.out.println("Memorijata bese " + predhodnaMemorija + golemina + ", sega iznesuva " + memorija + golemina + ".");
        System.out.println("Tipot na memorija e " + tipNaMemorija + ".");
        System.out.println("SSD ima golemina od " + ssd + golemina + ". Prethodno iznesuvase " + predhodenSSD + golemina + ".");
    }
}
