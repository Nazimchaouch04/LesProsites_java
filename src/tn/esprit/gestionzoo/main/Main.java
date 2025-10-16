package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.*;
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
            System.out.println("5️⃣  Tester l’héritage (Prosit 5)");
            System.out.println("0️⃣  Quitter");
            System.out.print("👉 Votre choix : ");
            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("\n--- AJOUT D’UN ANIMAL ---");
                    System.out.print("Nom de l'animal : ");
                    String nom = sc.nextLine();

                    System.out.print("Âge de l'animal : ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Espèce de l'animal : ");
                    String espece = sc.nextLine();

                    try {
                        Animal a = new Animal(nom, age, espece);
                        zoo.addAnimal(a);
                    } catch (IllegalArgumentException e) {
                        System.out.println("❌ Erreur : " + e.getMessage());
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

                case 5:
                    menuHeritage(sc);
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

    // ===========================
    // === Sous-menu Héritage ===
    // ===========================
    private static void menuHeritage(Scanner sc) {
        int choixH;
        do {
            System.out.println("\n===== MENU PROSIT 5 : HÉRITAGE =====");
            System.out.println("1️⃣  Créer un Aquatic");
            System.out.println("2️⃣  Créer un Dolphin");
            System.out.println("3️⃣  Créer un Penguin");
            System.out.println("4️⃣  Créer un Terrestrial");
            System.out.println("5️⃣  Tester la méthode swim()");
            System.out.println("0️⃣  Retour au menu principal");
            System.out.print("👉 Votre choix : ");
            choixH = sc.nextInt();
            sc.nextLine();

            switch (choixH) {
                case 1:
                    System.out.println("\n--- Création d’un Aquatic ---");
                    System.out.print("Nom : ");
                    String nameA = sc.nextLine();
                    System.out.print("Âge : ");
                    int ageA = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Espèce : ");
                    String speciesA = sc.nextLine();
                    System.out.print("Habitat : ");
                    String habitatA = sc.nextLine();

                    Aquatic aquatic = new Aquatic(nameA, ageA, speciesA, habitatA);
                    System.out.println("✅ " + aquatic);
                    break;

                case 2:
                    System.out.println("\n--- Création d’un Dolphin ---");
                    System.out.print("Nom : ");
                    String nameD = sc.nextLine();
                    System.out.print("Âge : ");
                    int ageD = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Espèce : ");
                    String speciesD = sc.nextLine();
                    System.out.print("Habitat : ");
                    String habitatD = sc.nextLine();
                    System.out.print("Vitesse de nage (km/h) : ");
                    float speedD = sc.nextFloat();

                    Dolphin dolphin = new Dolphin(nameD, ageD, speciesD, habitatD, speedD);
                    System.out.println("✅ " + dolphin);
                    break;

                case 3:
                    System.out.println("\n--- Création d’un Penguin ---");
                    System.out.print("Nom : ");
                    String nameP = sc.nextLine();
                    System.out.print("Âge : ");
                    int ageP = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Espèce : ");
                    String speciesP = sc.nextLine();
                    System.out.print("Habitat : ");
                    String habitatP = sc.nextLine();
                    System.out.print("Profondeur max (m) : ");
                    float depthP = sc.nextFloat();

                    Penguin penguin = new Penguin(nameP, ageP, speciesP, habitatP, depthP);
                    System.out.println("✅ " + penguin);
                    break;

                case 4:
                    System.out.println("\n--- Création d’un Terrestrial ---");
                    System.out.print("Nom : ");
                    String nameT = sc.nextLine();
                    System.out.print("Âge : ");
                    int ageT = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Espèce : ");
                    String speciesT = sc.nextLine();
                    System.out.print("Nombre de pattes : ");
                    int legsT = sc.nextInt();

                    Terrestrial terrestrial = new Terrestrial(nameT, ageT, speciesT, legsT);
                    System.out.println("✅ " + terrestrial);
                    break;

                case 5:
                    System.out.println("\n--- Test de la méthode swim() ---");
                    Aquatic a = new Aquatic("Poisson rouge", 1, "Aquatic", "Bassin");
                    Dolphin d = new Dolphin("Flipper", 5, "Dolphin", "Mer", 25.5f);
                    Penguin p = new Penguin("Pingou", 3, "Penguin", "Banquise", 50f);

                    a.swim();
                    d.swim();
                    p.swim();
                    break;

                case 0:
                    System.out.println("↩️ Retour au menu principal...");
                    break;

                default:
                    System.out.println("⚠️ Choix invalide !");
            }

        } while (choixH != 0);
    }
}