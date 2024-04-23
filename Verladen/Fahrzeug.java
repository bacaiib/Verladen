package Verladen;

public class Fahrzeug {

    private int fahrzeugID;
    private int plattenKapazität;
    private int palettenGeladen;
    private int palettenFrei;

    public Fahrzeug (int fID, int pKa, int pGe, int pF){
        this.fahrzeugID = fID;
        this.plattenKapazität = pKa;
        this.palettenGeladen = pGe;
        this.palettenFrei = pF;
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
        return palettenFrei;
    }

    public void Verladen(Auftrag a){
        if (palettenFrei>=a.getP()){
            palettenGeladen += a.getP();
            palettenFrei -= a.getP();
            a.setVerladen(true);
            a.setFahrzeugID(this.fahrzeugID);
        }
    }

}
