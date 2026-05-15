package Senai_LLP_Variaveis_Geometria;

public class CaixaArea {
    public static void main(String[] args) {

        if (args.length != 1 && args.length != 3) {
            System.out.println(
                    "Escreva 1 valor para calcular uma caixa cúbica ou 3 valores para uma caixa em formato de paralelepípedo.");
            return;
        }
        if (args.length == 1) {
            double a = Double.parseDouble(args[0]);
            double area = 6 * Math.pow(a, 2);

            System.out.printf("A área da caixa de formato cúbico é: %.2f\n", area);
            return;
        }

        if (args.length == 3) {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            double area = 2 * (a * b + a * c + b * c);

            System.out.printf("A área da caixa em formato de paralelepípedo é: %.2f\n", area);
            return;
        }
    }
}
