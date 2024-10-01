import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int x,r;
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();
        Cachorro c = new Cachorro("Tabata");
        Gato g = new Gato();

        System.out.println("Digite a Raça do Cachorro:");
        c.setRaca(sc.nextLine());

        System.out.println("Digite o nome do Gato:");
        g.setNome(sc.nextLine());

        System.out.println("Digite a raça do Gato:");
        g.setRaca(sc.nextLine());

        do {
            System.out.println("Escolha uma das opções abaixo:\n1 - Ver Cachorro\n2 - Ver gato");
            x = sc.nextInt();
            switch (x){
                case 1:
                    System.out.println("Informções do Cachorro:");
                    System.out.printf("Nome: %s\n", c.nome);
                    System.out.printf("Raça: %s\n", c.raca);
                    a.caminha();
                    c.late();
                    break;
                case 2:
                    System.out.println("Informações do Gato");
                    System.out.printf("Nome: %s\n", g.nome);
                    System.out.printf("Raça: %s\n", g.raca);
                    a.caminha();
                    g.mia();
            }System.out.println("Digite 0 para ver o menu novamente");
            r = sc.nextInt();
        }while (r==0);
    }

}