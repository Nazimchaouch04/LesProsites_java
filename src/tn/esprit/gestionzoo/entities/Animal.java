package tn.esprit.gestionzoo.entities;

public class Animal {
    private String name;
    private int age;
    private String species;


    public Animal(String name, int age, String species) {
        setName(name);
        setAge(age);
        setSpecies(species);
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'animal ne peut pas être vide !");
        }
        this.name = name.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge d'un animal ne peut pas être négatif !");
        }
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        if (species == null || species.trim().isEmpty()) {
            throw new IllegalArgumentException("L'espèce ne peut pas être vide !");
        }
        this.species = species.trim();
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nom='" + name + '\'' +
                ", âge=" + age +
                ", espèce='" + species + '\'' +
                '}';
    }
}
