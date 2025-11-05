import java.io.Serializable;

public class Main {

    public static void main(String[] args) {

        Conta contas[] = {
                new ContaCorrente("João", 100, 10),
                new Poupanca("Maria", 100, 5)
        };

        for(Conta c : contas){
            if(c instanceof Tributavel){
                ((Tributavel) c).descontarTaxas();
            }
            if(c instanceof Rentavel){
                ((Rentavel) c).renderJuros();
            }
        }

        for(Conta c: contas){
            System.out.println(c.getSaldo());
        }

    }

}
