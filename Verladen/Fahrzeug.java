package Verladen;

public class Fahrzeug {

    private int fahrzeugID;
    private int plattenKapazität;
    private int palettenGeladen;
    private int plattenFrei;

    public Fahrzeug (int fID, int pKa, int pGe, int pF){
        this.fahrzeugID = fID;
        this.plattenKapazität = pKa;
        this.palettenGeladen = pGe;
        this.plattenFrei = pF;
    }

    public int getFahrzeugID(){
        return fahrzeugID;
    }

    public int getplattenKapazität(){
        return plattenKapazität;
    }

    public int getPalettenGeladen(){
        return palettenGeladen;
    }

    public int getPalettenFrei(){
        return plattenFrei;
    }

    public void Verladen(Auftrag a){
        if (palettenGeladen>=a.getP()){
            palettenGeladen += a.getP();
            plattenFrei -= a.getP();
            a.setVerladen(true);
            a.setFahrzeugID(this.fahrzeugID);
        }
    }

}
