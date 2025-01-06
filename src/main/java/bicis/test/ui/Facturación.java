/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bicis.test.ui;

import java.util.ArrayList;
import java.util.List;

/*
 * Clase que representa una Facturación y contiene métodos para gestionar facturas.
 */
public class Facturación {
    private static List<Facturación> listaFacturas = new ArrayList<>();
    private int numeroFactura;
    private int codigoCliente;
    private String fechaRecibido;
    private EstadoFacturación estado;
    private int subtotal;
    private int impuesto;
    private int total;
    private List<DetalleFactura> detalles;
    
     /*
     * Enumeración que define el estado de una facturación.
     */
    public enum EstadoFacturación {
        VALIDO, ANULADO
    }
    // Constructor de la clase
    public Facturación(int numeroFactura, int codigoCliente, String fechaRecibido, EstadoFacturación estado, int subtotal, int impuesto, int total, List<DetalleFactura> detalles) {
        this.numeroFactura = numeroFactura;
        this.codigoCliente = codigoCliente;
        this.fechaRecibido = fechaRecibido;
        this.estado = estado;
        this.subtotal = subtotal;
        this.impuesto = impuesto;
        this.total = total;
        this.detalles = detalles;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public String getFechaRecibido() {
        return fechaRecibido;
    }

    public EstadoFacturación getEstado() {
        return estado;
    }

    public int getSubtotal() {
        return subtotal;
    }

    public int getImpuesto() {
        return impuesto;
    }

    public int getTotal() {
        return total;
    }

    public static List<Facturación> getListaFacturas() {
        return listaFacturas;
    }

    public List<DetalleFactura> getDetalles() {
        return detalles;
    }
    
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public void setFechaRecibido(String fechaRecibido) {
        this.fechaRecibido = fechaRecibido;
    }

    public void setEstado(EstadoFacturación estado) {
        this.estado = estado;
    }

    public void setSubtotal(int subtotal) {
        this.subtotal = subtotal;
    }

    public void setImpuesto(int impuesto) {
        this.impuesto = impuesto;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public static void setListaFacturas(List<Facturación> listaFacturas) {
        Facturación.listaFacturas = listaFacturas;
    }

    public void setDetalles(List<DetalleFactura> detalles) {
        this.detalles = detalles;
    }
    
    
    //Metodos
    
    /*
     * Agrega una nueva factura a la lista de facturas.
     *
     * @param nuevaFactura la nueva factura a agregar.
     */
    public static void agregarFactura(Facturación nuevaFactura){
        listaFacturas.add(nuevaFactura); //simplemente agrega un elemento a la lista de facturas
    }
    
    
    /*
     * Busca una factura en la lista por su número.
     *
     * @param numeroFactura el número de la factura a buscar.
     * @return la factura encontrada o null si no se encuentra.
     */
    public static Facturación buscarFactura(int numeroFactura){
        for (Facturación factura : listaFacturas){ // por cada indice de la lista de facturas (Factura es el indice)
            if (factura.getNumeroFactura() == numeroFactura){ //si el numero de la factura coincide con el numero dado, devuelve esa factura
                return factura;
            }
        }
        return null;
    }
    
     /*
     * Anula una factura cambiando su estado a ANULADO.
     *
     * @param numeroFactura el número de la factura a anular.
     */
    public static void anularFactura(int numeroFactura){ // metodo para anular una factura
        Facturación factura = buscarFactura(numeroFactura); // utiliza el metodo de busqueda
        if (factura != null){ //si la factura existe entonces la anula
            factura.setEstado(EstadoFacturación.ANULADO);
        }
    }
    
    /*
     * Genera un nuevo número de factura basado en el último número utilizado.
     *
     * @return el nuevo número de factura.
     */  
    public static int generarNumeroFactura() { // metodo para generar el numero de la factura
        if (listaFacturas.isEmpty()) {
            return 1;
        } else {
            // Devuelve el numero mas 1
            return listaFacturas.get(listaFacturas.size() - 1).getNumeroFactura() + 1;
        }
    }

    /*
     * Representa la facturación como una cadena de texto.
     *
     * @return una representación en formato String de la facturación.
     */
    @Override
    public String toString() {
        return "Facturación{" +
                "numeroFactura=" + numeroFactura +
                ", codigoCliente=" + codigoCliente +
                ", fechaRecibido=" + fechaRecibido +
                ", estado=" + estado +
                ", subtotal=" + subtotal +
                ", impuesto=" + impuesto +
                ", total=" + total +
                ", factura=" + detalles +
                '}';
    }
}
