package Senai_LLP_Variaveis_Geometria;

public class TuboArea {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Você deve informar o raio e a altura do tubo.");
        }

        double raio = Double.parseDouble(args[0]);
        double h = Double.parseDouble(args[1]);
        double area = 2 * Math.PI * raio * h + 2 * Math.PI * Math.pow(raio, 2);

        System.out.printf("A área do tubo é: %.2f\n", area);
    }
}
