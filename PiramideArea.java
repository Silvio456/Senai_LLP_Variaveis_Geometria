package Senai_LLP_Variaveis_Geometria;

public class PiramideArea {
    public static void main(String[] args) {

        if (args.length != 2 && args.length != 4) {
            System.out.println(
                    "Escreva 2 números para uma pirâmide com base quadrada e 4 números para uma com base triangular.");
                    return;
        }

        if (args.length == 2) {

            double ladoBase = Double.parseDouble(args[0]);
            double apotema = Double.parseDouble(args[1]);
            double areaTotal = Math.pow(ladoBase, 2) + (4 * ladoBase * apotema) / 2;

            System.out.printf("A área da pirâmide de base quadrada é: %.2f\n", areaTotal);
            return;
        }

        if (args.length == 4) {
            double baseTriangulo = Double.parseDouble(args[0]);
            double alturaTriangulo = Double.parseDouble(args[1]);
            double ladoBase = Double.parseDouble(args[2]);
            double apotema = Double.parseDouble(args[3]);
            double areaTotal = (baseTriangulo * alturaTriangulo) / 2 + (3 * ladoBase * apotema) / 2;

            System.out.printf("A área da pirâmide de base triangular é: %.2f\n", areaTotal);
            return;
        }
    }
}
