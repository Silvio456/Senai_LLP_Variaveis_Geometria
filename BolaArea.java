package Senai_LLP_Variaveis_Geometria;

public class BolaArea {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Escreva um valor para o raio.");
            return;
        }

        double raio = Double.parseDouble(args[0]);
        double area = 4 * Math.PI * Math.pow(raio, 2);

        System.out.printf("A área da bola é: %.2f\n", area);
    }
}
