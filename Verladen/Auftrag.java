package Verladen;

public class Auftrag {

    private int auftragID;
    private int anzahlP;
    private boolean verladen = false;
    private int fahrzeugID;

    public Auftrag (int a, int p){
        this.auftragID = a;
        this.anzahlP = p;
    }

    public int getID (){
        return auftragID;
    }

    public int getP(){
        return anzahlP;
    }

    public boolean isVerladen(){
        return verladen;
    }

    public void setVerladen(boolean verladen){
        this.verladen = verladen;
    }

    public int getFahrzeugID(){
        return fahrzeugID;
    }

    public void setFahrzeugID(int fahrzeugID){
        this.fahrzeugID = fahrzeugID;
    }


}
