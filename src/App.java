public class App {
    public static void main(String[] args) throws Exception {
        int n = 5;
        int resultadoFinal = factorial(n);
        System.out.println("resultado: " + resultadoFinal);
        EjerciciosRecursivos ejercicios = new EjerciciosRecursivos();
        int resultadoFibonacci = ejercicios.fibonacci(5); // ejemplo: fibonacci de 6
        System.out.println("Fibonacci(6) = " + resultadoFibonacci);

        // Llamar al método sumaConsecutivos
        int resultadoSuma = ejercicios.sumaConsecutivos(5); // ejemplo: suma de 5 + 4 + 3 + 2 + 1
        System.out.println("Suma consecutivos(5) = " + resultadoSuma);

        int resultadoPotencia = ejercicios.getPotencia(2, 3);
        System.out.println("-resultado de potencia =" + resultadoPotencia);
        


        int resultadoDigitos = ejercicios.getSumaDigitos(125);
        System.out.println("-resultado digitos = "  +  resultadoDigitos);
    }

    public static int factorial(int n) {
        if(n == 0) {
            System.out.println("Alcancé el caso base");
            return 1;
            
        }
        int resultado = n * factorial(n-1);
        System.out.println("Calculando factorial de: " + n + " factorial ("+ (n-1)+" - 1)");
        return resultado;

    }

    


}

 