
/*public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int animalCount = 0;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];    }

    public Zoo(String safariPark, String tunis) {
    }

    public boolean addAnimal(Animal animal) {
        if (animalCount < nbrCages) {
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }
        return false;
    }

    public void displayZoo() {
        System.out.println("Nom du zoo : " + name);
        System.out.println("Ville : " + city);
        System.out.println("Nombre de cages : " + nbrCages);
    }
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }

    public void displayAnimals() {
    }
}
*/
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int animalCount = 0;


    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;


        this.animals = new Animal[nbrCages];
    }


    public boolean addAnimal(Animal animal) {
        if (isZooFull()) {
            System.out.println("Zoo plein, impossible d’ajouter " + animal.name);
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("⚠ Animal déjà présent : " + animal.name);
            return false;
        }
        animals[animalCount++] = animal;
        return true;
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) return false;

        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[--animalCount] = null;
        return true;
    }


    public void displayZoo() {
        System.out.println("Zoo : " + name + " (" + city + "), cages = " + nbrCages);
    }


    public void displayAnimals() {
        if (animalCount == 0) {
            System.out.println("Aucun animal dans le zoo.");
            return;
        }
        System.out.println("Animaux du zoo :");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(" - " + animals[i]);
        }
    }


    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }


    public boolean isZooFull() {
        return animalCount >= nbrCages;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return (z1.animalCount > z2.animalCount) ? z1 : z2;
    }



    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", animaux=" + animalCount +
                '}';
    }
}
