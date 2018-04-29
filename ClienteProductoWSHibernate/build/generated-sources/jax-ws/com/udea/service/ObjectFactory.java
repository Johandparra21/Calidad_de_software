
package com.udea.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.udea.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BuscarProducto_QNAME = new QName("http://service.udea.com/", "buscarProducto");
    private final static QName _BuscarProductoResponse_QNAME = new QName("http://service.udea.com/", "buscarProductoResponse");
    private final static QName _ConsultarProductos_QNAME = new QName("http://service.udea.com/", "consultarProductos");
    private final static QName _ConsultarProductosResponse_QNAME = new QName("http://service.udea.com/", "consultarProductosResponse");
    private final static QName _IngresarProducto_QNAME = new QName("http://service.udea.com/", "ingresarProducto");
    private final static QName _IngresarProductoResponse_QNAME = new QName("http://service.udea.com/", "ingresarProductoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.udea.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BuscarProducto }
     * 
     */
    public BuscarProducto createBuscarProducto() {
        return new BuscarProducto();
    }

    /**
     * Create an instance of {@link BuscarProductoResponse }
     * 
     */
    public BuscarProductoResponse createBuscarProductoResponse() {
        return new BuscarProductoResponse();
    }

    /**
     * Create an instance of {@link ConsultarProductos }
     * 
     */
    public ConsultarProductos createConsultarProductos() {
        return new ConsultarProductos();
    }

    /**
     * Create an instance of {@link ConsultarProductosResponse }
     * 
     */
    public ConsultarProductosResponse createConsultarProductosResponse() {
        return new ConsultarProductosResponse();
    }

    /**
     * Create an instance of {@link IngresarProducto }
     * 
     */
    public IngresarProducto createIngresarProducto() {
        return new IngresarProducto();
    }

    /**
     * Create an instance of {@link IngresarProductoResponse }
     * 
     */
    public IngresarProductoResponse createIngresarProductoResponse() {
        return new IngresarProductoResponse();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "buscarProducto")
    public JAXBElement<BuscarProducto> createBuscarProducto(BuscarProducto value) {
        return new JAXBElement<BuscarProducto>(_BuscarProducto_QNAME, BuscarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuscarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "buscarProductoResponse")
    public JAXBElement<BuscarProductoResponse> createBuscarProductoResponse(BuscarProductoResponse value) {
        return new JAXBElement<BuscarProductoResponse>(_BuscarProductoResponse_QNAME, BuscarProductoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "consultarProductos")
    public JAXBElement<ConsultarProductos> createConsultarProductos(ConsultarProductos value) {
        return new JAXBElement<ConsultarProductos>(_ConsultarProductos_QNAME, ConsultarProductos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "consultarProductosResponse")
    public JAXBElement<ConsultarProductosResponse> createConsultarProductosResponse(ConsultarProductosResponse value) {
        return new JAXBElement<ConsultarProductosResponse>(_ConsultarProductosResponse_QNAME, ConsultarProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarProducto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "ingresarProducto")
    public JAXBElement<IngresarProducto> createIngresarProducto(IngresarProducto value) {
        return new JAXBElement<IngresarProducto>(_IngresarProducto_QNAME, IngresarProducto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresarProductoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.udea.com/", name = "ingresarProductoResponse")
    public JAXBElement<IngresarProductoResponse> createIngresarProductoResponse(IngresarProductoResponse value) {
        return new JAXBElement<IngresarProductoResponse>(_IngresarProductoResponse_QNAME, IngresarProductoResponse.class, null, value);
    }

}
