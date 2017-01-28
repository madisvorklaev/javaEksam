package OOP;

import java.util.ArrayList;

/**
 * Created by madis on 28.01.2017.
 */
public class Sonaraamat {

    String language;
    ArrayList <String> eestiKeel = new ArrayList();

    public Sonaraamat(String raamatuKeel) {
        language = raamatuKeel;
    }

    public void sisestaSona(String input){
        eestiKeel.add(input);
            }

    public String[] otsiEsimeseTaheJargi(String letter){
        char firstLetter = letter.charAt(0);
        ArrayList sobivadVasted = new ArrayList();
        for (int i = 0; i < eestiKeel.size() ; i++) {
            if (eestiKeel.get(i).charAt(0) == firstLetter){
                sobivadVasted.add(eestiKeel.get(i));
            }}

        String[] vasted = new String[sobivadVasted.size()];
        for (int i = 0; i < sobivadVasted.size() ; i++) {
            vasted[i] = (String) sobivadVasted.get(i);
        }
        return vasted ;
    }

    public void eemaldaSona(String word){
        eestiKeel.remove(word);
        System.out.println(eestiKeel);
    }

    public void misKeelesRaamatOn(){
        System.out.println(language);
    }
}

