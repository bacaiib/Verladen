package Verladen;

import java.util.ArrayList;

public class Fahrzeuge {

    private static int anzFahrzeuge = 20;
        // Fahrzeugspeicher
        private static ArrayList<Fahrzeug> fahrzeuge = new ArrayList<Fahrzeug>();
            // liefert die Anzahl der Fahrzeuge zurück,
        public static int size() {
                return anzFahrzeuge;
            }
            // Initialisierung der Fahrzeuge in einem statischen Block - sowas geht auch
            // es werden Testdaten erstellt, alle Fahrzeuge haben eine Kapazität von 36
        static {
                for (int i = 0; i < anzFahrzeuge; i++) {
                Fahrzeug f = new Fahrzeug(i+1, 36, 0, 36);
                fahrzeuge.add(f);
                }
            }
            // liefert ein spezielles Fahrzeug aus der Fahrzeugliste
        public static Fahrzeug getFahrzeug(int n) {
                return fahrzeuge.get(n);
            }

}
