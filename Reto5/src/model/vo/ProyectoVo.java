package model.vo;

public class ProyectoVo {
    private int idproyecto, numero_habit;
    private String constructora, ciudad;


    public int getIdproyecto() {
        return idproyecto;
    }
    public void setIdproyecto(int idproyecto) {
        this.idproyecto = idproyecto;
    }

    public int getNumero_habit() {
        return numero_habit;
    }
    public void setNumero_habir(int numero_habit) {
        this.numero_habit = numero_habit;
    }

    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }

    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

}
