import java.util.Scanner;

public class GuiaSegurancaDigital {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao = -1;

        // WHILE: mantém o usuário no programa até escolher sair
        while (opcao != 0) {
            System.out.println("\n========================================");
            System.out.println("   GUIA DE SEGURANÇA DIGITAL");
            System.out.println("========================================");
            System.out.println("1. Senhas Seguras");
            System.out.println("2. Golpes Online");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = lerInteiro();

            // SWITCH: direciona para o módulo escolhido
            switch (opcao) {
                case 1:
                    moduloSenhas();
                    break;
                case 2:
                    moduloGolpes();
                    break;
                case 0:
                    System.out.println("\nAté mais! Fique seguro online.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    static void moduloSenhas() {
        System.out.println("\n--- SENHAS SEGURAS ---");
        System.out.println("Uma boa senha deve ter:");
        System.out.println("- Pelo menos 12 caracteres");
        System.out.println("- Letras maiúsculas e minúsculas");
        System.out.println("- Números e símbolos (!@#$%)");
        System.out.println("- Nunca use datas de aniversário ou nomes");
        System.out.println();
        System.out.print("Quantos caracteres tem sua senha atual? ");

        int tamanho = lerInteiro();

        // IF: avalia a força da senha
        if (tamanho >= 12) {
            System.out.println("✓ Bom! Sua senha tem um tamanho adequado.");
        } else if (tamanho >= 8) {
            System.out.println("⚠ Atenção: sua senha é razoável, mas tente aumentar para 12+ caracteres.");
        } else {
            System.out.println("✗ Sua senha é curta e vulnerável. Troque-a agora!");
        }
    }

    static void moduloGolpes() {
        System.out.println("\n--- GOLPES ONLINE ---");
        System.out.println("Tipos de golpes mais comuns:");
        System.out.println("1. Phishing (e-mail ou link falso)");
        System.out.println("2. Golpe do falso suporte técnico");
        System.out.println("3. Golpe do Pix/pagamento urgente");
        System.out.println();
        System.out.print("Você já recebeu algum desses? (1-Sim / 2-Não): ");

        int resposta = lerInteiro();

        if (resposta == 1) {
            System.out.println("\nDicas se você recebeu um golpe:");
            System.out.println("- Não clique em links suspeitos");
            System.out.println("- Não forneça dados pessoais ou senhas");
            System.out.println("- Desconfie de urgência e pressão");
            System.out.println("- Em caso de dúvida, ligue direto para a empresa oficial");
        } else {
            System.out.println("\nÓtimo! Mas fique sempre atento.");
            System.out.println("- Verifique sempre o remetente de e-mails");
            System.out.println("- Nunca compartilhe senhas ou códigos recebidos por SMS");
        }
    }

    static int lerInteiro() {
        while (!sc.hasNextInt()) {
            System.out.print("Digite um número válido: ");
            sc.next();
        }
        return sc.nextInt();
    }
}
