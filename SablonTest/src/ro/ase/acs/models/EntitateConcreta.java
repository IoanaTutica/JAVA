package ro.ase.acs.models;

public class EntitateConcreta extends EntitateAbstracta implements Cloneable {
    private TipProdus tipProdus;
    private String[] detalii; // Vectorul de String-uri care apare în TOATE testele

    public EntitateConcreta(String nume, float pret, int cantitate, TipProdus tipProdus) throws Exception {
        super(nume, pret, cantitate);
        // VALIDARE (Cerință frecventă la nota 4)
        if (pret < 0) throw new Exception("Pret negativ!");
        this.tipProdus = tipProdus;
    }

    // GETTER CU DEEP COPY
    public String[] getDetalii() {
        if (this.detalii == null) return null;
        return this.detalii.clone();
    }

    // SETTER CU DEEP COPY
    public void setDetalii(String[] detalii) {
        if (detalii != null) {
            this.detalii = detalii.clone();
        }
    }

    // CLONARE (DEEP COPY)
    @Override
    public Object clone() throws CloneNotSupportedException {
        EntitateConcreta clona = (EntitateConcreta) super.clone();
        if (this.detalii != null) {
            clona.detalii = this.detalii.clone(); // Clonăm și vectorul intern
        }
        return clona;
    }

    @Override
    public String toString() {
        return "EntitateConcreta{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }

    @Override
    public float calculeazaCevaSpecific() {
        // Logica de calcul bazată pe Enum sau praguri
        if (this.tipProdus == TipProdus.TIP1) return this.pret * 0.1f;
        return 0;
    }

    // poti avea si sa modifici valoarea metodei din interfata

    public float getValoare() {
        float baza = super.getValoare();
        return baza * pret * (1 - calculeazaCevaSpecific());
    }
}