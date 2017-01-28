package OOP;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by madis on 28.01.2017.
 */
public class Kassa {
    String myyja;
    ArrayList tshekk = new ArrayList();

    public Kassa(String kassapidaja) {
        myyja = kassapidaja;
    }
    public void lisaToode(String toode){
        tshekk.add(toode);
    }
    public void eemaldaToode(String toode){
        tshekk.remove(toode);
    }
    public void prindiOstutsekk(){
        System.out.println(tshekk);
    }
    public void prindiKassapidajaNimi(){
        System.out.println(myyja);
    }

}
