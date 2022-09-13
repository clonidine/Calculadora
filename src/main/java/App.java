import entities.Calculadora;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro número: ");
        Integer num1 = sc.nextInt();

        System.out.print("Segundo número: ");
        Integer num2 = sc.nextInt();

        sc.nextLine();
        System.out.print("Operação: ");
        String operacao = sc.nextLine();

        Calculadora calculadora = new Calculadora(operacao, num1, num2);
        System.out.println(calculadora.calcular());
    }
}
