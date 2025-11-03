import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(2);
        quadrado.descrever();
        Circulo circulo = new Circulo(4);
        circulo.descrever();
        AreaCalculavel.teste();

    }

    public static void salvar(Serializable serializable){
        System.out.println("Salvo");
    }

}
