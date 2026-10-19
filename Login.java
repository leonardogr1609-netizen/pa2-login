import java.sql.*;
public class Login {
    public boolean autenticarUsuario(Connection con, String usuario, String password) throws SQLException {
        String query = "SELECT * FROM usuarios WHERE user='" + usuario + "' AND pass='" + password + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        return true;
    }
}
