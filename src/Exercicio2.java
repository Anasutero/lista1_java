import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Integer numero1 = null;
        Integer numero2 = null;
        double soma;
        double subtracao;
        double multiplicacao;
        double divisao;
        double potnciacao;
        double resto;

        Scanner leitura = new Scanner(System.in);

        System.out.println("\n--programa de calculos---");

        try{
            System.out.println("\nInsira o primeiro numero:");
            numero1=leitura.nextInt();

            System.out.println("Insira o segundo numero:");
            numero2=leitura.nextInt();
        }catch (InputMismatchException e ){
            System.out.println("ERRO: Ops.. So aceitamoos numero inteiro.");
            System.exit(0); // Encerra o programa após o erro
        }

        // Verifica se numero2 é zero antes de fazer a divisão
        if (numero2 == 0) {
            System.out.println("ERRO: Divisão por zero não é permitida.");
            System.exit(0); // Encerra o programa após o erro
        }


        //contas
        soma =numero1 + numero2;

        subtracao=numero1 - numero2;

        multiplicacao=numero1 * numero2;

        divisao= (double)numero1 / numero2;

        potnciacao=  Math. pow(numero1, numero2);

        resto = numero1 % numero2;

        System.out.println("\nOs resultados dos numeros inseridos são:");
        System.out.println("\nSoma:" +soma);
        System.out.println("Subtração:" +subtracao);
        System.out.println("Multiplicação:" +multiplicacao);
        System.out.println("Divisão:" +divisao);
        System.out.println("Potenciação:" +potnciacao);
        System.out.println("Resto divisão:" + resto);


    }
}
