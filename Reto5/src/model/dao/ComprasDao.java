package model.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;
import model.vo.ComprasVo;

public class ComprasDao {
    private Connection conn;

    public List<ComprasVo> listBuy () throws SQLException, ClassNotFoundException {
        conn=JDBCUtilities.getConnection();
        List <ComprasVo> list = new ArrayList<ComprasVo>();
        String sentence = "SELECT ID_Compra,Constructora ,Banco_Vinculado FROM Proyecto INNER JOIN Compra ON Proyecto.ID_Proyecto  = Compra.ID_Proyecto WHERE Proveedor IN ('Homecenter') AND Ciudad IN ('Salento');";
        PreparedStatement stm = conn.prepareStatement(sentence);
        ResultSet result = stm.executeQuery();
        while (result.next()) {
            ComprasVo obj = new ComprasVo();
            obj.setIdcompra(result.getInt("ID_Compra"));
            obj.setConstructoraC(result.getString("Constructora"));
            obj.setBanco(result.getString("Banco_Vinculado"));     
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
