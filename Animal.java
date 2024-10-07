
public class Animal {
    protected String raca;
    protected String nome;

    public Animal(){
        this.raca = raca;
        this.nome = nome;
    }

    public Animal(String nome){
        this.nome = nome;
    }

    public void caminha(){
        System.out.println("quadrúpede");
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}