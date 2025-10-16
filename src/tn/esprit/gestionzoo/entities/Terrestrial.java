package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
    private int nbrLegs;

    // Constructeur par défaut
    public Terrestrial() {
        super("Inconnu", 0, "Terrestrial");
        this.nbrLegs = 0;
    }

    // Constructeur paramétré
    public Terrestrial(String name, int age, String species, int nbrLegs) {
        super(name, age, species);
        setNbrLegs(nbrLegs);
    }

    public int getNbrLegs() {
        return nbrLegs;
    }

    public void setNbrLegs(int nbrLegs) {
        if (nbrLegs < 0) {
            throw new IllegalArgumentException("Le nombre de pattes ne peut pas être négatif !");
        }
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString() + " | nbrLegs=" + nbrLegs;
    }
}
