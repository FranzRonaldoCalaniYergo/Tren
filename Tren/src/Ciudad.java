public class Ciudad {
    String nombre;

    @Override
    public String toString() {
        return "Ciudad{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public Ciudad(){

    }

    public Ciudad(String nombre) {
        this.nombre = nombre;
    }
}
