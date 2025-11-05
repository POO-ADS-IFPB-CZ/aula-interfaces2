public class Poupanca extends Conta implements Rentavel{

    private double taxaJuros;

    public Poupanca(String titular, double saldo, double taxaJuros) {
        super(titular, saldo);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public boolean renderJuros() {
        setSaldo(getSaldo()+(getSaldo()*taxaJuros)/100);
        return true;
    }
}
