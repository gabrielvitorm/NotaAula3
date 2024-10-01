public class Programador extends Funcionario {

    private String linguagem;

    public void setLinguagem(String linguagem){
        this.linguagem = linguagem;
    }

    public void informarLinguagem(){
        System.out.printf("O programador usa a liguagem: %s\n", linguagem);
    }
}
