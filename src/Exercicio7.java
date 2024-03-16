import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        String nome=null;
        String mes=null;
        int carros_vendidos = 0;
        int valor_vendas = 0;
        double salario_fixo = 1500;
        int valor_comissao = 350;
        double lucro_loja = 0.001;
        double salario_final = 0;

        Scanner leitura = new Scanner(System.in);

        System.out.println("\n--Programa do cálculo do salário mensal do vendedor---");


            System.out.println("\nInsira o nome do vendedor:");
            nome = leitura.nextLine();

            System.out.println("Insira o mês da venda a ser calculada:");
            mes = leitura.nextLine();


        try {
            System.out.println("Insira a quantidade de carros vendidos:");
            carros_vendidos = leitura.nextInt();

            System.out.println("Insira o valor total das vendas:");
            valor_vendas = leitura.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ops.. Apenas números são aceitos para a quantidade de carros e valor das vendas.");
            System.exit(0);
        }

        // cálculos
        double comissao = carros_vendidos * valor_comissao;
        double comissao_loja = valor_vendas * lucro_loja;
        salario_final = salario_fixo + comissao + comissao_loja;

        // saída
        System.out.println("\n---Informações do vendedor---");
        System.out.println("Nome: " + nome);
        System.out.println("Mês: " + mes);
        System.out.println("Quantidade de carros vendidos: " + carros_vendidos);
        System.out.println("Valor total das vendas: R$" + valor_vendas);
        System.out.println("Salário final do vendedor: R$" + salario_final);
    }
}
