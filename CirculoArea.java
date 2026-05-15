package Senai_LLP_Variaveis_Geometria;

public class CirculoArea {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Escreva o valor do raio do círculo");
            return;
        }

        double raio = Double.parseDouble(args[0]);
        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do círculo é: %.2f\n", area);
    }
}
