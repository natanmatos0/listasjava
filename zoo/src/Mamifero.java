public class Mamifero extends Animal{
    public Mamifero(String nome, String especie, int numPatas) {
        super(nome, especie, numPatas);

    }


    public void amamentar(){
        System.out.println("O animal " + getNome() + " está amamentando");
    }
}
