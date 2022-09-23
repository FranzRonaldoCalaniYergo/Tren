public class Locomotora {
    int codigo;
    Tren tren;
    public Locomotora(){

    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "codigo=" + codigo +
                ", tren=" + tren +
                '}';
    }

    public Locomotora(int codigo) {
        this.codigo = codigo;
        this.tren = tren;
    }


}
