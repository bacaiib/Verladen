package Verladen;

import java.util.ArrayList;

public class Auftraege {

	// Anzahl der Auftraege
	private static int anzAuftraege = 10;

	// Auftragsspeicher
	private static ArrayList<Auftrag> auftraege = new ArrayList<Auftrag>();

	// liefert die Anzahl der Aufträge zurück,
	public static int size() {
		return auftraege.size();
	}

	// initialisierung der Aufträge 
	// hier werden einfach Testdaten erstellt
	// die georderte Paletten werden berechnet von 22 an absteigend
	public static void erzeugeAuftraege() {
		for (int i = 0; i < anzAuftraege; i++) {
			Auftrag a = new Auftrag(i+1,22-i);
			auftraege.add(a);
		}
	}

	// liefert einen speziellen Auftrag aus der Auftragsliste zurück
	public static Auftrag getAuftrag(int n) {
		return auftraege.get(n);
	}

}
