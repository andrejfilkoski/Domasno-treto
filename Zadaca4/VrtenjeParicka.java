import java.util.Random;

public class VrtenjeParicka{

    int[] brojNaPadnati = {0, 0}; // stranaNaParicka[0] = Pismo, stranaNaParicka[1] = Glava
    String[] stranaNaParickata = {"Pismo", "Glava"};
    boolean izbrisiE;
    boolean pecatiE;
    int vrtenja;

    public void Vrtenje(){

        if(izbrisiE || pecatiE){

            if(izbrisiE){

                brojNaPadnati[0] = 0;
                brojNaPadnati[1] = 0;
                izbrisiE = false;
                System.out.println("Podatocite za parickata se izbrisaja!");

            }else {

                System.out.println(stranaNaParickata[0] + ": " + brojNaPadnati[0]);
                System.out.println(stranaNaParickata[1] + "; " + brojNaPadnati[1]);
                pecatiE = false;

            }

        }else {

            Random rand = new Random();
            int dodaj;

            while (vrtenja != 0) {

                boolean dobienaStrana = rand.nextBoolean();
                if(!dobienaStrana){
                    dodaj = 0;
                }else{
                    dodaj = 1;
                }

                brojNaPadnati[dodaj]++;
                System.out.println("Se padna " + stranaNaParickata[dodaj] + "!");
                vrtenja--;

            }
        }
    }
}
