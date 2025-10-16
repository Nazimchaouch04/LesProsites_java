package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal {
    private String habitat;

    // Constructeur par défaut
    public Aquatic() {
        super("Inconnu", 0, "Aquatic");
        this.habitat = "Inconnu";
    }

    // Constructeur paramétré
    public Aquatic(String name, int age, String species, String habitat) {
        super(name, age, species);
        setHabitat(habitat);
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if (habitat == null || habitat.trim().isEmpty()) {
            throw new IllegalArgumentException("L'habitat ne peut pas être vide !");
        }
        this.habitat = habitat.trim();
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }

    @Override
    public String toString() {
        return super.toString() + " | habitat='" + habitat + '\'';
    }
}
