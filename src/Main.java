import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente("João", 0,
                20);
        conta.depositar(100);
        conta.sacar(10);
        conta.descontarTaxas();
        conta.sacar(10000);
        System.out.println(conta.getSaldo());

        Poupanca poupanca = new Poupanca("Maria", 0,
                5);
        poupanca.depositar(100);
        poupanca.sacar(10);
        poupanca.renderJuros();
        System.out.println(poupanca.getSaldo());

    }

}
