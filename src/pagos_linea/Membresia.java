/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pagos_linea;

/**
 *
 * @author ALK
 */
public class Membresia extends Producto {
    
    private Boolean activa;
    private Boolean actualizada;
    
    public Boolean isActiva() {
        return activa;
    }

    public void setActiva(Boolean activa) {
        this.activa = activa;
    }

    public Boolean isActualizada() {
        return actualizada;
    }

    public void setActualizada(Boolean actualizada) {
        this.actualizada = actualizada;
    } 
    public String activar_membresia(String nombre,String email)
    {
        this.activa=true;
        String mensaje="_Señor(a) "+nombre+", la membresía está activada. \n\n";
        mensaje+=enviar_email(email,"activada.");
        return mensaje;
    }
    public String actualizar_membresia(String codigo_producto,String nombre,String email)
    {
        this.actualizada=true;
        String mensaje=("_Señor(a) "+nombre+", la membresía con codigo: "+codigo_producto +", ha sido actualizada. \n\n");
        mensaje+=enviar_email(email,"actualizada.");
        return mensaje;
    }
    public String enviar_email(String email, String accion)
    {
        String mensaje="_"+email+", le informamos que su membresía  ha sido "+accion;
        return mensaje;
    }
}
