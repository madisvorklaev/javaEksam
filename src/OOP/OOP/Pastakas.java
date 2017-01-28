package OOP;

/**
 * Created by madis on 28.01.2017.
 */
public class Pastakas {

    int tinti;

    public Pastakas(int tindiKogus) {
        tinti = tindiKogus;
    }

    public void kirjuta(String tekst){
      //  while (tinti > 0){
        String noCaps = tekst.replace(" ", "");
        if (tinti >= noCaps.length()){
            System.out.println(tekst);
            tinti = tinti-noCaps.length();
           // prindiPaljuTintiAlles();
        }
        else{
            String almostOutOfInk = tekst.substring(0, tinti);
            for (int i = 0; i < almostOutOfInk.length()  ; i++) {
                String a = String.valueOf(almostOutOfInk.charAt(i));
                if (a.equals(" ")){
                    tinti +=1;
                }
            }
            System.out.println(tekst.substring(0, tinti));
        //    tinti = 0;
        }}
        //}


    public void prindiPaljuTintiAlles(){
        System.out.println("Tinti on veel " +tinti+ " tähe jaoks");
    }
}
