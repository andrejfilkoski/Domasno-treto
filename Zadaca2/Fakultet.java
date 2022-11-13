public class Fakultet {
    String nazivNaFakultet;
    int brNaSmerovi;
    int brNaStudenti;
    String dekan;
    String sediste;

    public void zgolemiMetod(){
        System.out.println("Zgolemen broj na studenti: " + (this.brNaStudenti + 50));
    }

    public int namaliMetod(int namali){
        int namalenaVrednost = this.brNaStudenti - namali;
        return namalenaVrednost;
    }

    public void pecatiMetod(){
        System.out.println("Naziv na fakultetot: " + this.nazivNaFakultet + "\nSediste: " + this.sediste);
    }

    public Fakultet(String nazivNaFakultet, int brNaSmerovi, int brNaStudenti, String dekan, String sediste) {
        this.nazivNaFakultet = nazivNaFakultet;
        this.brNaSmerovi = brNaSmerovi;
        this.brNaStudenti = brNaStudenti;
        this.dekan = dekan;
        this.sediste = sediste;
    }
}
