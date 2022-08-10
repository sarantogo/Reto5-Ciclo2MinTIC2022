package model.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import util.JDBCUtilities;
import model.vo.ProyectoVo;

public class ProyectoDao {
    private Connection conn;

    public List<ProyectoVo> listProject () throws SQLException, ClassNotFoundException {
        conn=JDBCUtilities.getConnection();
        List <ProyectoVo> list = new ArrayList<ProyectoVo>();
        String sentence = "SELECT ID_Proyecto , Constructora ,Numero_Habitaciones ,Ciudad FROM Proyecto WHERE Clasificacion IN ('Casa Campestre') AND Ciudad IN('Santa Marta','Cartagena','Barranquilla');";
        PreparedStatement stm = conn.prepareStatement(sentence);
        ResultSet result = stm.executeQuery();
        while (result.next()) {
            ProyectoVo obj = new ProyectoVo();
            obj.setIdproyecto(result.getInt("ID_Proyecto"));
            obj.setConstructora(result.getString("Constructora"));
            obj.setNumero_habir(result.getInt("Numero_Habitaciones"));
            obj.setCiudad(result.getString("Ciudad"));
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
