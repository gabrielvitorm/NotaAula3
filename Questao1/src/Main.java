import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,r;
        Scanner sc = new Scanner(System.in);
        Gerente g = new Gerente();
        Programador p = new Programador();

        do {
            System.out.println("Escolha uma das opções abaixo:\n1 - Cadastrar Gerente\n2 - Cadastrar Programador\n3 - Exibir detalhes do gerente\n4 - Exibir detalhes do programador");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Digite o nome do gerente");
                    g.setNome(sc.next());

                    System.out.println("Digite a data de nascimento do gerente");
                    g.setNasc(sc.nextInt());

                    System.out.println("Digite o salário do gerente");
                    g.setSalario(sc.nextDouble());

                    System.out.println("Digite o nome do projeto que o gerente trabalha");
                    g.setProjeto(sc.next());
                    break;
                case 2:
                    System.out.println("Digite o nome do programador");
                    p.setNome(sc.next());

                    System.out.println("Digite a data de nascimento do programador");
                    p.setNasc(sc.nextInt());

                    System.out.println("Digite o salário do funcionário");
                    p.setSalario(sc.nextDouble());

                    System.out.println("Digite a liguagem que o programador trabalha");
                    p.setLinguagem(sc.next());
                    break;
                case 3:
                    System.out.println("Informações do Gerente:");
                    System.out.printf("Nome do gerente: %s\n", g.nome);
                    g.calcularIdade();
                    System.out.printf("Idade do gerente: %d\n", g.idade);
                    g.informarSalario();
                    g.informarProjeto();
                    break;
                case 4:
                    System.out.println("Informações do Programador:");
                    System.out.printf("Nome do Programador: %s\n", p.nome);
                    p.calcularIdade();
                    System.out.printf("Idade do Programador: %d\n", p.idade);
                    p.informarSalario();
                    p.informarLinguagem();
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Para abrir novamente o menu digite 0");
            r = sc.nextInt();
        }while (r==0);
    }
}