package utils;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hirwa
 */
public class ConnectionToDataBase {
    
    public Connection con = null;
    public PreparedStatement ps = null;
    public Statement rs = null;
    public ResultSet s = null;
    
    public void getConnection(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaProjects?","root","");
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionToDataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getDisconnection(){
        if (con!=null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionToDataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (ps!=null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionToDataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (s!=null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionToDataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (rs!=null) {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionToDataBase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
