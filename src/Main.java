import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(2);
        quadrado.descrever();
        Circulo circulo = new Circulo(4);
        circulo.descrever();
        AreaCalculavel.teste();

        autenticar(new Aluno());
        autenticar(new Fiscal());
        //
//        autenticar(new Professor());

    }

    public static boolean autenticar(Autenticavel autenticavel){
        return true;
    }

    public static void salvar(Serializable serializable){
        System.out.println("Salvo");
    }

}
