package trabajo_practico_2_Ej_9;

public class Domicilio {
    private String calle;
    private int altura;
    private String barrio;

    public Domicilio(String calle, int altura, String barrio) {
        this.calle = calle;
        this.altura = altura;
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return calle + " " + altura + ", " + barrio;
    }
}