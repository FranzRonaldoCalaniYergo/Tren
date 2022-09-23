public class Vagon {
    Tren tren;
    String tipo;
    int capacidad;

    @Override
    public String toString() {
        return "Vagon{" +
                "tren=" + tren +
                ", tipo='" + tipo + '\'' +
                ", capacidad=" + capacidad +
                '}';
    }

    public Vagon(){

    }

    public Vagon(String tipo, int capacidad) {
        this.tren = tren;
        this.tipo = tipo;
        this.capacidad = capacidad;
    }
}


