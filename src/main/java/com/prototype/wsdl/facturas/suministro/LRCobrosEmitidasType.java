//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 04:34:00 PM CEST 
//


package com.prototype.wsdl.facturas.suministro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para LRCobrosEmitidasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LRCobrosEmitidasType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDFacturaExpedidaBCType"/&gt;
 *         &lt;element name="Cobros" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CobrosType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRCobrosEmitidasType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd", propOrder = {
    "idFactura",
    "cobros"
})
public class LRCobrosEmitidasType {

    @XmlElement(name = "IDFactura", required = true)
    protected IDFacturaExpedidaBCType idFactura;
    @XmlElement(name = "Cobros", required = true)
    protected CobrosType cobros;

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaExpedidaBCType }
     *     
     */
    public IDFacturaExpedidaBCType getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaExpedidaBCType }
     *     
     */
    public void setIDFactura(IDFacturaExpedidaBCType value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad cobros.
     * 
     * @return
     *     possible object is
     *     {@link CobrosType }
     *     
     */
    public CobrosType getCobros() {
        return cobros;
    }

    /**
     * Define el valor de la propiedad cobros.
     * 
     * @param value
     *     allowed object is
     *     {@link CobrosType }
     *     
     */
    public void setCobros(CobrosType value) {
        this.cobros = value;
    }

}
