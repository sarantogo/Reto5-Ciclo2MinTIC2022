package model.vo;

public class LiderVo {
    private int idlider;
    private String ciudad, nombre;

    public int getId () {
        return idlider;
    }

    public void setId (int idlider) {
        this.idlider = idlider;
    }
    
    public String getCiudad () {
        return ciudad;
    }

    public void setCiudad (String ciudad)  {
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre (String nombre)  {
        this.nombre = nombre;     
    }

}
