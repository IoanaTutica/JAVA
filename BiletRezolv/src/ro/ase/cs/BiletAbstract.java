// ===================== CERINTA 1 + 2 =====================
package ro.ase.cs;

import ro.ase.acs.contracts.Cumparabil;

public abstract class BiletAbstract implements Cumparabil {
    protected String plecare;
    protected String sosire;
    protected int distanta;

    public BiletAbstract(String plecare, String sosire, int distanta) {
        this.plecare = plecare;
        this.sosire = sosire;
        this.distanta = distanta;
    }

    // CERINTA 2
    @Override
    public float getPret() {
        return 3;
    }

    // CERINTA 2
    public abstract float getReducere();
}