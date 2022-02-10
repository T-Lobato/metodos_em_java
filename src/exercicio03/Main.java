package exercicio03;

public class Main {
    public static void main(String[] args) {
        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = QuadrilateroReturn.area(3);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilateroReturn.area(5,5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilateroReturn.area(7,8,9);
        System.out.println("Área do trapézio: " + areaTrapezio);
    }
}
