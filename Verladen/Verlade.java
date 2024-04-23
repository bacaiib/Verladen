package Verladen;

import java.util.ArrayList;

public class Verlade {

    public static void VerladeAuftraege(ArrayList<Auftrag> auftreage, ArrayList<Fahrzeug> fahrzeuge){
        int fahrzeugIndex = 0;
        for (Auftrag auftrag : auftreage){
            while (auftrag.getP()> fahrzeuge.get(fahrzeugIndex).getPalettenFrei()){
                fahrzeugIndex++;
                if (fahrzeugIndex>=fahrzeuge.size()){
                    throw new RuntimeException("Nicht genügend Fahrzeuge");
                }
            }
            fahrzeuge.get(fahrzeugIndex).Verladen(auftrag);
        }
    }

}
