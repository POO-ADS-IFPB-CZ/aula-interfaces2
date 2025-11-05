public abstract class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacar(double valor){
        if(valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public boolean depositar(double valor){
        if(valor > 5000) return false;
        saldo += valor;
        return true;
    }

}