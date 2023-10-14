package trabajo_practico_2_act_1_Ejs_7;

public class LectoraDVD {
    private String marca;
    private boolean puedeGrabar;

    public LectoraDVD(String marca, boolean puedeGrabar) {
        this.marca = marca;
        this.puedeGrabar = puedeGrabar;
    }

    public void validarGrabadora() {
        if (puedeGrabar) {
            System.out.println("La lectora de DVD puede grabar.");
        } else {
            System.out.println("La lectora de DVD no puede grabar.");
        }
    }
}