package controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ConnectionToDataBase;
import model.UserAccounts;

/**
 *
 * @author hirwa
 */
public class UserAccountsDao extends ConnectionToDataBase {
    public void saveCredentials(UserAccounts users){
        try {
            getConnection();
            String sql = "INSERT INTO userAccounts VALUES (?,?,?,?);";
            ps = con.prepareStatement(sql);
            ps.setString(1, users.getUsername());
            ps.setString(2, users.getPhoneNumber());
            ps.setString(3, users.getPassword());
            ps.setString(4, users.getConfirmPassword());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserAccountsDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            getDisconnection();
        }
    }
    
}
