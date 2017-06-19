//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 04:34:00 PM CEST 
//


package com.prototype.wsdl.facturas.suministro;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ErrorEnvioType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorEnvioType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ERR01"/&gt;
 *     &lt;enumeration value="ERR03"/&gt;
 *     &lt;enumeration value="ERR04"/&gt;
 *     &lt;enumeration value="ERR05"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErrorEnvioType", namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd")
@XmlEnum
public enum ErrorEnvioType {


    /**
     * Error de validación contra esquema
     * 
     */
    @XmlEnumValue("ERR01")
    ERR_01("ERR01"),

    /**
     * Declarante desconocido
     * 
     */
    @XmlEnumValue("ERR03")
    ERR_03("ERR03"),

    /**
     * El declarante debe identificarse mediante un NIF español.
     * 
     */
    @XmlEnumValue("ERR04")
    ERR_04("ERR04"),

    /**
     * El NIF del representante es incorrecto.
     * 
     */
    @XmlEnumValue("ERR05")
    ERR_05("ERR05");
    private final String value;

    ErrorEnvioType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorEnvioType fromValue(String v) {
        for (ErrorEnvioType c: ErrorEnvioType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
