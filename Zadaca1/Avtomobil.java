public class Avtomobil {

        String marka;
        String model;
        String boja;
        double km;
        int proizvodstvo;
        String registracija;

    public Avtomobil(String marka, String model, String boja, double km, int proizvodstvo, String registracija) {
        this.marka = marka;
        this.model = model;
        this.boja = boja;
        this.km = km;
        this.proizvodstvo = proizvodstvo;
        this.registracija = registracija;
    }

    public void pecatenje(){
        System.out.println("Marka: " + this.marka + "\nModel: " + this.model + "\nBoja: " + this.boja);
    }

    public double presmetkaKilometri(){
        double pKm = this.km + 1520.25;
        return pKm;
    }
}
