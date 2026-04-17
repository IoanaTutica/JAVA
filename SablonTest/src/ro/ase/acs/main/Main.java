package ro.ase.acs.main;

import ro.ase.acs.models.EntitateConcreta;
import ro.ase.acs.models.TipProdus;

public class Main {
    public static void main(String[] args) {
        try {
            // Obiectul 1
            EntitateConcreta e1 = new EntitateConcreta("Laptop", 3500, 5, TipProdus.TIP1);
            e1.setDetalii(new String[]{"Garantie", "Stoc"});

            EntitateConcreta e2 = new EntitateConcreta("Paine", 5, 100, TipProdus.TIP2);
            e2.setDetalii(new String[]{"Proaspat", "Fara gluten"});

            // Afisare
            System.out.println(e1);
            System.out.println(e2);

            System.out.println(e1.getValoare());


            // Testare rapida clona pentru e1
            EntitateConcreta clona = (EntitateConcreta) e1.clone();
            System.out.println("Clona lui E1: " + clona);

        } catch (Exception ex) {
            System.out.println("Eroare: " + ex.getMessage());
        }
    }
}