public class EstructurasControl {
    public static void main(String[] args) {
        // IF SIMPLE
        double precioAuto = 105000;
        if (precioAuto > 100000) {
            System.out.println("El auto está muy caro.");
        }

        // IF - ELSE
        precioAuto = 95000;
        if (precioAuto <= 100000) {
            System.out.println("Compramos el auto.");
        } else {
            System.out.println("No lo compramos.");
        }

        // IF - ELSE IF - ELSE
        precioAuto = 87000;
        if (precioAuto < 90000) {
            System.out.println("Precio muy bajo, puede tener problemas.");
        } else if (precioAuto <= 100000) {
            System.out.println("Buen precio, lo compramos.");
        } else {
            System.out.println("Precio muy alto, descartado.");
        }

        // SWITCH con número
        int numero = 2;
        switch (numero) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            default:
                System.out.println("Otro número");
        }

        // WHILE: contar del 1 al 5

     precioAuto = 105000;

     while (precioAuto < 90000 || precioAuto > 100000) {
            System.out.println("Buscando otro auto... Precio actual: " + precioAuto);
            precioAuto -= 5000; // Simulamos que baja el precio
        }

        // FOR: revisar 3 autos
        System.out.println("Revisando 3 autos:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Auto #" + i + " revisado.");
        }

        // FOR + IF: saber si un número es par o impar
        System.out.println("Par o impar del 0 al 9:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " es par");
            } else {
                System.out.println(i + " es impar");
            }
        }
    }
}
