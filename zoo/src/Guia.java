public class Guia extends Funcionario{
    public Guia(String nome, int idade, String matricula, String cargo) {
        super(nome, idade, matricula, cargo);
    }

    public void realizarPasseio() {
            System.out.println("Meu nome é " + getNome() + " e eu realizei um passeio com um animal" );
    }

}
