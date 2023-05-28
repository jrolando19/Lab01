public class MethodOverloading {
    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5); // Se hace llamado al método de tipo int
        double myNum2 = plusMethodDouble(4.3, 6.26); // Se hace llamado al método de tipo double
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        // Se muestra 2 métodos que suman números de diferentes tipos
    }

    private static double plusMethodDouble(double x, double y) {
        return x + y;// retorna la suma de los valores de tipo double
    }

    private static int plusMethodInt(int x, int y) {
        return x + y;// retorna la suma de los valores de tipo int
    }
}
