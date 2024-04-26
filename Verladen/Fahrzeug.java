package Verladen;

public class Fahrzeug {

	// Attribute laut Beschreibung
	public int fahrzeugId;
	public int palettenKapazitaet;
	public int palettenGeladen;
	public int palettenFrei;
	//public Auftrag[] allesaufträgeimFahrzeug;

	// Auftrag auf dem Fahrzeug verladen.
	// hier müssen die Kapazitäten nach dem Verladen korrigiert werden
	public void verladeAuftrag(Auftrag a) {
		
		System.out.println("Verlade Auftrag: "+a.id+ " auf Fahrzeug: "+fahrzeugId);
		System.out.println("Auftrag:  Palettenanzahl: " +a.geordertePaletten);
		System.out.println("Fahrzeug: palettenFrei: " + palettenFrei);
		
		palettenFrei = palettenFrei - a.geordertePaletten;
		palettenGeladen = palettenGeladen + a.geordertePaletten;
		a.verladen = true;
		
		System.out.println("Fahrzeug: palettenFrei: " + palettenFrei);
		System.out.println("\n\n");

	}

	// Konstruktor
	public Fahrzeug(int fahrzeugId, int palKapazitaet, int palGeladen, int palFrei) {
		this.fahrzeugId = fahrzeugId;
		this.palettenKapazitaet = palKapazitaet;
		this.palettenGeladen = palGeladen;
		this.palettenFrei = palFrei;
	}

}
