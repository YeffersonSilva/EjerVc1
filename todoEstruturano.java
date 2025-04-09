public class TodasLasEstructuras {
    public static void main(String[] args) {

        // IF SIMPLE
        double precio = 105000;
        if (precio > 100000) {
            System.out.println("IF SIMPLE: El auto está muy caro.");
        }

        // IF - ELSE
        precio = 95000;
        if (precio <= 100000) {
            System.out.println("IF-ELSE: Comprar auto.");
        } else {
            System.out.println("IF-ELSE: No comprar auto.");
        }

        // IF - ELSE IF - ELSE
        precio = 87000;
        if (precio < 90000) {
            System.out.println("IF-ELSE IF: Demasiado barato.");
        } else if (precio <= 100000) {
            System.out.println("IF-ELSE IF: Buen precio.");
        } else {
            System.out.println("IF-ELSE IF: Demasiado caro.");
        }

        // SWITCH
        int numero = 3;
        switch (numero) {
            case 1:
                System.out.println("SWITCH: Uno");
                break;
            case 2:
                System.out.println("SWITCH: Dos");
                break;
            default:
                System.out.println("SWITCH: Otro número");
        }

        // WHILE
        double valor = 105000;
        while (valor < 90000 || valor > 100000) {
            System.out.println("WHILE: Buscando auto... Valor actual: " + valor);
            valor -= 5000;
        }
        System.out.println("WHILE: Auto aceptable por: " + valor);

        // FOR
        System.out.println("FOR: Evaluando autos:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Auto #" + i + " evaluado.");
        }

        // FOR + CONTINUE
        System.out.println("FOR + CONTINUE: Mostrando solo números pares entre 1 y 6:");
        for (int i = 1; i <= 6; i++) {
            if (i % 2 != 0) continue; // Salta impares
            System.out.println("Número par: " + i);
        }

        // FOR + BREAK
        System.out.println("FOR + BREAK: Detener al llegar a 3");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("BREAK: Llegamos al número 3. Deteniendo...");
                break;
            }
            System.out.println("Número: " + i);
        }

        // OPERADOR TERNARIO
        int edad = 17;
        String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
        System.out.println("TERNARIO: " + mensaje);
    }
}
