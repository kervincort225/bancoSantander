package BaseDatos;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * CLASE UTILIZADA PARA HACER LA CONEXION A BASE DE DATOS
 * ESTA MODULARIZADA PARA PODER SER UTILIZADA POR CUALQUIER BASE DE DATOS
 */
public class Conexion extends config {

    Properties sustraccionConfiguracion = sustraccionConfiguracion();
    String dbname = sustraccionConfiguracion.getProperty("dbname");
    String db_user = sustraccionConfiguracion.getProperty("db_user");
    String servername = sustraccionConfiguracion.getProperty("servername");
    String db_pass = sustraccionConfiguracion.getProperty("db_pass");
    String drive = sustraccionConfiguracion.getProperty("drive");
    String puerto = sustraccionConfiguracion.getProperty("puerto");
    String jdbc = sustraccionConfiguracion.getProperty("jdbc");
    String schema = sustraccionConfiguracion.getProperty("schema");

    public Conexion() throws IOException {
    }


    public Connection connectDatabase() {
        try {
            // We register the PostgreSQL driver
            // Registramos el driver de PostgresSQL
            try {
                Class.forName(drive);
            } catch (ClassNotFoundException ex) {
                System.out.println("Error al registrar el driver de PostgreSQL: " + ex);
            }
            Connection connection;
            connection = DriverManager.getConnection(jdbc+"://"+servername+":"+puerto+"/"+dbname+"?user="+db_user+"&password="+db_pass);
            connection.setAutoCommit(false);

//            String databaseURL = "jdbc:mysql://localhost:3306/test?user=root&password=root123";
            if (drive.equalsIgnoreCase("org.postgresql.Driver")){
                boolean valid = connection.isValid(1500);
                System.out.println(valid ? "TEST OK" : "TEST FAIL");
            }
            return connection;
        } catch (java.sql.SQLException sqle) {
            System.out.println("Error: " + sqle);
            return (Connection) sqle;
        }
    }

    @Override
    public String toString() {
        return "Conexion{" +
                ", dbname='" + dbname + '\'' +
                ", db_user='" + db_user + '\'' +
                ", servername='" + servername + '\'' +
                ", db_pass='" + db_pass + '\'' +
                ", drive='" + drive + '\'' +
                ", puerto='" + puerto + '\'' +
                ", jdbc='" + jdbc + '\'' +
                ", schema='" + schema + '\'' +
                '}';
    }



}