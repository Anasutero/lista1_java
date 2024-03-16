import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args){

        Integer numero = null;
        double antecessor;
        double subcessor;

        Scanner leitura = new Scanner(System.in);


        System.out.println("\n --Programa dos antecessor e sucessor---");

        try{
            System.out.println("Insira um numero :");
            numero = leitura.nextInt();

        }catch (InputMismatchException e){
            System.out.println("Ops..So é aceito numero inteiro.");
            System.exit(0); // Encerra o programa após o erro
        }

        //processamento
        antecessor = numero -1;
        subcessor = numero+1;

        //Saida
        System.out.println("\nO numeros são:");
        System.out.println("O numero é:" +numero);
        System.out.println("O seu antecessor é:" +antecessor);
        System.out.println("O seu sucessor é:" +subcessor);



    }
}
