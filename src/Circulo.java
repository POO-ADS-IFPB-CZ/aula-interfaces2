import java.io.Serializable;

public class Circulo implements AreaCalculavel,
    PerimetroCalculavel, Serializable {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(raio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*raio;
    }

    @Override
    public void descrever(){
        System.out.println("Sou diferente: "+calcularArea());
    }

}