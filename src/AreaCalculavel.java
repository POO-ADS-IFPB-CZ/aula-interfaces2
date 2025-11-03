public interface AreaCalculavel {

    double calcularArea();

    default void descrever(){
        System.out.println("Area: " + calcularArea());
    }

    static void teste(){
        System.out.println("Testando método estático");
    }

}
