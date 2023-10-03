package trabajo_practico_2_act_1_Extra_Cafetera;

public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;

    // Constructor predeterminado
    public Cafetera() {
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    // Constructor con la capacidad máxima de la cafetera
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        cantidadActual = 0;
    }

    // Constructor con la capacidad máxima y la cantidad actual
    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        if (cantidadActual > capacidadMaxima) {
            this.cantidadActual = capacidadMaxima;
        } else {
            this.cantidadActual = cantidadActual;
        }
    }

   
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    private void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima >= 250) {
            this.capacidadMaxima = capacidadMaxima;
        } else {
            this.capacidadMaxima = 250;
        }
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    private void setCantidadActual(int cantidadActual) {
        if (cantidadActual >= 0 && cantidadActual <= capacidadMaxima) {
            this.cantidadActual = cantidadActual;
        }
    }

    
    public void llenar() {
        cantidadActual = capacidadMaxima;
    }

    public void servirTaza(int cantidad) {
        if (cantidadActual >= cantidad) {
            cantidadActual -= cantidad;
        } else {
            cantidadActual = 0;
        }
    }

    public void vaciar() {
        cantidadActual = 0;
    }

    public int agregarCafe(int cantidad) {
        if (cantidadActual + cantidad <= capacidadMaxima) {
            cantidadActual += cantidad;
            return 0; // No sobra café
        } else {
            int sobrante = cantidadActual + cantidad - capacidadMaxima;
            cantidadActual = capacidadMaxima;
            return sobrante; // Devuelve la cantidad sobrante
        }
    }

    @Override
    public String toString() {
        return "Capacidad Máxima: " + capacidadMaxima + " ml\nCantidad Actual: " + cantidadActual + " ml";
    }
}

