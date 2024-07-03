public class job0 {
    public static void main(String[] args) {
        char myChar = 'A';
        String myString = "Bonjour";
        int myInt = 5;
        long myLong = 100000L;
        float myFloat = 5.75f;
        boolean myBoolean = true;

        System.out.println("Char: " + myChar);
        System.out.println("String: " + myString);
        System.out.println("Int: " + myInt);
        System.out.println("Long: " + myLong);
        System.out.println("Float: " + myFloat);
        System.out.println("Boolean: " + myBoolean);

        // Stockage de 3.817 dans une variable int
        int TOTO = (int) 3.817;
        System.out.println("TOTO: " + TOTO); // on constante que TOTO vaut 3 car la partie décimale est tronquée
    }
}
