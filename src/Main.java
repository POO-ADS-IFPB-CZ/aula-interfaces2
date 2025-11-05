import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        Conta c1 = new ContaCorrente("Mario", 100,
                10);
        Conta c2 = new Poupanca("Maria", 10,
                5);

        System.out.println(c1.compareTo(c2));

    }

}
