import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
    double numero1;
    double numero2;
    double soma;
    Scanner teclado = new Scanner(System.in);
    numero1 = teclado.nextDouble();
    numero2 = teclado.nextDouble();
    soma = numero1 + numero2;
    System.out.println("A soma é: " + soma);
    }
}