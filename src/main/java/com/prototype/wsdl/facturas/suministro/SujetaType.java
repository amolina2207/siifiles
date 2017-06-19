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
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo de Operacion Sujeta
 * 
 * <p>Clase Java para SujetaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SujetaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Exenta" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CausaExencion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CausaExencionType" minOccurs="0"/&gt;
 *                   &lt;element name="BaseImponible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="NoExenta" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TipoNoExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoOperacionSujetaNoExentaType"/&gt;
 *                   &lt;element name="DesgloseIVA"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DetalleIVAEmitidaType" maxOccurs="6"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SujetaType", propOrder = {
    "exenta",
    "noExenta"
})
public class SujetaType {

    @XmlElement(name = "Exenta")
    protected SujetaType.Exenta exenta;
    @XmlElement(name = "NoExenta")
    protected SujetaType.NoExenta noExenta;

    /**
     * Obtiene el valor de la propiedad exenta.
     * 
     * @return
     *     possible object is
     *     {@link SujetaType.Exenta }
     *     
     */
    public SujetaType.Exenta getExenta() {
        return exenta;
    }

    /**
     * Define el valor de la propiedad exenta.
     * 
     * @param value
     *     allowed object is
     *     {@link SujetaType.Exenta }
     *     
     */
    public void setExenta(SujetaType.Exenta value) {
        this.exenta = value;
    }

    /**
     * Obtiene el valor de la propiedad noExenta.
     * 
     * @return
     *     possible object is
     *     {@link SujetaType.NoExenta }
     *     
     */
    public SujetaType.NoExenta getNoExenta() {
        return noExenta;
    }

    /**
     * Define el valor de la propiedad noExenta.
     * 
     * @param value
     *     allowed object is
     *     {@link SujetaType.NoExenta }
     *     
     */
    public void setNoExenta(SujetaType.NoExenta value) {
        this.noExenta = value;
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
     *         &lt;element name="CausaExencion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CausaExencionType" minOccurs="0"/&gt;
     *         &lt;element name="BaseImponible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/&gt;
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
        "causaExencion",
        "baseImponible"
    })
    public static class Exenta {

        @XmlElement(name = "CausaExencion")
        @XmlSchemaType(name = "string")
        protected CausaExencionType causaExencion;
        @XmlElement(name = "BaseImponible", required = true)
        protected String baseImponible;

        /**
         * Obtiene el valor de la propiedad causaExencion.
         * 
         * @return
         *     possible object is
         *     {@link CausaExencionType }
         *     
         */
        public CausaExencionType getCausaExencion() {
            return causaExencion;
        }

        /**
         * Define el valor de la propiedad causaExencion.
         * 
         * @param value
         *     allowed object is
         *     {@link CausaExencionType }
         *     
         */
        public void setCausaExencion(CausaExencionType value) {
            this.causaExencion = value;
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
     *         &lt;element name="TipoNoExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoOperacionSujetaNoExentaType"/&gt;
     *         &lt;element name="DesgloseIVA"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DetalleIVAEmitidaType" maxOccurs="6"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
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
        "tipoNoExenta",
        "desgloseIVA"
    })
    public static class NoExenta {

        @XmlElement(name = "TipoNoExenta", required = true)
        @XmlSchemaType(name = "string")
        protected TipoOperacionSujetaNoExentaType tipoNoExenta;
        @XmlElement(name = "DesgloseIVA", required = true)
        protected SujetaType.NoExenta.DesgloseIVA desgloseIVA;

        /**
         * Obtiene el valor de la propiedad tipoNoExenta.
         * 
         * @return
         *     possible object is
         *     {@link TipoOperacionSujetaNoExentaType }
         *     
         */
        public TipoOperacionSujetaNoExentaType getTipoNoExenta() {
            return tipoNoExenta;
        }

        /**
         * Define el valor de la propiedad tipoNoExenta.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoOperacionSujetaNoExentaType }
         *     
         */
        public void setTipoNoExenta(TipoOperacionSujetaNoExentaType value) {
            this.tipoNoExenta = value;
        }

        /**
         * Obtiene el valor de la propiedad desgloseIVA.
         * 
         * @return
         *     possible object is
         *     {@link SujetaType.NoExenta.DesgloseIVA }
         *     
         */
        public SujetaType.NoExenta.DesgloseIVA getDesgloseIVA() {
            return desgloseIVA;
        }

        /**
         * Define el valor de la propiedad desgloseIVA.
         * 
         * @param value
         *     allowed object is
         *     {@link SujetaType.NoExenta.DesgloseIVA }
         *     
         */
        public void setDesgloseIVA(SujetaType.NoExenta.DesgloseIVA value) {
            this.desgloseIVA = value;
        }


        /**
         * Desglose por tipos de iva
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
         *         &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DetalleIVAEmitidaType" maxOccurs="6"/&gt;
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
            "detalleIVA"
        })
        public static class DesgloseIVA {

            @XmlElement(name = "DetalleIVA", required = true)
            protected List<DetalleIVAEmitidaType> detalleIVA;

            /**
             * Gets the value of the detalleIVA property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalleIVA property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalleIVA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DetalleIVAEmitidaType }
             * 
             * 
             */
            public List<DetalleIVAEmitidaType> getDetalleIVA() {
                if (detalleIVA == null) {
                    detalleIVA = new ArrayList<DetalleIVAEmitidaType>();
                }
                return this.detalleIVA;
            }

        }

    }

}
