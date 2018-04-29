/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udea.controller;

import com.udea.service.Producto;
import com.udea.service.ProductoWS_Service;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;


public class ProductoBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/ProductoWSHibernate/ProductoWS.wsdl")
    private ProductoWS_Service service;

    private int codigo;
    private String nombre;
    private double precio;
    private int stock;
    private String descripcion;

    public ProductoWS_Service getService() {
        return service;
    }

    public void setService(ProductoWS_Service service) {
        this.service = service;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ProductoBean() {
    }

    public String guardarProd() {
        String msj = ingresarProducto(nombre, precio, stock, descripcion);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, msj, "....");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarForm();
        return "result";
    }

    public String buscarProd() {
        String msj = buscarProducto(codigo);
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, msj, "....");
        FacesContext.getCurrentInstance().addMessage(null, msg);
        limpiarForm();
        return "index";
    }

    public List<Producto> getListaProd() {
        List<Producto> lista = consultarProductos();
        return lista;
    }

    private String buscarProducto(int codigo) {
        com.udea.service.ProductoWS port = service.getProductoWSPort();
        return port.buscarProducto(codigo);
    }

    private java.util.List<com.udea.service.Producto> consultarProductos() {
        com.udea.service.ProductoWS port = service.getProductoWSPort();
        return port.consultarProductos();
    }

    private String ingresarProducto(java.lang.String nombre, double precio, int stock, java.lang.String descripcion) {
        com.udea.service.ProductoWS port = service.getProductoWSPort();
        return port.ingresarProducto(nombre, precio, stock, descripcion);
    }

    private void limpiarForm() {
        this.codigo = 0;
        this.descripcion = "";
        this.nombre = "";
        this.precio = 0.0;
        this.stock = 0;
    }

}
