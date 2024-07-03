import java.util.Scanner;

public class job1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Veuillez entrer une valeur : ");
        String userInput = scanner.nextLine();

        System.out.println("Vous avez entré : " + userInput);
        
        scanner.close();
    }
}
