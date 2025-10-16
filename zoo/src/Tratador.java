public class Tratador extends Funcionario {
    public Tratador(String nome, int idade, String matricula, String cargo) {
        super(nome, idade, matricula, cargo);
    }
    public void alimentarAnimais() {
        System.out.println("Meu nome é " + getNome() + " e eu alimentei os animais");
    }
}
