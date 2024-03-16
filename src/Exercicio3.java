import java.util.InputMismatchException;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        double valor_compra;
        double valor_venda =0;
        double representante;
        double impostos;



        Scanner leitura = new Scanner(System.in);

        System.out.println("\n--- CALCULO DE MERCADORIA---");

        try{
            System.out.println("\nInsira seu valor de compra:");
            valor_compra = leitura.nextDouble();
        }catch (InputMismatchException e){
            System.out.println("Ops.. so é aceito numero!");
            return;
        }

        // Calculos
        representante = valor_compra *0.20;
        impostos = valor_compra *0.30;


        valor_venda= valor_compra + representante + impostos;

        System.out.println("\nCalculos:");
        System.out.println("Valor da venda:" + valor_venda);
        System.out.println("Valor do representante:" + representante);
        System.out.println("Valor do imposto:" + impostos);


    }
}
