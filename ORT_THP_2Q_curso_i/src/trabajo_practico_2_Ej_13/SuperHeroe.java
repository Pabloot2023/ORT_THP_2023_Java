package trabajo_practico_2_Ej_13;

public class SuperHeroe {
    private String nombre;
    private int fuerza;
    private int resistencia;
    private int superpoderes;

    public SuperHeroe(String nombre, int fuerza, int resistencia, int superpoderes) {
        setNombre(nombre);
        setFuerza(fuerza);
        setResistencia(resistencia);
        setSuperpoderes(superpoderes);
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFuerza() {
        return fuerza;
    }

    private void setFuerza(int fuerza) {
        this.fuerza = validarPoder(fuerza);
    }

    public int getResistencia() {
        return resistencia;
    }

    private void setResistencia(int resistencia) {
        this.resistencia = validarPoder(resistencia);
    }

    public int getSuperpoderes() {
        return superpoderes;
    }

    private void setSuperpoderes(int superpoderes) {
        this.superpoderes = validarPoder(superpoderes);
    }

    private int validarPoder(int poder) {
        if (poder < 0) {
            return 0;
        } else if (poder > 100) {
            return 100;
        } else {
            return poder;
        }
    }

    public Resultado competir(SuperHeroe otroSuperHeroe) {
        int propioPoder = (fuerza + resistencia + superpoderes) / 3;
        int otroPoder = (otroSuperHeroe.getFuerza() + otroSuperHeroe.getResistencia() + otroSuperHeroe.getSuperpoderes()) / 3;

        if (propioPoder - otroPoder >= 2) {
            return Resultado.VICTORIA;
        } else if (otroPoder - propioPoder >= 2) {
            return Resultado.DERROTA;
        } else {
            return Resultado.EMPATE;
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Fuerza: " + fuerza + ", Resistencia: " + resistencia + ", Superpoderes: " + superpoderes;
    }
}