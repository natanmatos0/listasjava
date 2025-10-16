public class Main {
    public static void main(String[] args) {

        pessoa p = new pessoa("Cleiton", 16);
        p.apresentar();


        Guia f = new Guia("Jose",21, "1234", "Guia");
        f.realizarPasseio();

        Limpeza l = new Limpeza("Jetson",21, "1234", "Limpeza");
        l.limparEspacos();

        Tratador t = new Tratador("Joao",21, "1234", "Tratador");
        t.alimentarAnimais();

        Animal c = new Animal("Cao", "Cachorro", 2);
        c.emitirSom();
    }
}