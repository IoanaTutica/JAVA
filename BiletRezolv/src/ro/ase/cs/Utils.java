// ===================== CERINTA 8 + 9 =====================
package ro.ase.cs;

import ro.ase.acs.models.*;
import java.util.*;
import java.util.stream.*;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    // CERINTA 8
    public static Stream<BiletAutocar> getLocuriVandute(List<BiletAutocar> lista, int distMax) {
        return lista.stream()
                .filter(b -> b.getTipReducere() == TipReducere.STUDENT)
                .filter(b -> b.getDistanta() < distMax);
    }

    // CERINTA 9
    public static void salveazaInFisier(BiletAutocar b, String numeFisier) {
        try {
            
            FileWriter fw = new FileWriter(numeFisier);

            fw.write(b.getPlecare() + "\n");
            fw.write(b.getSosire() + "\n");
            fw.write(b.getDistanta() + "\n");
            fw.write(b.getTipReducere().toString() + "\n");

            fw.close();
            
        } catch (IOException e) {
            
            e.printStackTrace();
            
        }
        
    }
    
}