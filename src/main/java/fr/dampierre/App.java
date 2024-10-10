package fr.dampierre;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int nombreADeviner = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.println("Entrez un nombre : ");
        int proposition = scanner.nextInt();
        System.out.println("Vous proposez : " + proposition);
        System.out.println("Le nombre auquel je pensais était : " + nombreADeviner);
        int difference = (nombreADeviner - proposition);
        System.out.println("Vous étiez à " + difference + " de la bonne réponse.");
        if (nombreADeviner < proposition) {
            System.out.println("Perdu vous avez depassé de " + (proposition - nombreADeviner));

        } else if (nombreADeviner > proposition) {
            System.out.println("il vous manquait:" + (nombreADeviner - proposition));
        } else {
            System.out.println("Quel bol, vous avez trouvé !");
        }
        scanner.close();

    }

}
