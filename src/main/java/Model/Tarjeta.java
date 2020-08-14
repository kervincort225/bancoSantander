package Model;

/**
 * CLASE POJO CON METODOS SETTER Y GETTER
 * CLASE QUE OPERARA COMO TARJETA
 */
public class Tarjeta {

    private static int id_tarjeta;
    private Integer numero_tarjeta;
    private String usuario;

    public Tarjeta( int numero_tarjeta, String usuario) {
        this.id_tarjeta = ++id_tarjeta;
        this.numero_tarjeta = numero_tarjeta;
        this.usuario = usuario;
    }

    public int getid_tarjeta() {
        return id_tarjeta;
    }

    public void setid_tarjeta(int id_tarjeta) {
        this.id_tarjeta = id_tarjeta;
    }

    public int getnumero_tarjeta() {
        return numero_tarjeta;
    }

    public void setnumero_tarjeta(int numero_tarjeta) {
        this.numero_tarjeta = numero_tarjeta;
    }

    @Override
    public String toString() {
        return "tarjeta{" +
                "id_tarjeta=" + id_tarjeta +
                ", numero_tarjeta=" + numero_tarjeta +
                ", usuario='" + usuario + '\'' +
                '}';
    }
}
