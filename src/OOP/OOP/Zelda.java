package OOP;

/**
 * Created by madis on 28.01.2017.
 */
public class Zelda {
    int zeldaElusid;

    public Zelda(int elusid) {
    zeldaElusid = elusid;
    }

public int kaklusKolliga(int kollilElusid){
        zeldaElusid = zeldaElusid - kollilElusid;
        return zeldaElusid;
}

public void prindiMituEluAlles(){
    System.out.println("Zeldal on alles " + zeldaElusid + " elu.");
}

public void prindiKasOnElus(){
    if (zeldaElusid > 0){
        System.out.println("Zelda on elus!");
    }
    else {
        System.out.println("Zelda on surnd!");
    }
}
}
