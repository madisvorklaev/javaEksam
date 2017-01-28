package Algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        Arrays.sort(naide);
        ArrayList <Integer> numbers = new ArrayList();
        HashMap map = new HashMap();
        int counter = 0;

        for (int i = 0; i < naide.length ; i++) {
            if (naide[i] != 3){
            numbers.add(naide[i]);
        }
    }
        for (int i = 0; i < numbers.size(); i++) {
            counter = 1; //sest 1 kord esineb seda liiget ju igal juhul
            int a = numbers.get(i);
            for (int j = i+1; j < numbers.size() ; j++) { //i+1 korral jäetakse juba uuritud liikmed saatuse hooleks ja neid ei torgita enam.
                if (numbers.get(j) == a){
                    counter +=1;
                }
                map.put(counter, a); //suurim numbrite summa jääb viimaseks võtmeks. Väiksema summa korral kirjutatakse eelmine võti ja väärtus lihtsalt üle
            }
        }
        Comparable maxKey = Collections.max(map.keySet()); // mis oli kõige suurem counteri tulemus
        int vastus = (int) map.get(maxKey); // küsi mapist keyle vastav väärtus
        System.out.println(numbers);
        System.out.println(map);
        System.out.println("Kõige rohkem esines number " + vastus +".");

}}
