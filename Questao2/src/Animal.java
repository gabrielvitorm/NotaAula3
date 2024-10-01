public class Animal {

    protected String nome, raca;

    public Animal(){}

    public Animal (String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public void caminha(){
        System.out.println("Estou caminhando feliz!");
    }
}
