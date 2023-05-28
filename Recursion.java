public class Recursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) { // Evalua si el número es mayor que 0
            return k + sum(k - 1); // Hace el cálculo luego de verificar y lo suma al mismo menos 1 hasta que se
                                   // rompa la verificación
        } else {
            return 0;
        }
    }
}
