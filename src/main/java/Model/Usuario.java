package Model;

/**
 * CLASE POJO CON METODOS SETTER Y GETTER
 * CLASE QUE OPERARA COMO USUARIO
 */

public class Usuario {

    private static int id_usuario;
    private String nombreU;
    private String apellidoU;
    private Tarjeta codTarjeta;

    public Usuario( String nombreU, String apellidoU, Tarjeta codTarjeta) {
        this.id_usuario = ++id_usuario;
        this.nombreU = nombreU;
        this.apellidoU = apellidoU;
        this.codTarjeta = codTarjeta;
    }

    public Usuario() {

    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getApellidoU() {
        return apellidoU;
    }

    public void setApellidoU(String apellidoU) {
        this.apellidoU = apellidoU;
    }


    public Tarjeta getCodTarjeta() {
        return codTarjeta;
    }

    public void setCodTarjeta(Tarjeta codTarjeta) {
        this.codTarjeta = codTarjeta;
    }

    @Override
    public String toString() {
        return "usuario{" +
                "id_usuario=" + id_usuario +
                ", nombreU='" + nombreU + '\'' +
                ", apellidoU='" + apellidoU + '\'' +
                ", codigocodTarjeta=" + codTarjeta.toString() +
                '}';
    }

}
