public class MethodOverloading {
    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 5); // Se hace llamado al método de tipo int
        double myNum2 = plusMethod(4.3, 6.26); // Se hace llamado al método de tipo double
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
        // Se comprueba la sobrecarga de métodos al ser del mismo nombre pero que sus
        // tipos de parámetros son diferentes
    }

    private static double plusMethod(double x, double y) {
        return x + y;// retorna la suma de los valores de tipo double
    }

    private static int plusMethod(int x, int y) {
        return x + y;// retorna la suma de los valores de tipo int
    }
}
