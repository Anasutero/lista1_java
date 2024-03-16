import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        double nota1 = 0;
        double nota2 = 0;
        double peso1=0;
        double peso2=0;
        double media_ponderada = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("\n---Calculo da media ponderada--");

        try{
            System.out.println("\nInsira o valor da nota 1:");
            nota1= leitura.nextDouble();

            System.out.println("Insira o valor da nota 2:");
            nota2= leitura.nextDouble();

        }catch (InputMismatchException e){
            System.out.println("Ops.. Só é aceito número.");
            System.exit(0);
        }

        //calculos
        peso1 = nota1 *40 /100;
        peso2=nota2 *60 / 100;

        media_ponderada= (nota1 *peso1 + nota2 *peso2) /10;

        System.out.println("\nO valor da sua nota ponderada é:" +media_ponderada);
    }
}
