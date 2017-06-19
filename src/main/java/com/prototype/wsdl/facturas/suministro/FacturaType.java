//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 04:34:00 PM CEST 
//


package com.prototype.wsdl.facturas.suministro;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 *  Datos comunes de facturas emitidas y recibidas 
 * 
 * <p>Clase Java para FacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ClaveTipoFacturaType"/&gt;
 *         &lt;element name="TipoRectificativa" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ClaveTipoRectificativaType" minOccurs="0"/&gt;
 *         &lt;element name="FacturasAgrupadas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDFacturaAgrupada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FacturasRectificadas" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IDFacturaRectificada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ImporteRectificacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DesgloseRectificacionType" minOccurs="0"/&gt;
 *         &lt;element name="FechaOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/&gt;
 *         &lt;element name="ClaveRegimenEspecialOTrascendencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IdOperacionesTrascendenciaTributariaType"/&gt;
 *         &lt;element name="ClaveRegimenEspecialOTrascendenciaAdicional1" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IdOperacionesTrascendenciaTributariaType" minOccurs="0"/&gt;
 *         &lt;element name="ClaveRegimenEspecialOTrascendenciaAdicional2" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IdOperacionesTrascendenciaTributariaType" minOccurs="0"/&gt;
 *         &lt;element name="NumRegistroAcuerdoFacturacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax15Type" minOccurs="0"/&gt;
 *         &lt;element name="ImporteTotal" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="BaseImponibleACoste" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/&gt;
 *         &lt;element name="DescripcionOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax500Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaType", propOrder = {
    "tipoFactura",
    "tipoRectificativa",
    "facturasAgrupadas",
    "facturasRectificadas",
    "importeRectificacion",
    "fechaOperacion",
    "claveRegimenEspecialOTrascendencia",
    "claveRegimenEspecialOTrascendenciaAdicional1",
    "claveRegimenEspecialOTrascendenciaAdicional2",
    "numRegistroAcuerdoFacturacion",
    "importeTotal",
    "baseImponibleACoste",
    "descripcionOperacion"
})
@XmlSeeAlso({
    FacturaExpedidaType.class,
    FacturaRecibidaType.class
})
public class FacturaType {

    @XmlElement(name = "TipoFactura", required = true)
    @XmlSchemaType(name = "string")
    protected ClaveTipoFacturaType tipoFactura;
    @XmlElement(name = "TipoRectificativa")
    protected String tipoRectificativa;
    @XmlElement(name = "FacturasAgrupadas")
    protected FacturaType.FacturasAgrupadas facturasAgrupadas;
    @XmlElement(name = "FacturasRectificadas")
    protected FacturaType.FacturasRectificadas facturasRectificadas;
    @XmlElement(name = "ImporteRectificacion")
    protected DesgloseRectificacionType importeRectificacion;
    @XmlElement(name = "FechaOperacion")
    protected String fechaOperacion;
    @XmlElement(name = "ClaveRegimenEspecialOTrascendencia", required = true)
    protected String claveRegimenEspecialOTrascendencia;
    @XmlElement(name = "ClaveRegimenEspecialOTrascendenciaAdicional1")
    protected String claveRegimenEspecialOTrascendenciaAdicional1;
    @XmlElement(name = "ClaveRegimenEspecialOTrascendenciaAdicional2")
    protected String claveRegimenEspecialOTrascendenciaAdicional2;
    @XmlElement(name = "NumRegistroAcuerdoFacturacion")
    protected String numRegistroAcuerdoFacturacion;
    @XmlElement(name = "ImporteTotal")
    protected String importeTotal;
    @XmlElement(name = "BaseImponibleACoste")
    protected String baseImponibleACoste;
    @XmlElement(name = "DescripcionOperacion", required = true)
    protected String descripcionOperacion;

    /**
     * Obtiene el valor de la propiedad tipoFactura.
     * 
     * @return
     *     possible object is
     *     {@link ClaveTipoFacturaType }
     *     
     */
    public ClaveTipoFacturaType getTipoFactura() {
        return tipoFactura;
    }

