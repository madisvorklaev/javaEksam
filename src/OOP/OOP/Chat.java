package OOP;

import java.util.ArrayList;

/**
 * Created by kristitammet on 22/01/2017.
 */
public class Chat {
        String toaNimi;
        ArrayList<String> nimed = new ArrayList<>();
        ArrayList<String> sonumid = new ArrayList<>();
    public Chat(String toaNimi){
        this.toaNimi = toaNimi;
    }
    public void sisestaSonum (String nimi, String sonum){
        nimed.add(nimed.size(), nimi);
        sonumid.add(sonumid.size(),sonum);
    }
    public void prindiKoikSonumidKoosKasutajanimega (){
        for (int i = 0; i < nimed.size(); i++) {
        System.out.println(nimed.get(i)+": "+sonumid.get(i));
    }
        System.out.println("");}
    public void adminKustutabSonumi (String sonum){
        for (int i = 0; i <sonumid.size() ; i++) {
            if (sonum == sonumid.get(i)){
                sonumid.set(i, "Kustutatud Admini poolt!");
            }}
    }
    public void prindiToaNimi (){
        System.out.println(toaNimi);
    }
    }
