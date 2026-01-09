/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stationlavage;

/**
 *
 * @author marvi
 */
public abstract class Prestation {
    protected char categorie; // 'A', 'B', 'C'

    public Prestation(char categorie) {
        this.categorie = Character.toUpperCase(categorie);
    }

    public char getCategorie() { return categorie; }
    protected double majorationLavageOuPrelavage() {
        if (categorie == 'B') return 1.50; 
        if (categorie == 'C') return 1.75; 
        return 1.00;
    }
    protected double majorationSechage() {
        if (categorie == 'B') return 1.05; 
        if (categorie == 'C') return 1.10; 
        return 1.00;
    }
    public double lavage() {
        double base = 20.0; // cat A
        return base * majorationLavageOuPrelavage();
    }
    public double sechage() {
        double base = 10.0; // cat A
        return base * majorationSechage();
    }
    public double prelavage() {
        double base = 5.0; // cat A
        return base * majorationLavageOuPrelavage();
    }
    public double interieur() {
        // A ou B = 30, C = 40
        return (categorie == 'C') ? 40.0 : 30.0;
    }
    public abstract double nettoyage();

    @Override
    public String toString() {
        return "Prestation(cat=" + categorie + ")";
    }
}
