package Service;

import java.sql.Connection;
import java.sql.Statement;

public class CrudTarjeta implements MetodosCrudDb {

    private Statement stmt;
    
    @Override
    public void insert(String insertar, Connection con) {
        try {
            stmt = con.createStatement();
//            int codigoTarjeta = 21282519;
            String sql = "insert into santander.tarjeta(NUMERO_TARJETA) values(21282519);";
            stmt.executeUpdate(sql);

            stmt.close();
            con.commit();
            con.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }


    @Override
    public void delete(Integer delete) {

    }

    @Override
    public Integer uptade(Integer update) {
        return null;
    }

    @Override
    public Integer read(Integer read) {
        return null;
    }
}
