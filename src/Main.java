
    public class Main {
        public static void main(String[] args) {
            Zoo zoo1 = new Zoo("Safari Park", "Tunis");
            Zoo zoo2 = new Zoo("WildLand", "Alger");

            Animal lion = new Animal("Félidé", "Lion", 5, true);
            Animal tiger = new Animal("Félidé", "Tigre", 4, true);
            Animal wolf = new Animal("Canidé", "Loup", 3, true);


            zoo1.addAnimal(lion);
            zoo1.addAnimal(tiger);
            zoo2.addAnimal(wolf);


            zoo1.displayZoo();
            zoo1.displayAnimals();
            zoo2.displayZoo();
            zoo2.displayAnimals();

            System.out.println("Recherche Lion dans zoo1 : " + zoo1.searchAnimal(lion));


            zoo1.removeAnimal(tiger);
            zoo1.displayAnimals();


            System.out.println("Zoo1 est plein ? " + zoo1.isZooFull());


            Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
            System.out.println("Le zoo avec le plus d’animaux est : " + plusGrand.name);


            System.out.println(zoo1);
            System.out.println(lion);
        }
    }



