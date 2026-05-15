package Senai_LLP_Variaveis_Geometria;

public class TrianguloArea {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Escreva a base e altura do triângulo.");
            return;
        }

        double base = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);

        double area = base * h / 2;

        System.out.printf("A área do triângulo é: %.2f\n", area);
    }
}
