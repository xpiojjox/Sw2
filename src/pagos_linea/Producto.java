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
public class Producto {
    public String codigo;
    public String nombre;
    public Integer dueno;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDueno() {
        return dueno;
    }

    public void setDueno(Integer dueno) {
        this.dueno = dueno;
    }
    
    
}
