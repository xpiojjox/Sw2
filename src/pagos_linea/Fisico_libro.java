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
public class Fisico_libro extends Producto {
    public String generar_orden_entrega(Integer cedula, String nombre,String direccion,String telefono,String codigo_producto,Double total,String fecha_actual,String fecha_entrega, Integer accion)
    {
       String mensaje="";
       String duplicado="Cédula:"+cedula+"\nNombre:"+nombre+ "\nDirección:"+direccion+"\nTeléfono:"+telefono+"\nCódigo del producto:"+codigo_producto+"\nPrecio:"+total+"\nFecha de compra:"+fecha_actual+"\nFecha de entrega: "+fecha_entrega;
       if(accion==1)
       {
               mensaje="_ORDEN DE ENTREGA:\n \n"+duplicado+"\n \n \n";
       }
       else
       {
           Departamento_libros dep=new Departamento_libros();
           String mens2=dep.recibir_duplicado(duplicado);
           mensaje+=mens2;
       }
       String mens3=generando_pago(nombre);
       mensaje+=mens3;
       return mensaje;
    }
    public String generando_pago(String nombre)
    {
        String mensaje="_"+nombre+", se generó pago de comisión al angente.";
        return mensaje;
    }
}
