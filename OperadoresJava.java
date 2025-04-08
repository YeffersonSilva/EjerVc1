public class OperadoresJava {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        boolean esValido = true;

        // -------------------- Aritméticos --------------------
        System.out.println("Operadores Aritméticos:");
        System.out.println("a + b = " + (a + b)); // suma
        System.out.println("a - b = " + (a - b)); // resta
        System.out.println("a * b = " + (a * b)); // multiplicación
        System.out.println("a / b = " + (a / b)); // división entera
        System.out.println("a % b = " + (a % b)); // módulo

        // -------------------- Relacionales --------------------
        System.out.println("\nOperadores Relacionales:");
        System.out.println("a == b: " + (a == b));   // igual
        System.out.println("a != b: " + (a != b));   // distinto
        System.out.println("a > b: " + (a > b));     // mayor que
        System.out.println("a < b: " + (a < b));     // menor que
        System.out.println("a >= b: " + (a >= b));   // mayor o igual que
        System.out.println("a <= b: " + (a <= b));   // menor o igual que

        // -------------------- Lógicos / Condicionales --------------------
        System.out.println("\nOperadores Lógicos (Condicionales):");
        System.out.println("(a > 0 && b > 0): " + (a > 0 && b > 0)); // AND
        System.out.println("(a < 5 || b < 5): " + (a < 5 || b < 5)); // OR
        System.out.println("!esValido: " + (!esValido));             // NOT
    }
}
