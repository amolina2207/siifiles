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
 *  Datos de identificación de factura recibida
 * 
 * <p>Clase Java para IDFacturaRecibidaNombreBCType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IDFacturaRecibidaNombreBCType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDEmisorFactura"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NombreRazon" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax120Type"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="NIF" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}NIFType"/&gt;
 *                     &lt;element name="IDOtro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDOtroType"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NumSerieFacturaEmisor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextoIDFacturaType"/&gt;
 *         &lt;element name="FechaExpedicionFacturaEmisor" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}fecha"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDFacturaRecibidaNombreBCType", propOrder = {
    "idEmisorFactura",
    "numSerieFacturaEmisor",
    "fechaExpedicionFacturaEmisor"
})
public class IDFacturaRecibidaNombreBCType {

    @XmlElement(name = "IDEmisorFactura", required = true)
    protected IDFacturaRecibidaNombreBCType.IDEmisorFactura idEmisorFactura;
    @XmlElement(name = "NumSerieFacturaEmisor", required = true)
    protected String numSerieFacturaEmisor;
    @XmlElement(name = "FechaExpedicionFacturaEmisor", required = true)
    protected String fechaExpedicionFacturaEmisor;

    /**
     * Obtiene el valor de la propiedad idEmisorFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaRecibidaNombreBCType.IDEmisorFactura }
     *     
     */
    public IDFacturaRecibidaNombreBCType.IDEmisorFactura getIDEmisorFactura() {
        return idEmisorFactura;
    }

    /**
     * Define el valor de la propiedad idEmisorFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaRecibidaNombreBCType.IDEmisorFactura }
     *     
     */
    public void setIDEmisorFactura(IDFacturaRecibidaNombreBCType.IDEmisorFactura value) {
        this.idEmisorFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad numSerieFacturaEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumSerieFacturaEmisor() {
        return numSerieFacturaEmisor;
    }

    /**
     * Define el valor de la propiedad numSerieFacturaEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumSerieFacturaEmisor(String value) {
        this.numSerieFacturaEmisor = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaExpedicionFacturaEmisor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaExpedicionFacturaEmisor() {
        return fechaExpedicionFacturaEmisor;
    }

    /**
     * Define el valor de la propiedad fechaExpedicionFacturaEmisor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaExpedicionFacturaEmisor(String value) {
        this.fechaExpedicionFacturaEmisor = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="NombreRazon" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax120Type"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="NIF" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}NIFType"/&gt;
     *           &lt;element name="IDOtro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDOtroType"/&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombreRazon",
        "nif",
        "idOtro"
    })
    public static class IDEmisorFactura {

        @XmlElement(name = "NombreRazon", required = true)
        protected String nombreRazon;
        @XmlElement(name = "NIF")
        protected String nif;
        @XmlElement(name = "IDOtro")
        protected IDOtroType idOtro;

        /**
         * Obtiene el valor de la propiedad nombreRazon.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreRazon() {
            return nombreRazon;
        }

        /**
         * Define el valor de la propiedad nombreRazon.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreRazon(String value) {
            this.nombreRazon = value;
        }

        /**
         * Obtiene el valor de la propiedad nif.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNIF() {
            return nif;
        }

        /**
         * Define el valor de la propiedad nif.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNIF(String value) {
            this.nif = value;
        }

        /**
         * Obtiene el valor de la propiedad idOtro.
         * 
         * @return
         *     possible object is
         *     {@link IDOtroType }
         *     
         */
        public IDOtroType getIDOtro() {
            return idOtro;
        }

        /**
         * Define el valor de la propiedad idOtro.
         * 
         * @param value
         *     allowed object is
         *     {@link IDOtroType }
         *     
         */
        public void setIDOtro(IDOtroType value) {
            this.idOtro = value;
        }

    }

}
