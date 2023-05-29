public class Scope {
    public static void main(String[] args) {

        // El código aquí no puede usar x
        {
            int x = 100;

            // El código aquí puede usar x
            System.out.println(x);
        }
        // El código aquí no puede usar x

        // Solo se puede acceder a las variables declaradas dentro de bloques de código
        // mediante el código entre llaves, que sigue la línea en la que se declaró la
        // variable
    }
}
