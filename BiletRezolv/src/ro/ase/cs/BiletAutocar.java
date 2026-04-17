// ===================== CERINTA 3,4,5,6,7 =====================
package ro.ase.cs;

import java.util.*;

public class BiletAutocar extends BiletAbstract implements Cloneable {

    // CERINTA 3
    private TipReducere tipReducere;

    // CERINTA 4
    private String[] statii;

    // CERINTA 7
    private static List<BiletAutocar> bilete = new ArrayList<>();

    // CERINTA 3
    public BiletAutocar(String plecare, String sosire, int distanta, TipReducere tipReducere) {
        super(plecare, sosire, distanta);
        this.tipReducere = tipReducere;
    }

    // CERINTA 4
    @Override
    public float getReducere() {
        if (tipReducere == TipReducere.STUDENT) {
            return 0.5f;
        } else {
            return 0.9f;
        }
    }

    // CERINTA 4
    public String[] getStatii() {
        return statii;
    }

    public void setStatii(String[] statii) {
        this.statii = statii;
    }

    // CERINTA 5
    public String getPlecare() {
        return plecare;
    }

    public String getSosire() {
        return sosire;
    }

    public int getDistanta() {
        return distanta;
    }

    public TipReducere getTipReducere() {
        return tipReducere;
    }

    // CERINTA 5 (deep copy)
    @Override
    public Object clone() throws CloneNotSupportedException {
        BiletAutocar copie = (BiletAutocar) super.clone();
        if (this.statii != null) {
            copie.statii = this.statii.clone();
        }
        return copie;
    }

    // CERINTA 5
    @Override
    public float getPret() {
        float baza = super.getPret();
        return baza * distanta * (1 - getReducere());
    }

    // CERINTA 6
    @Override
    public String toString() {
        return "-- " + plecare + " " + sosire + " " + distanta + " --";
    }

    // CERINTA 7
    public static void emiteBilet(BiletAutocar b) {
        bilete.add(b);
    }

    public static Collection<BiletAutocar> bileteEmise() {
        return bilete;
    }
}