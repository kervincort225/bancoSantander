import BaseDatos.Conexion;

import Model.Tarjeta;
import Model.Usuario;
import Service.CrudTarjeta;
import Service.MetodosCrudDbImpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * APLICACION CREADA PARA SIMULAR LA LOGICA DE CREACION DE USUARIO Y TARJETA BANCARIA DENTRO DE UNA BASE DE DATOS.
 * @author kervin cortez
 */
public class main  {

    public static void main (String[] args) throws IOException, SQLException {

/**
 * **************CONEXION A BASE DE DATOS
 */
        Conexion conectarBD = new Conexion();
        Connection con = conectarBD.connectDatabase();
/**
 * **************CREACION DE USUARIO Y NUMERO DE TARJETA
 */
        Usuario user1 = new Usuario("kervin","cortez",new Tarjeta(21282519,"kervin"));
        System.out.println(user1);
/**
 * *************INSERCIONES DE USUARIOS EN BD DE DATOS
 */
        CrudTarjeta tarjeta = new CrudTarjeta();
        tarjeta.insert("pruba",con);
        System.out.println("paso");



//        Map<String,Object > lista = new HashMap<String, Object>();
//        lista.put("1",user1);
//        System.out.println(lista);


//        cerrar conexion de base datos
        con.close();
    }

}
