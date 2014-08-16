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
public class Pago {
    private Integer cod_entrega;
    private String fecha_pago;
    private String fecha_entrega;
    private Integer identificacion;
    private String nombre_cliente;
    private String corrreo_electronico;
    private Double total;
    
    public Integer getCod_entrega() {
        return cod_entrega;
    }

    public void setCod_entrega(Integer cod_entrega) {
        this.cod_entrega = cod_entrega;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public String getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(String fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public Integer getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(Integer identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getCorrreo_electronico() {
        return corrreo_electronico;
    }

    public void setCorrreo_electronico(String corrreo_electronico) {
        this.corrreo_electronico = corrreo_electronico;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
}

