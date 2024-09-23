
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class ProductoCard {
    public ArrayList<String> getProductDetails() {
        ArrayList<String> productDetails = new ArrayList<>();
        Connection con = new ClaseConexion().getConexion();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT nombre_doctor FROM tbDoctores");
            while (rs.next()) {
                productDetails.add(rs.getString("nombre_doctor"));
            }
            rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productDetails;
    }
}