/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pagos_linea;

import inter_grafica.ventana;

/**
 *
 * @author ALK
 */
public class Video extends Producto {
    private String url;
    private String formato;
    public Video(String codigo,String nombre,String url,Integer dueno)
    {
        this.url=url;
        this.codigo=codigo;
        this.nombre=nombre;
        this.dueno=dueno;
        this.formato="2D";
    }
    public String agregar_video(String cliente)
    {  
       String mensaje="_Señor(a) "+cliente+", le informamos que se ha agragado al paquete de entrega \n un video gratis de primeros auxilios.";
       return mensaje;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = "2D";
    }
        
}
