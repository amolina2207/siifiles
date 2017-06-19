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
 *  Apunte correspondiente al libro de facturas recibidas. 
 * 
 * <p>Clase Java para FacturaRecibidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaRecibidaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}FacturaType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesgloseFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DesgloseFacturaRecibidasType"/&gt;
 *         &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType"/&gt;
 *         &lt;element name="FechaRegContable" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}fecha"/&gt;
 *         &lt;element name="CuotaDeducible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaRecibidaType", propOrder = {
    "desgloseFactura",
    "contraparte",
    "fechaRegContable",
    "cuotaDeducible"
})
public class FacturaRecibidaType
    extends FacturaType
{

    @XmlElement(name = "DesgloseFactura", required = true)
    protected DesgloseFacturaRecibidasType desgloseFactura;
    @XmlElement(name = "Contraparte", required = true)
    protected PersonaFisicaJuridicaType contraparte;
    @XmlElement(name = "FechaRegContable", required = true)
    protected String fechaRegContable;
    @XmlElement(name = "CuotaDeducible", required = true)
    protected String cuotaDeducible;

    /**
     * Obtiene el valor de la propiedad desgloseFactura.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseFacturaRecibidasType }
     *     
     */
    public DesgloseFacturaRecibidasType getDesgloseFactura() {
        return desgloseFactura;
    }

    /**
     * Define el valor de la propiedad desgloseFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseFacturaRecibidasType }
     *     
     */
    public void setDesgloseFactura(DesgloseFacturaRecibidasType value) {
        this.desgloseFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad contraparte.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }

    /**
     * Define el valor de la propiedad contraparte.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public void setContraparte(PersonaFisicaJuridicaType value) {
        this.contraparte = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegContable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegContable() {
        return fechaRegContable;
    }

    /**
     * Define el valor de la propiedad fechaRegContable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegContable(String value) {
        this.fechaRegContable = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaDeducible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaDeducible() {
        return cuotaDeducible;
    }

    /**
     * Define el valor de la propiedad cuotaDeducible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaDeducible(String value) {
        this.cuotaDeducible = value;
    }

}
