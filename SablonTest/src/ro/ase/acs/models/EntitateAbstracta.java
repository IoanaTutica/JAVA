package ro.ase.acs.models;

import ro.ase.acs.contracts.ICalculabil;

public abstract class EntitateAbstracta implements ICalculabil {
    protected String nume;
    protected float pret;
    protected int cantitate;

    public EntitateAbstracta(String nume, float pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    // Metoda din interfață
    @Override
    public float getValoare() {
        return 0;
    }

    // O metodă pe care o "obligă" clasa următoare să o facă
    public abstract float calculeazaCevaSpecific();
}
