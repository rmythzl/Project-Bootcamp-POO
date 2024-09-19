import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.*;

public class Main {
    private static Map<String, Dev> devsCadastrados = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Criando cursos e mentorias
        Curso cursoJava = new Curso("Curso de Java", "Aprenda Java do básico ao avançado", 10);
        Curso cursoPython = new Curso("Curso de Python", "Curso completo de Python", 8);
        Mentoria mentoriaJava = new Mentoria("Mentoria Java", "Discussão sobre boas práticas em Java", 4, LocalDate.now());

        // Criando bootcamp e adicionando conteúdos
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do Bootcamp Java Developer");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(cursoPython);
        bootcamp.adicionarConteudo(mentoriaJava);

        // Loop principal
        boolean continuar = true;
        while (continuar) {
            System.out.println("Bem-vindo ao sistema do Bootcamp da THZN!");
            System.out.println("1. Fazer login");
            System.out.println("2. Fazer cadastro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do newline

            switch (opcao) {
                case 1:
                    fazerLogin(bootcamp);
                    break;
                case 2:
                    fazerCadastro();
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Saindo do sistema... THZN Agradece");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private static void fazerLogin(Bootcamp bootcamp) {
        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        Dev dev = devsCadastrados.get(email);
        if (dev != null) {
            System.out.println("Login realizado com sucesso! Bem-vindo, " + dev.getNome());
            interagirComBootcamp(dev, bootcamp);
        } else {
            System.out.println("Usuário não encontrado. Por favor, cadastre-se primeiro.");
        }
    }

    private static void fazerCadastro() {
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine();

        if (devsCadastrados.containsKey(email)) {
            System.out.println("Usuário já cadastrado com este email.");
        } else {
            Dev novoDev = new Dev(nome);
            devsCadastrados.put(email, novoDev);
            System.out.println("Cadastro realizado com sucesso! Bem-vindo, " + nome);
        }
    }

    private static void interagirComBootcamp(Dev dev, Bootcamp bootcamp) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("\n--- Menu do Bootcamp ---");
            System.out.println("1. Inscrever-se no Bootcamp");
            System.out.println("2. Progredir");
            System.out.println("3. Ver conteúdo inscrito");
            System.out.println("4. Ver conteúdo concluído");
            System.out.println("5. Ver XP acumulado");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do newline

            switch (opcao) {
                case 1:
                    dev.inscreverBootcamp(bootcamp);
                    System.out.println("Você foi inscrito no Bootcamp " + bootcamp.getNome());
                    break;
                case 2:
                    dev.progredir();
                    System.out.println("Você progrediu no Bootcamp.");
                    break;
                case 3:
                    System.out.println("Conteúdos Inscritos: " + dev.getConteudosInscritos());
                    break;
                case 4:
                    System.out.println("Conteúdos Concluídos: " + dev.getConteudosConcluidos());
                    break;
                case 5:
                    System.out.println("XP Acumulado: " + dev.calcularTotalXp());
                    break;
                case 6:
                    continuar = false;
                    System.out.println("Saindo do Bootcamp...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
