public class Passaro implements Voavel{

    private String especie;

    public Passaro(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void voar(){
        System.out.println("Voando com as asas");
    }

}