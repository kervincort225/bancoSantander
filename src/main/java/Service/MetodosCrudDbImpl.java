package Service;

import java.sql.Connection;
import java.sql.Statement;

public class MetodosCrudDbImpl implements MetodosCrudDb {


private Statement stmt;

    @Override
    public void insert(String insertar, Connection con) {

        try {
            stmt = con.createStatement();
            int codigoTarjeta = 21282519;
            String sql = "insert into usuario (nombre,apellido,codigotarjeta) values ('kervin','cortez',"+codigoTarjeta+");";
            stmt.executeUpdate(sql);
//            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
//                    + "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
//                    + "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
//            stmt.executeUpdate(sql);
//            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
//                    + "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
//            stmt.executeUpdate(sql);

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
