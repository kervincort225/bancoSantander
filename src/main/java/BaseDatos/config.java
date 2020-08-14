package BaseDatos;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * CLASE CONFIGURACION EXTERNA LEE LAS LIBRERIAS EXTERNAS PARA SER INSERTADAS DENTRO DE EL
 */
public abstract class config {

    public Properties sustraccionConfiguracion () throws IOException {

        Properties prop = new Properties();
        InputStreamReader input = null;
        input = new FileReader("config.properties");
        prop.load(input);
        return  prop;
    }

}
