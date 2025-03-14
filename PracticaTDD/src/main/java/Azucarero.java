
public class Azucarero {
    private int cantidadAzucar;

    public Azucarero(int cantidad) {
        this.cantidadAzucar = cantidad;  
    }

    public boolean hasAzucar(int cantidad) {
        return this.cantidadAzucar >= cantidad;
    }

    public void giveAzucar(int cantidad) {
        if (this.hasAzucar(cantidad)) {
            this.cantidadAzucar -= cantidad;
        }
    }

    public int getCantidadAzucar() {
        return this.cantidadAzucar;
    }
}



