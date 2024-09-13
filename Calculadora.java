import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // Solicitar los números al usuario
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar los números al usuario
            System.out.print("Introduce el primer número: ");
            double num1;
            num1 = scanner.nextDouble();
            
            System.out.print("Introduce el segundo número: ");
            double num2 = scanner.nextDouble();
            
            // Solicitar la operación
            System.out.print("Elige una operación (+, -, *, /): ");
            char operacion = scanner.next().charAt(0);
            
            double resultado = 0;
            boolean operacionValida = true;
            
            // Realizar la operación
            switch (operacion) {
                case '+' -> resultado = num1 + num2;
                case '-' -> resultado = num1 - num2;
                case '*' -> resultado = num1 * num2;
                case '/' -> {
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                        operacionValida = false;
                    }
                }
                default -> {
                    System.out.println("Operación no válida.");
                    operacionValida = false;
                }
            }
            
            // Mostrar el resultado correcto
            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
        }
    }
}



