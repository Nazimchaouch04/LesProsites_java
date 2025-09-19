import java.util.Scanner;

public class ZooManagement {
    int nbrCages;
    String zooName;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();


        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = sc.nextLine();


        System.out.print("Entrez le nombre de cages : ");
        int cages = sc.nextInt();


        if (cages > 0 && !zoo.zooName.isEmpty()) {
            zoo.nbrCages = cages;
            System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");
        } else {
            System.out.println("Valeurs invalides !");
        }

        sc.close();
    }
}
