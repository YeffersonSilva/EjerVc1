public class TiposPrimitivosJava {
    public static void main(String[] args) {
        // Tipos Enteros

        // byte: de -128 a 127 → ~±100
        byte edad = 25;

        // short: de -32.768 a 32.767 → ~±30 mil
        short cantidadDeProductos = 1500;

        // int: de -2.147.483.648 a 2.147.483.647 → ~±2 mil millones
        int poblacionCiudad = 1_500_000;

        // long: de -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 → ~±9 quintillones
        long distanciaEnMetros = 384_400_000L; // distancia a la luna

        // Tipos Decimales

        // float: ±3.4e−38 a ±3.4e+38 → hasta ±billones
        float alturaEnMetros = 1.75f;

        // double: ±1.7e−308 a ±1.7e+308 → hasta ±cuatrillones
        double pesoEnKilogramos = 68.543;

        // Tipo Carácter

        // char: Unicode de 0 a 65535 → representa letras o símbolos
        char genero = 'M';

        // Tipo Booleano

        // boolean: solo puede ser true o false
        boolean esEstudiante = true;

        // Tipo String (clase, no primitivo, pero muy usado)
        String nombreCompleto = "Carlos Andrés Gómez";

        // Imprimir resultados
        System.out.println("Información Personal:");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Edad (byte: -128 a 127 → ~±100): " + edad + " años");
        System.out.println("Género (char: 0 a 65535 → Unicode): " + genero);
        System.out.println("Altura (float: ±3.4e−38 a ±3.4e+38 → hasta ±billones): " + alturaEnMetros + " metros");
        System.out.println("Peso (double: ±1.7e−308 a ±1.7e+308 → hasta ±cuatrillones): " + pesoEnKilogramos + " kg");
        System.out.println("¿Es estudiante? (boolean: true o false): " + esEstudiante);

        System.out.println("\nOtros datos:");
        System.out.println("Cantidad de productos (short: -32.768 a 32.767 → ~±30 mil): " + cantidadDeProductos);
        System.out.println("Población ciudad (int: -2.147.483.648 a 2.147.483.647 → ~±2 mil millones): " + poblacionCiudad);
        System.out.println("Distancia a la luna (long: -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807 → ~±9 quintillones): " + distanciaEnMetros + " metros");
    }
}
