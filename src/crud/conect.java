package crud;

import java.sql.DriverManager;

/**
 *
 * @author casa
 */
public class conect {
    
    public static final String ubicacion = "jdbc:mysql://localhost/empresa_abc";

    public static final String usuario = "root";

    public static final String contraseña = "";

    public static com.mysql.jdbc.Connection getConection() {
        com.mysql.jdbc.Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection(getUbicacion(), getUsuario(), getContraseña());
        } catch (Exception e) {
            System.out.println("Error en la conexion "+e);
        }
        return con;
    }

    public static String getUbicacion() {
        return ubicacion;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static String getContraseña() {
        return contraseña;
    }
}
