import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        int horas = 0;
        int minutos = 0;
        int segundos = 0;
        int horarioEmSegundos;

        Scanner leitura = new Scanner(System.in);

        System.out.println("\n--Programa para converter horário---");

        try {
            System.out.println("\nInsira as horas:");
            horas = leitura.nextInt();

            System.out.println("Insira os minutos:");
            minutos = leitura.nextInt();

            System.out.println("Insira os segundos:");
            segundos = leitura.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Ops.. Só é aceito número.");
            System.exit(0);
        }

        // Convertendo o horário para segundos
        horarioEmSegundos = horas * 3600 + minutos * 60 + segundos ;

        System.out.println("\nO horário em segundos é: " + horarioEmSegundos);
    }
}