    /**
     * Define el valor de la propiedad tipoFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveTipoFacturaType }
     *     
     */
    public void setTipoFactura(ClaveTipoFacturaType value) {
        this.tipoFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRectificativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRectificativa() {
        return tipoRectificativa;
    }

    /**
     * Define el valor de la propiedad tipoRectificativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRectificativa(String value) {
        this.tipoRectificativa = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasAgrupadas.
     * 
     * @return
     *     possible object is
     *     {@link FacturaType.FacturasAgrupadas }
     *     
     */
    public FacturaType.FacturasAgrupadas getFacturasAgrupadas() {
        return facturasAgrupadas;
    }

    /**
     * Define el valor de la propiedad facturasAgrupadas.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaType.FacturasAgrupadas }
     *     
     */
    public void setFacturasAgrupadas(FacturaType.FacturasAgrupadas value) {
        this.facturasAgrupadas = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasRectificadas.
     * 
     * @return
     *     possible object is
     *     {@link FacturaType.FacturasRectificadas }
     *     
     */
    public FacturaType.FacturasRectificadas getFacturasRectificadas() {
        return facturasRectificadas;
    }

    /**
     * Define el valor de la propiedad facturasRectificadas.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaType.FacturasRectificadas }
     *     
     */
    public void setFacturasRectificadas(FacturaType.FacturasRectificadas value) {
        this.facturasRectificadas = value;
    }

    /**
     * Obtiene el valor de la propiedad importeRectificacion.
     * 
     * @return
     *     possible object is
     *     {@link DesgloseRectificacionType }
     *     
     */
    public DesgloseRectificacionType getImporteRectificacion() {
        return importeRectificacion;
    }

    /**
     * Define el valor de la propiedad importeRectificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DesgloseRectificacionType }
     *     
     */
    public void setImporteRectificacion(DesgloseRectificacionType value) {
        this.importeRectificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaOperacion() {
        return fechaOperacion;
    }

    /**
     * Define el valor de la propiedad fechaOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaOperacion(String value) {
        this.fechaOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRegimenEspecialOTrascendencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveRegimenEspecialOTrascendencia() {
        return claveRegimenEspecialOTrascendencia;
    }

    /**
     * Define el valor de la propiedad claveRegimenEspecialOTrascendencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveRegimenEspecialOTrascendencia(String value) {
        this.claveRegimenEspecialOTrascendencia = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRegimenEspecialOTrascendenciaAdicional1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveRegimenEspecialOTrascendenciaAdicional1() {
        return claveRegimenEspecialOTrascendenciaAdicional1;
    }

    /**
     * Define el valor de la propiedad claveRegimenEspecialOTrascendenciaAdicional1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveRegimenEspecialOTrascendenciaAdicional1(String value) {
        this.claveRegimenEspecialOTrascendenciaAdicional1 = value;
    }

    /**
     * Obtiene el valor de la propiedad claveRegimenEspecialOTrascendenciaAdicional2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveRegimenEspecialOTrascendenciaAdicional2() {
        return claveRegimenEspecialOTrascendenciaAdicional2;
    }

    /**
     * Define el valor de la propiedad claveRegimenEspecialOTrascendenciaAdicional2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveRegimenEspecialOTrascendenciaAdicional2(String value) {
        this.claveRegimenEspecialOTrascendenciaAdicional2 = value;
    }

    /**
     * Obtiene el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumRegistroAcuerdoFacturacion() {
        return numRegistroAcuerdoFacturacion;
    }

    /**
     * Define el valor de la propiedad numRegistroAcuerdoFacturacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumRegistroAcuerdoFacturacion(String value) {
        this.numRegistroAcuerdoFacturacion = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTotal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTotal() {
        return importeTotal;
    }

    /**
     * Define el valor de la propiedad importeTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTotal(String value) {
        this.importeTotal = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponibleACoste.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponibleACoste() {
        return baseImponibleACoste;
    }

    /**
     * Define el valor de la propiedad baseImponibleACoste.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponibleACoste(String value) {
        this.baseImponibleACoste = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    /**
     * Define el valor de la propiedad descripcionOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionOperacion(String value) {
        this.descripcionOperacion = value;
    }


    /**
     * El ID de los tickets agrupados, únicamente se rellena en el caso de agrupación de tickets en factura
     * 
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IDFacturaAgrupada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="unbounded"/&gt;
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
        "idFacturaAgrupada"
    })
    public static class FacturasAgrupadas {

        @XmlElement(name = "IDFacturaAgrupada", required = true)
        protected List<IDFacturaARType> idFacturaAgrupada;

        /**
         * Gets the value of the idFacturaAgrupada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the idFacturaAgrupada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDFacturaAgrupada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDFacturaARType }
         * 
         * 
         */
        public List<IDFacturaARType> getIDFacturaAgrupada() {
            if (idFacturaAgrupada == null) {
                idFacturaAgrupada = new ArrayList<IDFacturaARType>();
            }
            return this.idFacturaAgrupada;
        }

    }


    /**
     * El ID de las facturas rectificadas, únicamente se rellena en el caso de rectificación de facturas
     * 
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="IDFacturaRectificada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDFacturaARType" maxOccurs="unbounded"/&gt;
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
        "idFacturaRectificada"
    })
    public static class FacturasRectificadas {

        @XmlElement(name = "IDFacturaRectificada", required = true)
        protected List<IDFacturaARType> idFacturaRectificada;

        /**
         * Gets the value of the idFacturaRectificada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the idFacturaRectificada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIDFacturaRectificada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link IDFacturaARType }
         * 
         * 
         */
        public List<IDFacturaARType> getIDFacturaRectificada() {
            if (idFacturaRectificada == null) {
                idFacturaRectificada = new ArrayList<IDFacturaARType>();
            }
            return this.idFacturaRectificada;
        }

    }

}
