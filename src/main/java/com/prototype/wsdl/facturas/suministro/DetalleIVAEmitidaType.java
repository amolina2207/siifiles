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
 * <p>Clase Java para DetalleIVAEmitidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleIVAEmitidaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoImpositivo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}Tipo2.2Type" minOccurs="0"/&gt;
 *         &lt;element name="BaseImponible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/&gt;
 *         &lt;element name="CuotaRepercutida" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="TipoRecargoEquivalencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}Tipo2.2Type" minOccurs="0"/&gt;
 *         &lt;element name="CuotaRecargoEquivalencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleIVAEmitidaType", propOrder = {
    "tipoImpositivo",
    "baseImponible",
    "cuotaRepercutida",
    "tipoRecargoEquivalencia",
    "cuotaRecargoEquivalencia"
})
public class DetalleIVAEmitidaType {

    @XmlElement(name = "TipoImpositivo")
    protected String tipoImpositivo;
    @XmlElement(name = "BaseImponible", required = true)
    protected String baseImponible;
    @XmlElement(name = "CuotaRepercutida")
    protected String cuotaRepercutida;
    @XmlElement(name = "TipoRecargoEquivalencia")
    protected String tipoRecargoEquivalencia;
    @XmlElement(name = "CuotaRecargoEquivalencia")
    protected String cuotaRecargoEquivalencia;

    /**
     * Obtiene el valor de la propiedad tipoImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImpositivo() {
        return tipoImpositivo;
    }

    /**
     * Define el valor de la propiedad tipoImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImpositivo(String value) {
        this.tipoImpositivo = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponible() {
        return baseImponible;
    }

    /**
     * Define el valor de la propiedad baseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponible(String value) {
        this.baseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRepercutida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRepercutida() {
        return cuotaRepercutida;
    }

    /**
     * Define el valor de la propiedad cuotaRepercutida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRepercutida(String value) {
        this.cuotaRepercutida = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRecargoEquivalencia() {
        return tipoRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad tipoRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRecargoEquivalencia(String value) {
        this.tipoRecargoEquivalencia = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRecargoEquivalencia() {
        return cuotaRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad cuotaRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRecargoEquivalencia(String value) {
        this.cuotaRecargoEquivalencia = value;
    }

}
