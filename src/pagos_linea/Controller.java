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
public class Controller extends javax.swing.JFrame  {

    /**  f
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    public String iniciar_pago(Integer cedula,String nombre_cliente,String email,String accion,String codigo_producto,String nombre_producto,Double total)
    {
        String mensaje="";
        Pago info_pago= new Pago();
        info_pago.setCod_entrega(1010);
        info_pago.setFecha_pago("20 de julio de 2014");
        info_pago.setFecha_entrega("30 de julio de 2014");
        info_pago.setIdentificacion(cedula);
        info_pago.setNombre_cliente(nombre_cliente);
        info_pago.setCorrreo_electronico(email);
        info_pago.setTotal(total);
        
        switch(accion)
        {
            case "Producto Físico":    
                
                        mensaje=crear_fisico_libro(codigo_producto,nombre_producto,info_pago,"fisico");
                break;
            case "Libros":     
                
                        mensaje=crear_fisico_libro(codigo_producto,nombre_producto,info_pago,"libro");
                break;
            case "Membresía":
                
                        mensaje=crear_membresia(codigo_producto,nombre_producto,info_pago,"activacion");
                break;
            case "Actualización membresía":    
                
                        mensaje=crear_membresia(codigo_producto,nombre_producto,info_pago,"actualizacion");
                break;
            case "Video": 
                
                        Video video=new Video(codigo_producto,nombre_producto,"/@jdb.sfjcsl./",info_pago.getCod_entrega());
                        mensaje="_El video fue pagado satisfactoriamente.\n\n ";
                         
                        if(nombre_producto.equalsIgnoreCase("Aprendiendo_a_eskiar"))
                        {
                            mensaje+= video.agregar_video(info_pago.getNombre_cliente());
                        }
                break;
    }
        return mensaje;
}
    public String crear_membresia(String codigo_producto,String nombre_producto,Pago info_pago, String opcion)
    {
        Membresia membre=new Membresia();
        membre.setCodigo(codigo_producto);
        membre.setNombre(nombre_producto);
        membre.setDueno(info_pago.getCod_entrega());
        String mensaje="";
        if("activacion".equals(opcion))
        {
            mensaje=membre.activar_membresia(info_pago.getNombre_cliente(),info_pago.getCorrreo_electronico());
        }
        if("actualizacion".equals(opcion))
        {
            mensaje=membre.actualizar_membresia(codigo_producto,info_pago.getNombre_cliente(),info_pago.getCorrreo_electronico()); 
        }
        return mensaje;   
    }
     public String crear_fisico_libro(String codigo_producto,String nombre_producto,Pago info_pago, String opcion)
    {
        Fisico_libro fis=new Fisico_libro();
        fis.setCodigo(codigo_producto);
        fis.setNombre(nombre_producto);
        fis.setDueno(info_pago.getCod_entrega());
        String mensaje="";
        if("fisico".equals(opcion))
        {
            mensaje=fis.generar_orden_entrega(info_pago.getIdentificacion(),info_pago.getNombre_cliente(),"Cra 1 N°10-14","5427363",fis.getCodigo(),info_pago.getTotal(),info_pago.getFecha_pago(),info_pago.getFecha_entrega(),1);
        }
        if("libro".equals(opcion))
        {
            mensaje=fis.generar_orden_entrega(info_pago.getIdentificacion(),info_pago.getNombre_cliente(),"Cra 1 N°10-14","5427363",fis.getCodigo(),info_pago.getTotal(),info_pago.getFecha_pago(),info_pago.getFecha_entrega(),2);
        }
        return mensaje;   
    }
    
}
