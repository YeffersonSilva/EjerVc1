public class TiposPrimitivosJava {
    public static void main(String[] args) {
        // Tipo byte: números pequeños entre -128 y 127
        byte edad = 25;

        // Tipo short: números medianos entre -32.768 y 32.767
        short productos = 1500;

        // Tipo int: números grandes entre -2.147.483.648 y 2.147.483.647  - 2 mil millones
        int poblacion = 1_500_000;

        // Tipo long: números muy grandes, como distancias espaciales - quintillones
        long distanciaALaLuna = 384_400_000L;

        // Tipo float: números decimales con menos precisión (se usa "f" al final) - hasta ±billones
        float altura = 1.75f;

        // Tipo double: números decimales con más precisión - hasta ±cuatrillones
        double peso = 68.543;

        // Tipo char: almacena un solo carácter (letra, símbolo, etc.)
        char genero = 'M';

        // Tipo boolean: solo puede ser true o false
        boolean esEstudiante = true;

        // Tipo String: secuencia de caracteres (no es primitivo, pero muy usado)
        String nombre = "Carlos Gómez";

        // Mostrar la información
        System.out.println("Información Personal:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("¿Es estudiante?: " + esEstudiante);

        System.out.println("\nOtros datos:");
        System.out.println("Productos: " + productos);
        System.out.println("Población: " + poblacion);
        System.out.println("Distancia a la luna: " + distanciaALaLuna + " metros");
    }
}


