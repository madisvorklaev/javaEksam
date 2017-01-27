package OOP;

import java.util.ArrayList;

/**
 * Created by madis on 22.01.2017.
 */
public class Sonaraamat {
    String raamatuKeel;
    String sona;
    String vaste[];
    String taht;
    ArrayList sonad = new ArrayList();


    public Sonaraamat(String raamatuKeel){
        this.raamatuKeel = raamatuKeel;
    }

    public void sisestaSona(String sona){
        this.sona = sona;
        sonad.add(sona);
    }

    public String[] otsiEsimeseTaheJargi(String taht){
        String otsitav;
        for (int i = 0; i <sonad.size() ; i++) {
            otsitav = (String) sonad.get(i);
          String otsitavTaht = String.valueOf(otsitav.charAt(0));
            if (otsitavTaht.equals(taht)){
                vaste[0] = otsitav;
            }
        }
        return vaste;
    }


    }
