import java.util.Date;

public class Reserva {
    String localizador;
    Date fechaEmision;
    Trayecto trayecto;

    @Override
    public String toString() {
        return "Reserva{" +
                "localizador='" + localizador + '\'' +
                ", fechaEmision=" + fechaEmision +
                ", trayecto=" + trayecto +
                '}';
    }

    public Reserva(){

    }

    public Reserva(String localizador, Date fechaEmision, Trayecto trayecto) {
        this.localizador = localizador;
        this.fechaEmision = fechaEmision;
        this.trayecto = trayecto;
    }
}
