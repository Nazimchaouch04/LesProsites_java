
public class Main {
    public static void main(String[] args) {

        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Zoo myZoo = new Zoo("Safari Park", "Tunis", 25);
        myZoo.animals[0] = lion;
   /*     System.out.println("Zoo : " + myZoo.name + " situé à " + myZoo.city
                + " comporte " + myZoo.nbrCages + " cages.");
        System.out.println("Premier animal : " + myZoo.animals[0].name
                + " (" + myZoo.animals[0].family + "), âge "
                + myZoo.animals[0].age + " ans, mammifère : "
                + myZoo.animals[0].isMammal);*/



        /*System.out.println(myZoo);*/
        System.out.println(myZoo.toString());
       /* System.out.println(lion);*/
        System.out.println(lion.toString());

    }

}
