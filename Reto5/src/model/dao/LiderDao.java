package model.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import model.vo.LiderVo;
import util.JDBCUtilities;


public class LiderDao {
    private Connection conn;

        public List<LiderVo> listLider () throws SQLException, ClassNotFoundException {
            conn=JDBCUtilities.getConnection();
            List <LiderVo> list = new ArrayList<LiderVo>();
            String sentence = "SELECT ID_Lider, Nombre ||' '|| Primer_Apellido AS 'Lider', Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia;";
            PreparedStatement stm = conn.prepareStatement(sentence);
            ResultSet result = stm.executeQuery();
            while (result.next()) {
                LiderVo obj = new LiderVo();
                obj.setId(result.getInt("ID_Lider"));
                obj.setNombre(result.getString("Lider"));
                obj.setCiudad(result.getString("Ciudad_Residencia"));
                list.add(obj);               
            }
            return list;
        }
    
        public void close() throws SQLException {
            if (conn != null) {
                conn.close();
            }
            conn = null;
        }
    
}


   


