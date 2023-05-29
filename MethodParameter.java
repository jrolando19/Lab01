public class MethodParameter {
    public static void main(String[] args) {
        checkAge(20); // Hace el llamado al método checkAge con una edad de 20
    }

    private static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!"); // Si es menor a 18 se le deniega el acceso
        } else {
            System.out.println("Access granted - You are old enough!"); // Si es mayor a 18 se le otorga el acceso
        }
    }

}
