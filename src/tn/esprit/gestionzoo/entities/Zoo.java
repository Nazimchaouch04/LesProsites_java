package tn.esprit.gestionzoo.entities;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private int capacity;
    private List<Animal> animals;

    public Zoo(String name, int capacity) {
        setName(name);
        setCapacity(capacity);
        this.animals = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Le nom du Zoo ne doit pas être vide !");
        }
        this.name = name.trim();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("La capacité doit être supérieure à 0 !");
        }
        this.capacity = capacity;
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }


    public boolean isZooFull() {
        return animals.size() >= capacity;
    }


    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("❌ Impossible d'ajouter l'animal : le zoo est plein !");
            return false;
        }
        if (animal == null) {
            System.out.println("❌ L'animal ne peut pas être null !");
            return false;
        }
        animals.add(animal);
        System.out.println("✅ Animal ajouté : " + animal.getName());
        return true;
    }


    public boolean removeAnimal(Animal animal) {
        if (animals.remove(animal)) {
            System.out.println("🗑️ Animal supprimé : " + animal.getName());
            return true;
        } else {
            System.out.println("⚠️ Animal introuvable dans le zoo !");
            return false;
        }
    }


    public void displayAnimals() {
        System.out.println("🐾 Animaux dans le zoo " + name + " :");
        for (Animal a : animals) {
            System.out.println("   - " + a);
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "nom='" + name + '\'' +
                ", capacité=" + capacity +
                ", nombre d'animaux=" + animals.size() +
                '}';
    }
}
