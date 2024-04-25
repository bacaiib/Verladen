package Verladen;

public class Auftrag {
	
	// Attribute laut Beschreibung
	public int id;
	
	public int geordertePaletten;
	
	public boolean verladen;
	
	public int fahrzeugId = 0; 
	
	// Konstruktor (verladen könnte auch als parameter übergeben werden abe macht das sinn ?  
	public Auftrag(int id, int geordertePaletten) {
		this.id = id;
		this.geordertePaletten = geordertePaletten;
		this.verladen = false;
	}

}
