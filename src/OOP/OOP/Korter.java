package OOP;

/**
 * Created by madis on 28.01.2017.
 */
public class Korter {

    int mahutavus;
    int kylalistearv;
    int paljuVeelMahub;

    public Korter(int mahutab){
        mahutavus = mahutab;
    }

    public void saabus(String kylaline){
        if (kylalistearv < mahutavus){
            kylalistearv +=1;
            System.out.println("Hetkel on inimesi " + kylalistearv);
        }
        else {
            System.out.println("Rohkem külalisi ei mahu!");
    }}

    public void lahkus(String kylaline){
        kylalistearv -=1;
        System.out.println("Keegi lahkus, inimesi on järel " + kylalistearv);
    }

    public void prindiPaljuVeelMahub(){
        paljuVeelMahub = mahutavus-kylalistearv;
        System.out.println("Veel mahub " + paljuVeelMahub);
    }

    public void prindiKylalisteArv(){
        System.out.println("Kokku on praegu külalisi " + kylalistearv);
    }
}
