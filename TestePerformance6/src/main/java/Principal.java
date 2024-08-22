public class Principal {
    public static void main(String[] args) {
        try {
            int numero = 5;
            int fatorial = calcularFatorial(numero);
            System.out.println(" O fatorial de " + numero + " é: " + fatorial);
        }catch (ArithmeticException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int calcularFatorial(int numero) {

        if (numero == 0) {
            return 1;
        }

        if(numero < 0){
            throw new ArithmeticException("Erro ao calcular fatorial. Fatorial não pode ser negativo.");
        }

        int resultado = 1;

        while (numero > 1){
            resultado  *= numero;
            numero--;
        }
        return resultado;
    }
}
