public class Scope {
    public static void main(String[] args) {

        // El código aquí no puede usar x

        int x = 100;

        // El código aquí puede usar x
        System.out.println(x);
        // Las variables declaradas directamente dentro de un método están disponibles
        // en cualquier parte del método siguiendo la línea de código en la que fueron
        // declaradas:
    }
}
