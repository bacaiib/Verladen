package Verladen;

import java.util.ArrayList;

// diese Klasse speichert die Fahrzeuge und ermöglicht den Zugriff auf die Fahrzeuge
// Sie haben Zugriff auf die Methode size und getNextFahrzeug
// Ändern brauchen Sie die Klasse nicht

public class Fahrzeuge {

	// Anzahl der Fahrzeuge
	private static int idF = 0;
	private static int anzFahrzeuge = 20;

	// Fahrzeugspeicher
	private static ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();

	// liefert die Anzahl der Fahrzeuge zurück,
	public static int size() {
		return fahrzeuge.size();
	}

	// initialisierung der Fahrzeuge 
	// es werden Testdaten erstellt, alle Fahrzeuge haben eine Kapazität von 36
	public static void erzeugeFahrzeuge() {
		for (int i = 0; i < anzFahrzeuge; i++) {
			Fahrzeug f = new Fahrzeug(i+1, 36, 0, 36);
			fahrzeuge.add(f);
		}

	}

	// liefert ein spezielles Fahrzeug aus der Fahrzeugliste
	public static Fahrzeug getFahrzeug() {
		return fahrzeuge.get(idF++);
	}	
}
