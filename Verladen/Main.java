package Verladen;

public class Main {

	// meine Lösung die hoffentlich verständlich ist
	public static void verladeAuftrag1() {
		
		// Alle Auftraege müssen durchgegangen werden
		for (int i = 0; i < Auftraege.size(); i++) {

			// Auftrag aus der Auftragsliste holen
			Auftrag a = Auftraege.getAuftrag(i);

			// Fahrzeuge durchgehen und schauen wo noch genügend Platz ist
			for (int k = 0; k < Fahrzeuge.size(); k++) {
				Fahrzeug f = Fahrzeuge.getFahrzeug();

				// ist noch genügend Platz für den Auftrag auf dem Fahrzeug?
				if (f.palettenFrei >= a.geordertePaletten) {
					// es gibt noch genügend Platz auf dem Fahrzeug, der Auftrag
					// kann also auf das Fahrzeug verladen werden
					// die Kapazitäten des Fahrzeugs werden in verladeAuftrag korrigiert
					f.verladeAuftrag(a);

					// die schleife muss verlassen werden damit der Auftrag nicht noch
					// auf weitere Fahrzeuge verladen wird.
					break;
				}
			}
		}

	}

	// hier mal die Version der Musterlösung der IHK umgesetzt
	public static void verladeAuftrag2() {

		Fahrzeug fz = null;

		// Alle Auftraege müssen durchgegangen werden
		for (int i = 0; i < Auftraege.size(); i++) {

			// Auftrag aus der Auftragsliste holen
			Auftrag at = Auftraege.getAuftrag(i);
			if (at.verladen) {
				continue;
			}

			if (fz == null) {
				fz = Fahrzeuge.getFahrzeug();
			}

			for (int j = i; j < Auftraege.size(); j++) {
				at = Auftraege.getAuftrag(j);
				if (at.verladen)
					continue;

				if (fz.palettenFrei >= at.geordertePaletten) {
					fz.verladeAuftrag(at);
					at.verladen = true;
				}

			}
			fz = null;

			if (!Auftraege.getAuftrag(i).verladen)
				i--; // Sowas darf man eigentlich gar nicht!
		}
	}

	public static void main(String[] args) {
        //--- zuerst müssen Aufträge und Fahrzeuge erstellt werden
		//--- hier werden Testdaten generiert
		Auftraege.erzeugeAuftraege();
		Fahrzeuge.erzeugeFahrzeuge();
		
		//--- Nun die 
		//verladeAuftrag1();
		verladeAuftrag2();
	}

}
