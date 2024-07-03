import java.util.Scanner;

public class job7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 5;

        for (int i = 0; i < count; i++) {
            System.out.println("Veuillez entrer un entier : ");
            sum += scanner.nextInt();
        }
        double average = (double) sum / count;
        System.out.println("La moyenne des cinq entiers est : " + average);
        
        scanner.close();
    }
}
