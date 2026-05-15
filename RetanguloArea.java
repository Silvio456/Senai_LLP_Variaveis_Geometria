package Senai_LLP_Variaveis_Geometria;

public class RetanguloArea {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Você deve informar base e altura.");
            return;
        }

        double base = Double.parseDouble(args[0]);
        double altura = Double.parseDouble(args[1]);

        double area = base * altura;

        System.out.printf("A área do retângulo é: %.2f\n", area);
    }
}
