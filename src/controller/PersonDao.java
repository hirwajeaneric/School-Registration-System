package controller;

import utils.ConnectionToDataBase;
import model.Person;
import java.sql.*;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author hirwa
 */
public class PersonDao extends ConnectionToDataBase {
    public void insertPerson(Person pers){
        try {
            getConnection();
            String sql = "INSERT INTO person VALUES(?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, pers.getFirstName());
            ps.setString(2, pers.getLastName());
            ps.setString(3, pers.getDob().format(DateTimeFormatter.ISO_DATE));
            ps.setString(4, pers.getGender());
            ps.setString(5, pers.getPhoneNumber());
            ps.setString(6, pers.getEmailAddress());
            ps.setString(7, pers.getRegistrantType());
            ps.setString(8, pers.getPicture().toString());
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            getDisconnection();
        }
    }
    
    public void retreivePersonFromDb(){
        getConnection();
        String sql = "SELECT * FROM person";
        
    }
}
