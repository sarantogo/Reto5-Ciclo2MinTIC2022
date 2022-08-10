package controller;

import java.sql.SQLException;
import java.util.List;
import model.dao.ComprasDao;
import model.dao.ProyectoDao;
import model.dao.LiderDao;
import model.vo.ComprasVo;
import model.vo.ProyectoVo;
import model.vo.LiderVo;

public class ReportesController {
    

    public ReportesController() {

    }

    public static List<LiderVo> askPrimerInforme() throws ClassNotFoundException, SQLException{
        LiderDao listaLider = new LiderDao();
        List<LiderVo> list1 = listaLider.listLider();
        listaLider.close();
        return list1;    
    }

    public static List<ProyectoVo> askSegundoInforme() throws ClassNotFoundException, SQLException{
        ProyectoDao listaProyecto = new ProyectoDao();
        List<ProyectoVo> list2 = listaProyecto.listProject();
        listaProyecto.close();
        return list2;    
    }

    public static List<ComprasVo> askTercerInforme() throws ClassNotFoundException, SQLException{
        ComprasDao listaCompras = new ComprasDao();
        List<ComprasVo> list3 = listaCompras.listBuy();
        listaCompras.close();
        return list3;    
    }
}


    
    

