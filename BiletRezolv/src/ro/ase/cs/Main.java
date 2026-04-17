package ro.ase.cs;

import ro.ase.acs.models.*;
import ro.ase.acs.utils.Utils;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // CREARE
        BiletAutocar b1 = new BiletAutocar("Bucuresti", "Suceava", 700, TipReducere.STUDENT);
        BiletAutocar b2 = new BiletAutocar("Cluj", "Iasi", 400, TipReducere.PENSIONAR);

        // SET STATII
        b1.setStatii(new String[]{"Buzau", "Bacau"});
        b2.setStatii(new String[]{"Targu Mures", "Brasov"});

        // AFISARE
        System.out.println(b1);
        System.out.println(b2);

        // PRET
        System.out.println("Pret b1: " + b1.getPret());
        System.out.println("Pret b2: " + b2.getPret());

        // ADAUGARE
        BiletAutocar.emiteBilet(b1);
        BiletAutocar.emiteBilet(b2);

        // AFISARE COLECTIE
        System.out.println("\nBilete emise:");
        for (BiletAutocar b : BiletAutocar.bileteEmise()) {
            System.out.println(b);
        }

        // FILTRARE
        System.out.println("\nBilete STUDENT cu distanta < 800:");
        Utils.getLocuriVandute(new ArrayList<>(BiletAutocar.bileteEmise()), 800)
                .forEach(System.out::println);

        // CLONARE
        try {
            BiletAutocar copie = (BiletAutocar) b1.clone();
            System.out.println("\nCopie: " + copie);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // FISIER
        Utils.salveazaInFisier(b1, "bilet.txt");
        
    }
    
}