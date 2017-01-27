package OOP;

import java.util.HashMap;

/**
 * Created by madis on 22.01.2017.
 */
public class Chat {
    public String toaNimi;
    public String s;
    public String taavi;
    HashMap<String, String> userInput = new HashMap<>();


    public Chat(String toaNimi) {
        this.toaNimi = toaNimi;
    }

    public void sisestaSonum(String taavi, String s) {
        this.taavi = taavi;
        this.s = s;
        userInput.put(taavi,s);
        }

    public void prindiKoikSonumidKoosKasutajanimega(){
            String printOut = userInput.get(taavi);
            System.out.println(printOut);
    }

    public void prindiToaNimi(){
        System.out.println(toaNimi);
    }

    public void adminKustutabSonumi(String s){
        userInput.remove(taavi, s);
    }
}