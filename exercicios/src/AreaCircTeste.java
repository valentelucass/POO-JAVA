import java.awt.geom.Area;
import java.util.Scanner;

public class AreaCircTeste {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um valor (exemplo: 5,0): ");
        double num = input.nextDouble();
        AreaCirc a1 = new AreaCirc(num);
        // a1.pi = 10;

        AreaCirc a2 = new AreaCirc(num);
        // a2.pi = 4;

        // AreaCirc.PI = 3.1415;

        System.out.println("Área do círculo a1: " + a1.area());
        System.out.println("Área do círculo a2: " + a2.area());
        System.out.println("Valor da constante PI da classe AreaCirc: " + AreaCirc.PI);
        System.out.println("Valor da constante PI do Java (Math.PI): " + Math.PI); // funcao do proprio java e puxa internamente
        System.out.println("Área de um círculo com raio 110 usando método estático: " + AreaCirc.area(110));


        input.close();
    }
}