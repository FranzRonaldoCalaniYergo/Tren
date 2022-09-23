public class Tren {
    int codigo;

    @Override
    public String toString() {
        return "Tren{" +
                "codigo=" + codigo +
                '}';
    }

    public Tren(){

    }

    public Tren(int codigo) {
        this.codigo = codigo;
    }
}
