package Service;

import java.sql.Connection;

public interface MetodosCrudDb {

    public void insert(String insertar, Connection con);

    public void delete(Integer delete);

    public Integer uptade(Integer update);

    public Integer  read(Integer read);

}
