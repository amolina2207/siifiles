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
 * <p>Clase Java para DatosInmuebleType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosInmuebleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SituacionInmueble" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}SituacionInmuebleType"/&gt;
 *         &lt;element name="ReferenciaCatastral" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ReferenciaCatastralType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosInmuebleType", propOrder = {
    "situacionInmueble",
    "referenciaCatastral"
})
public class DatosInmuebleType {

    @XmlElement(name = "SituacionInmueble", required = true)
    protected String situacionInmueble;
    @XmlElement(name = "ReferenciaCatastral")
    protected String referenciaCatastral;

    /**
     * Obtiene el valor de la propiedad situacionInmueble.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionInmueble() {
        return situacionInmueble;
    }

    /**
     * Define el valor de la propiedad situacionInmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionInmueble(String value) {
        this.situacionInmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad referenciaCatastral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaCatastral() {
        return referenciaCatastral;
    }

    /**
     * Define el valor de la propiedad referenciaCatastral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaCatastral(String value) {
        this.referenciaCatastral = value;
    }

}
