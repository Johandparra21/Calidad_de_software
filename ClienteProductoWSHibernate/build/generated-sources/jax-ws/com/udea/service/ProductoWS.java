
package com.udea.service;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductoWS", targetNamespace = "http://service.udea.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductoWS {


    /**
     * 
     * @return
     *     returns java.util.List<com.udea.service.Producto>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultarProductos", targetNamespace = "http://service.udea.com/", className = "com.udea.service.ConsultarProductos")
    @ResponseWrapper(localName = "consultarProductosResponse", targetNamespace = "http://service.udea.com/", className = "com.udea.service.ConsultarProductosResponse")
    @Action(input = "http://service.udea.com/ProductoWS/consultarProductosRequest", output = "http://service.udea.com/ProductoWS/consultarProductosResponse")
    public List<Producto> consultarProductos();

    /**
     * 
     * @param descripcion
     * @param precio
     * @param stock
     * @param nombre
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ingresarProducto", targetNamespace = "http://service.udea.com/", className = "com.udea.service.IngresarProducto")
    @ResponseWrapper(localName = "ingresarProductoResponse", targetNamespace = "http://service.udea.com/", className = "com.udea.service.IngresarProductoResponse")
    @Action(input = "http://service.udea.com/ProductoWS/ingresarProductoRequest", output = "http://service.udea.com/ProductoWS/ingresarProductoResponse")
    public String ingresarProducto(
        @WebParam(name = "nombre", targetNamespace = "")
        String nombre,
        @WebParam(name = "precio", targetNamespace = "")
        double precio,
        @WebParam(name = "stock", targetNamespace = "")
        int stock,
        @WebParam(name = "descripcion", targetNamespace = "")
        String descripcion);

    /**
     * 
     * @param codigo
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "buscarProducto", targetNamespace = "http://service.udea.com/", className = "com.udea.service.BuscarProducto")
    @ResponseWrapper(localName = "buscarProductoResponse", targetNamespace = "http://service.udea.com/", className = "com.udea.service.BuscarProductoResponse")
    @Action(input = "http://service.udea.com/ProductoWS/buscarProductoRequest", output = "http://service.udea.com/ProductoWS/buscarProductoResponse")
    public String buscarProducto(
        @WebParam(name = "codigo", targetNamespace = "")
        int codigo);

}
