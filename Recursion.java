public class Recursion {
    public static void main(String[] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum(int start, int end) {// Usa la recursividad para sumar todos los números entre 5 y 10
        if (end > start) {// Verificar si el número es mayor al otro
            return end + sum(start, end - 1);// Se hace la suma n veces hasta romper la verificación
        } else {
            return end;
        }
    }
}
