package ro.ase.acs.models;

public class Calcule {
    // --- VARIANTA A: Cu TAXĂ (Ex: Magazin Online / Produse) ---
    // Cerința: "valoare = pret * (1 + taxa)"
    @Override
    public float getValoare() {
        // getTaxa() returnează 0.05 sau 0.2 în funcție de Enum
        return this.pret * (1 + getTaxa());
    }


    // --- VARIANTA B: Cu REDUCERE (Ex: Bilet Autocar / Servicii) ---
    // Cerința: "valoare = pret * (1 - reducere)"
    @Override
    public float getValoare() {
        // getReducere() returnează 0.1 sau 0.5 în funcție de Enum
        return this.pret * (1 - getReducere());
    }


    // --- VARIANTA C: Calcul compus (Bilet Autocar ) ---
    // Cerința: "pret_baza_din_clasa_abstracta * distanta * (1 - reducere)"
    @Override
    public float getValoare() {
        // super.getValoare() ia cifra fixă (ex: 3) din clasa abstractă
        return super.getValoare() * this.distanta * (1 - getReducere());
    }


    // --- VARIANTA D: Cu FACTOR (Ex: Task-uri / Dispozitive) ---
    // Cerința: "valoare = consum * ore * factor"
    @Override
    public float getValoare() {
        // getFactor() returnează 1 sau 2 (SHORT/LONG)
        return this.pret * this.cantitate * getFactor();
    }
}
