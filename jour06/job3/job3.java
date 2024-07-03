public class job3 {
    public static void main(String[] args) {
        int[] T = new int[10];
        for (int i = 0; i < T.length; i++) {
            T[i] = i;
        }

        System.out.println("T[0]: " + T[0]);
        System.out.println("T[1]: " + T[1]);
        System.out.println("T[5]: " + T[5]);
        System.out.println("T[9]: " + T[9]);
       // System.out.println("T[10]: " + T[10]);  T[10] n'existe pas et causera une erreur d'indexation si décommenté ( Index 10 out of bounds for length 10)

    }
}
