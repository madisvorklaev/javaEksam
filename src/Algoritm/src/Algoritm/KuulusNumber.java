package Algoritm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Antud on int[] massiiv. Eemalda kõik nr 3 väärtused ja leia millist numbrit esineb kõige siis rohkem?
 * Mitte siis number, mis on kolmandal indeksil, vaid nr kolm ise.
 */
public class KuulusNumber {

    public static void main(String[] args) {

        int[] naide = {1, 5, 3, 3, 6, 3, 7, 7}; // vastus on 7
        Arrays.sort(naide);
        ArrayList <Integer> numbers = new ArrayList();
        ArrayList <Integer> values = new ArrayList();
        ArrayList <Integer> count = new ArrayList();
        int counter = 0;

        for (int i = 0; i < naide.length ; i++) {
            if (naide[i] != 3){
            numbers.add(naide[i]);
        }
    }
        for (int i = 0; i < numbers.size(); i++) {
            int a = numbers.get(i);
            for (int j = 0; j < numbers.size() ; j++) {
                if (numbers.get(j) == a){
                    counter +=1;
                }

            }

        }
        System.out.println(numbers);
}}
