package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo("Zoo de Tunis", 3);

        int choix;

        do {
            System.out.println("\n===== MENU GESTION ZOO =====");
            System.out.println("1️⃣  Ajouter un animal");
            System.out.println("2️⃣  Supprimer un animal");
            System.out.println("3️⃣  Afficher tous les animaux");
            System.out.println("4️⃣  Afficher les informations du zoo");
            System.out.println("0️⃣  Quitter");
            System.out.print("👉 Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("\n AJOUT D’UN ANIMAL ---");
                    System.out.print("Nom de l'animal : ");
                    String nom = sc.nextLine();

                    System.out.print("Âge de l'animal : ");
                    int age = sc.nextInt();
                    sc.nextLine(); // Consomme le saut de ligne

                    System.out.print("Espèce de l'animal : ");
                    String espece = sc.nextLine();

                    try {
                        Animal a = new Animal(nom, age, espece);
                        zoo.addAnimal(a);
                    } catch (IllegalArgumentException e) {
                        System.out.println(" Erreur : " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n--- SUPPRESSION D’UN ANIMAL ---");
                    System.out.print("Nom de l'animal à supprimer : ");
                    String nomSupp = sc.nextLine();

                    Animal animalASupprimer = null;
                    for (Animal a : zoo.getAnimals()) {
                        if (a.getName().equalsIgnoreCase(nomSupp)) {
                            animalASupprimer = a;
                            break;
                        }
                    }

                    if (animalASupprimer != null) {
                        zoo.removeAnimal(animalASupprimer);
                    } else {
                        System.out.println("⚠️ Aucun animal trouvé avec ce nom !");
                    }
                    break;

                case 3:
                    System.out.println("\n--- LISTE DES ANIMAUX ---");
                    zoo.displayAnimals();
                    break;

                case 4:
                    System.out.println("\n--- INFORMATIONS DU ZOO ---");
                    System.out.println(zoo);
                    break;

                case 0:
                    System.out.println("\n👋 Fin du programme. À bientôt !");
                    break;

                default:
                    System.out.println("⚠️ Choix invalide, réessayez !");
            }

        } while (choix != 0);

        sc.close();
    }
}
