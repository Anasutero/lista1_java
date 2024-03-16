import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        String data_nascimento; // Alterado para String
        double pretensao_salarial;
        String grau_instrucao;
        String cargo_pretendido;
        String CNH;
        String confirmacao;

        Scanner leitura = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("\nRegistro de dados");

        while (continuar) {
            System.out.println("\nInsira o seu nome:");
            nome = leitura.nextLine();

            System.out.println("Insira seu sobrenome:");
            sobrenome = leitura.nextLine();

            try {
                System.out.println("Insira sua data de nascimento (DD/MM/AAAA):");
                data_nascimento = leitura.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                Date data = sdf.parse(data_nascimento);
                data_nascimento = sdf.format(data);
            } catch (ParseException e) {
                System.out.println("Erro: Por favor digite a data no formato correto (DD/MM/AAAA)!");
                continue;
            }

            try {
                System.out.println("Insira sua pretensão salarial:");
                pretensao_salarial = Double.parseDouble(leitura.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: Por favor digite apenas números!");
                continue;
            }

            System.out.println("Insira seu grau (ensino médio, ensino técnico ou ensino superior):");
            grau_instrucao = leitura.nextLine();

            System.out.println("Insira o seu cargo pretendido:");
            cargo_pretendido = leitura.nextLine();

            System.out.println("Insira se você possui tipo de CNH B (S/N)");
            CNH = leitura.nextLine();
            if (CNH.equalsIgnoreCase("S")) {
                System.out.println("\nÓtimo, você pode dirigir em nossas dependências.");
            } else if (!CNH.equalsIgnoreCase("N")) {
                System.out.println("\n(Insira: S OU N).");
                continue;
            } else {
                System.out.println("\nOps... você não pode dirigir aqui..");
            }

            System.out.println("\nFaça a confirmação de seus dados:");
            System.out.println("O seu nome:" + nome);
            System.out.println("O seu sobrenome:" + sobrenome);
            System.out.println("A sua data de nascimento:" + data_nascimento);
            DecimalFormat df = new DecimalFormat("#.##"); // Define o formato para até 2 casas decimais
            System.out.println("Sua pretensão salarial: R$ " + df.format(pretensao_salarial));
            System.out.println("Seu grau de instrução:" + grau_instrucao);
            System.out.println("Seu cargo pretendido:" + cargo_pretendido);
            System.out.println("Seu tipo de CNH:" + CNH);

            System.out.println("\nPor favor faça a confirmação se os dados estão corretos (S/N):");
            confirmacao = leitura.nextLine();
            if (confirmacao.equalsIgnoreCase("S")) {
                System.out.println("\nObrigado pelo seu cadastro!");
                continuar = false;
            } else {
                System.out.println("Por favor insira todos os dados novamente.");
            }
        }
    }
}
