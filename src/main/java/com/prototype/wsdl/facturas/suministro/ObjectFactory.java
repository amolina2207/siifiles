//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.06.06 a las 04:34:00 PM CEST 
//


package com.prototype.wsdl.facturas.suministro;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.prototype.wsdl.facturas.suministro package. 
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

    private final static QName _RespuestaLRFacturasEmitidas_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRFacturasEmitidas");
    private final static QName _RespuestaLRBajaFacturasEmitidas_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRBajaFacturasEmitidas");
    private final static QName _RespuestaLRFacturasRecibidas_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRFacturasRecibidas");
    private final static QName _RespuestaLRBajaFacturasRecibidas_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRBajaFacturasRecibidas");
    private final static QName _RespuestaLRBienesInversion_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRBienesInversion");
    private final static QName _RespuestaLRBajaBienesInversion_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRBajaBienesInversion");
    private final static QName _RespuestaLRDetOperacionesIntracomunitarias_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRDetOperacionesIntracomunitarias");
    private final static QName _RespuestaLRBajaDetOperacionesIntracomunitarias_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRBajaDetOperacionesIntracomunitarias");
    private final static QName _RespuestaLRAgenciasViajes_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRAgenciasViajes");
    private final static QName _RespuestaLRCobrosMetalico_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRCobrosMetalico");
    private final static QName _RespuestaLROperacionesSeguros_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLROperacionesSeguros");
    private final static QName _RespuestaLRBajaCobrosMetalico_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRBajaCobrosMetalico");
    private final static QName _RespuestaLRBajaAgenciasViajes_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRBajaAgenciasViajes");
    private final static QName _RespuestaLRBajaOperacionesSeguros_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRBajaOperacionesSeguros");
    private final static QName _RespuestaLRCobrosEmitidas_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRCobrosEmitidas");
    private final static QName _RespuestaLRPagosRecibidas_QNAME = new QName("https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", "RespuestaLRPagosRecibidas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.prototype.wsdl.facturas.suministro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistroSii }
     * 
     */
    public RegistroSii createRegistroSii() {
        return new RegistroSii();
    }

    /**
     * Create an instance of {@link SujetaPrestacionType }
     * 
     */
    public SujetaPrestacionType createSujetaPrestacionType() {
        return new SujetaPrestacionType();
    }

    /**
     * Create an instance of {@link SujetaPrestacionType.NoExenta }
     * 
     */
    public SujetaPrestacionType.NoExenta createSujetaPrestacionTypeNoExenta() {
        return new SujetaPrestacionType.NoExenta();
    }

    /**
     * Create an instance of {@link SujetaType }
     * 
     */
    public SujetaType createSujetaType() {
        return new SujetaType();
    }

    /**
     * Create an instance of {@link SujetaType.NoExenta }
     * 
     */
    public SujetaType.NoExenta createSujetaTypeNoExenta() {
        return new SujetaType.NoExenta();
    }

    /**
     * Create an instance of {@link FacturaType }
     * 
     */
    public FacturaType createFacturaType() {
        return new FacturaType();
    }

    /**
     * Create an instance of {@link DesgloseFacturaRecibidasType }
     * 
     */
    public DesgloseFacturaRecibidasType createDesgloseFacturaRecibidasType() {
        return new DesgloseFacturaRecibidasType();
    }

    /**
     * Create an instance of {@link FacturaExpedidaType }
     * 
     */
    public FacturaExpedidaType createFacturaExpedidaType() {
        return new FacturaExpedidaType();
    }

    /**
     * Create an instance of {@link IDFacturaRecibidaNombreBCType }
     * 
     */
    public IDFacturaRecibidaNombreBCType createIDFacturaRecibidaNombreBCType() {
        return new IDFacturaRecibidaNombreBCType();
    }

    /**
     * Create an instance of {@link IDFacturaRecibidaNombreType }
     * 
     */
    public IDFacturaRecibidaNombreType createIDFacturaRecibidaNombreType() {
        return new IDFacturaRecibidaNombreType();
    }

    /**
     * Create an instance of {@link IDFacturaRecibidaType }
     * 
     */
    public IDFacturaRecibidaType createIDFacturaRecibidaType() {
        return new IDFacturaRecibidaType();
    }

    /**
     * Create an instance of {@link IDFacturaExpedidaType }
     * 
     */
    public IDFacturaExpedidaType createIDFacturaExpedidaType() {
        return new IDFacturaExpedidaType();
    }

    /**
     * Create an instance of {@link IDFacturaExpedidaBCType }
     * 
     */
    public IDFacturaExpedidaBCType createIDFacturaExpedidaBCType() {
        return new IDFacturaExpedidaBCType();
    }

    /**
     * Create an instance of {@link IDFacturaConsulta1Type }
     * 
     */
    public IDFacturaConsulta1Type createIDFacturaConsulta1Type() {
        return new IDFacturaConsulta1Type();
    }

    /**
     * Create an instance of {@link ClavePaginacionBienType }
     * 
     */
    public ClavePaginacionBienType createClavePaginacionBienType() {
        return new ClavePaginacionBienType();
    }

    /**
     * Create an instance of {@link IDFacturaComunitariaType }
     * 
     */
    public IDFacturaComunitariaType createIDFacturaComunitariaType() {
        return new IDFacturaComunitariaType();
    }

    /**
     * Create an instance of {@link RespuestaOperacionesSegurosBajaType }
     * 
     */
    public RespuestaOperacionesSegurosBajaType createRespuestaOperacionesSegurosBajaType() {
        return new RespuestaOperacionesSegurosBajaType();
    }

    /**
     * Create an instance of {@link RespuestaOperacionesSegurosType }
     * 
     */
    public RespuestaOperacionesSegurosType createRespuestaOperacionesSegurosType() {
        return new RespuestaOperacionesSegurosType();
    }

    /**
     * Create an instance of {@link RespuestaAgenciasViajesBajaType }
     * 
     */
    public RespuestaAgenciasViajesBajaType createRespuestaAgenciasViajesBajaType() {
        return new RespuestaAgenciasViajesBajaType();
    }

    /**
     * Create an instance of {@link RespuestaMetalicoBajaType }
     * 
     */
    public RespuestaMetalicoBajaType createRespuestaMetalicoBajaType() {
        return new RespuestaMetalicoBajaType();
    }

    /**
     * Create an instance of {@link RespuestaAgenciasViajesType }
     * 
     */
    public RespuestaAgenciasViajesType createRespuestaAgenciasViajesType() {
        return new RespuestaAgenciasViajesType();
    }

    /**
     * Create an instance of {@link RespuestaMetalicoType }
     * 
     */
    public RespuestaMetalicoType createRespuestaMetalicoType() {
        return new RespuestaMetalicoType();
    }

    /**
     * Create an instance of {@link RespuestaBienBajaType }
     * 
     */
    public RespuestaBienBajaType createRespuestaBienBajaType() {
        return new RespuestaBienBajaType();
    }

    /**
     * Create an instance of {@link RespuestaBienType }
     * 
     */
    public RespuestaBienType createRespuestaBienType() {
        return new RespuestaBienType();
    }

    /**
     * Create an instance of {@link RespuestaLRFEmitidasType }
     * 
     */
    public RespuestaLRFEmitidasType createRespuestaLRFEmitidasType() {
        return new RespuestaLRFEmitidasType();
    }

    /**
     * Create an instance of {@link RespuestaLRBajaFEmitidasType }
     * 
     */
    public RespuestaLRBajaFEmitidasType createRespuestaLRBajaFEmitidasType() {
        return new RespuestaLRBajaFEmitidasType();
    }

    /**
     * Create an instance of {@link RespuestaLRFRecibidasType }
     * 
     */
    public RespuestaLRFRecibidasType createRespuestaLRFRecibidasType() {
        return new RespuestaLRFRecibidasType();
    }

    /**
     * Create an instance of {@link RespuestaLRBajaFRecibidasType }
     * 
     */
    public RespuestaLRBajaFRecibidasType createRespuestaLRBajaFRecibidasType() {
        return new RespuestaLRBajaFRecibidasType();
    }

    /**
     * Create an instance of {@link RespuestaLRBienesInversionType }
     * 
     */
    public RespuestaLRBienesInversionType createRespuestaLRBienesInversionType() {
        return new RespuestaLRBienesInversionType();
    }

    /**
     * Create an instance of {@link RespuestaLRBajaBienesInversionType }
     * 
     */
    public RespuestaLRBajaBienesInversionType createRespuestaLRBajaBienesInversionType() {
        return new RespuestaLRBajaBienesInversionType();
    }

    /**
     * Create an instance of {@link RespuestaLROComunitariasType }
     * 
     */
    public RespuestaLROComunitariasType createRespuestaLROComunitariasType() {
        return new RespuestaLROComunitariasType();
    }

    /**
     * Create an instance of {@link RespuestaLRBajaOComunitariasType }
     * 
     */
    public RespuestaLRBajaOComunitariasType createRespuestaLRBajaOComunitariasType() {
        return new RespuestaLRBajaOComunitariasType();
    }

    /**
     * Create an instance of {@link RespuestaLRAgenciasViajesType }
     * 
     */
    public RespuestaLRAgenciasViajesType createRespuestaLRAgenciasViajesType() {
        return new RespuestaLRAgenciasViajesType();
    }

    /**
     * Create an instance of {@link RespuestaLRIMetalicoType }
     * 
     */
    public RespuestaLRIMetalicoType createRespuestaLRIMetalicoType() {
        return new RespuestaLRIMetalicoType();
    }

    /**
     * Create an instance of {@link RespuestaLROperacionesSegurosType }
     * 
     */
    public RespuestaLROperacionesSegurosType createRespuestaLROperacionesSegurosType() {
        return new RespuestaLROperacionesSegurosType();
    }

    /**
     * Create an instance of {@link RespuestaLRBajaIMetalicoType }
     * 
     */
    public RespuestaLRBajaIMetalicoType createRespuestaLRBajaIMetalicoType() {
        return new RespuestaLRBajaIMetalicoType();
    }

    /**
     * Create an instance of {@link RespuestaLRBajaAgenciasViajesType }
     * 
     */
    public RespuestaLRBajaAgenciasViajesType createRespuestaLRBajaAgenciasViajesType() {
        return new RespuestaLRBajaAgenciasViajesType();
    }

    /**
     * Create an instance of {@link RespuestaLRBajaOperacionesSegurosType }
     * 
     */
    public RespuestaLRBajaOperacionesSegurosType createRespuestaLRBajaOperacionesSegurosType() {
        return new RespuestaLRBajaOperacionesSegurosType();
    }

    /**
     * Create an instance of {@link RespuestaLRCobrosEmitidasType }
     * 
     */
    public RespuestaLRCobrosEmitidasType createRespuestaLRCobrosEmitidasType() {
        return new RespuestaLRCobrosEmitidasType();
    }

    /**
     * Create an instance of {@link RespuestaLRPagosRecibidasType }
     * 
     */
    public RespuestaLRPagosRecibidasType createRespuestaLRPagosRecibidasType() {
        return new RespuestaLRPagosRecibidasType();
    }

    /**
     * Create an instance of {@link RespuestaComunAltaType }
     * 
     */
    public RespuestaComunAltaType createRespuestaComunAltaType() {
        return new RespuestaComunAltaType();
    }

    /**
     * Create an instance of {@link RespuestaLRBajaFRecibidasPagosType }
     * 
     */
    public RespuestaLRBajaFRecibidasPagosType createRespuestaLRBajaFRecibidasPagosType() {
        return new RespuestaLRBajaFRecibidasPagosType();
    }

    /**
     * Create an instance of {@link RespuestaComunBajaType }
     * 
     */
    public RespuestaComunBajaType createRespuestaComunBajaType() {
        return new RespuestaComunBajaType();
    }

    /**
     * Create an instance of {@link RespuestaCobrosPagosType }
     * 
     */
    public RespuestaCobrosPagosType createRespuestaCobrosPagosType() {
        return new RespuestaCobrosPagosType();
    }

    /**
     * Create an instance of {@link RespuestaExpedidaType }
     * 
     */
    public RespuestaExpedidaType createRespuestaExpedidaType() {
        return new RespuestaExpedidaType();
    }

    /**
     * Create an instance of {@link RespuestaExpedidaBajaType }
     * 
     */
    public RespuestaExpedidaBajaType createRespuestaExpedidaBajaType() {
        return new RespuestaExpedidaBajaType();
    }

    /**
     * Create an instance of {@link RespuestaExpedidaCobroType }
     * 
     */
    public RespuestaExpedidaCobroType createRespuestaExpedidaCobroType() {
        return new RespuestaExpedidaCobroType();
    }

    /**
     * Create an instance of {@link RespuestaRecibidaType }
     * 
     */
    public RespuestaRecibidaType createRespuestaRecibidaType() {
        return new RespuestaRecibidaType();
    }

    /**
     * Create an instance of {@link RespuestaRecibidaBajaType }
     * 
     */
    public RespuestaRecibidaBajaType createRespuestaRecibidaBajaType() {
        return new RespuestaRecibidaBajaType();
    }

    /**
     * Create an instance of {@link RespuestaRecibidaPagoType }
     * 
     */
    public RespuestaRecibidaPagoType createRespuestaRecibidaPagoType() {
        return new RespuestaRecibidaPagoType();
    }

    /**
     * Create an instance of {@link RespuestaComunitariaType }
     * 
     */
    public RespuestaComunitariaType createRespuestaComunitariaType() {
        return new RespuestaComunitariaType();
    }

    /**
     * Create an instance of {@link RespuestaComunitariaBajaType }
     * 
     */
    public RespuestaComunitariaBajaType createRespuestaComunitariaBajaType() {
        return new RespuestaComunitariaBajaType();
    }

    /**
     * Create an instance of {@link SuministroInformacion }
     * 
     */
    public SuministroInformacion createSuministroInformacion() {
        return new SuministroInformacion();
    }

    /**
     * Create an instance of {@link SuministroInformacionBaja }
     * 
     */
    public SuministroInformacionBaja createSuministroInformacionBaja() {
        return new SuministroInformacionBaja();
    }

    /**
     * Create an instance of {@link SuministroInformacionCobrosPagos }
     * 
     */
    public SuministroInformacionCobrosPagos createSuministroInformacionCobrosPagos() {
        return new SuministroInformacionCobrosPagos();
    }

    /**
     * Create an instance of {@link ConsultaInformacion }
     * 
     */
    public ConsultaInformacion createConsultaInformacion() {
        return new ConsultaInformacion();
    }

    /**
     * Create an instance of {@link CabeceraSii }
     * 
     */
    public CabeceraSii createCabeceraSii() {
        return new CabeceraSii();
    }

    /**
     * Create an instance of {@link CabeceraSiiBaja }
     * 
     */
    public CabeceraSiiBaja createCabeceraSiiBaja() {
        return new CabeceraSiiBaja();
    }

    /**
     * Create an instance of {@link CabeceraSiiCobrosPagos }
     * 
     */
    public CabeceraSiiCobrosPagos createCabeceraSiiCobrosPagos() {
        return new CabeceraSiiCobrosPagos();
    }

    /**
     * Create an instance of {@link DatosPresentacionType }
     * 
     */
    public DatosPresentacionType createDatosPresentacionType() {
        return new DatosPresentacionType();
    }

    /**
     * Create an instance of {@link DatosPresentacion2Type }
     * 
     */
    public DatosPresentacion2Type createDatosPresentacion2Type() {
        return new DatosPresentacion2Type();
    }

    /**
     * Create an instance of {@link CabeceraConsultaSii }
     * 
     */
    public CabeceraConsultaSii createCabeceraConsultaSii() {
        return new CabeceraConsultaSii();
    }

    /**
     * Create an instance of {@link OperacionIntracomunitariaType }
     * 
     */
    public OperacionIntracomunitariaType createOperacionIntracomunitariaType() {
        return new OperacionIntracomunitariaType();
    }

    /**
     * Create an instance of {@link BienDeInversionType }
     * 
     */
    public BienDeInversionType createBienDeInversionType() {
        return new BienDeInversionType();
    }

    /**
     * Create an instance of {@link IDFacturaConsulta2Type }
     * 
     */
    public IDFacturaConsulta2Type createIDFacturaConsulta2Type() {
        return new IDFacturaConsulta2Type();
    }

    /**
     * Create an instance of {@link IDFacturaARType }
     * 
     */
    public IDFacturaARType createIDFacturaARType() {
        return new IDFacturaARType();
    }

    /**
     * Create an instance of {@link FacturaRecibidaType }
     * 
     */
    public FacturaRecibidaType createFacturaRecibidaType() {
        return new FacturaRecibidaType();
    }

    /**
     * Create an instance of {@link CobrosType }
     * 
     */
    public CobrosType createCobrosType() {
        return new CobrosType();
    }

    /**
     * Create an instance of {@link PagosType }
     * 
     */
    public PagosType createPagosType() {
        return new PagosType();
    }

    /**
     * Create an instance of {@link DetalleIVAEmitidaType }
     * 
     */
    public DetalleIVAEmitidaType createDetalleIVAEmitidaType() {
        return new DetalleIVAEmitidaType();
    }

    /**
     * Create an instance of {@link DetalleIVARecibida2Type }
     * 
     */
    public DetalleIVARecibida2Type createDetalleIVARecibida2Type() {
        return new DetalleIVARecibida2Type();
    }

    /**
     * Create an instance of {@link DetalleIVAEmitidaPrestacionType }
     * 
     */
    public DetalleIVAEmitidaPrestacionType createDetalleIVAEmitidaPrestacionType() {
        return new DetalleIVAEmitidaPrestacionType();
    }

    /**
     * Create an instance of {@link DetalleIVARecibidaType }
     * 
     */
    public DetalleIVARecibidaType createDetalleIVARecibidaType() {
        return new DetalleIVARecibidaType();
    }

    /**
     * Create an instance of {@link DesgloseRectificacionType }
     * 
     */
    public DesgloseRectificacionType createDesgloseRectificacionType() {
        return new DesgloseRectificacionType();
    }

    /**
     * Create an instance of {@link AduanasType }
     * 
     */
    public AduanasType createAduanasType() {
        return new AduanasType();
    }

    /**
     * Create an instance of {@link DatosInmuebleType }
     * 
     */
    public DatosInmuebleType createDatosInmuebleType() {
        return new DatosInmuebleType();
    }

    /**
     * Create an instance of {@link DatosPagoCobroType }
     * 
     */
    public DatosPagoCobroType createDatosPagoCobroType() {
        return new DatosPagoCobroType();
    }

    /**
     * Create an instance of {@link PersonaFisicaJuridicaESType }
     * 
     */
    public PersonaFisicaJuridicaESType createPersonaFisicaJuridicaESType() {
        return new PersonaFisicaJuridicaESType();
    }

    /**
     * Create an instance of {@link PersonaFisicaJuridicaUnicaESType }
     * 
     */
    public PersonaFisicaJuridicaUnicaESType createPersonaFisicaJuridicaUnicaESType() {
        return new PersonaFisicaJuridicaUnicaESType();
    }

    /**
     * Create an instance of {@link PersonaFisicaJuridicaType }
     * 
     */
    public PersonaFisicaJuridicaType createPersonaFisicaJuridicaType() {
        return new PersonaFisicaJuridicaType();
    }

    /**
     * Create an instance of {@link ContraparteConsultaType }
     * 
     */
    public ContraparteConsultaType createContraparteConsultaType() {
        return new ContraparteConsultaType();
    }

    /**
     * Create an instance of {@link IDOtroType }
     * 
     */
    public IDOtroType createIDOtroType() {
        return new IDOtroType();
    }

    /**
     * Create an instance of {@link TipoConDesgloseType }
     * 
     */
    public TipoConDesgloseType createTipoConDesgloseType() {
        return new TipoConDesgloseType();
    }

    /**
     * Create an instance of {@link TipoSinDesgloseType }
     * 
     */
    public TipoSinDesgloseType createTipoSinDesgloseType() {
        return new TipoSinDesgloseType();
    }

    /**
     * Create an instance of {@link TipoSinDesglosePrestacionType }
     * 
     */
    public TipoSinDesglosePrestacionType createTipoSinDesglosePrestacionType() {
        return new TipoSinDesglosePrestacionType();
    }

    /**
     * Create an instance of {@link NoSujetaType }
     * 
     */
    public NoSujetaType createNoSujetaType() {
        return new NoSujetaType();
    }

    /**
     * Create an instance of {@link RangoFechaPresentacionType }
     * 
     */
    public RangoFechaPresentacionType createRangoFechaPresentacionType() {
        return new RangoFechaPresentacionType();
    }

    /**
     * Create an instance of {@link SuministroLRFacturasEmitidas }
     * 
     */
    public SuministroLRFacturasEmitidas createSuministroLRFacturasEmitidas() {
        return new SuministroLRFacturasEmitidas();
    }

    /**
     * Create an instance of {@link LRfacturasEmitidasType }
     * 
     */
    public LRfacturasEmitidasType createLRfacturasEmitidasType() {
        return new LRfacturasEmitidasType();
    }

    /**
     * Create an instance of {@link BajaLRFacturasEmitidas }
     * 
     */
    public BajaLRFacturasEmitidas createBajaLRFacturasEmitidas() {
        return new BajaLRFacturasEmitidas();
    }

    /**
     * Create an instance of {@link LRBajaExpedidasType }
     * 
     */
    public LRBajaExpedidasType createLRBajaExpedidasType() {
        return new LRBajaExpedidasType();
    }

    /**
     * Create an instance of {@link SuministroLRFacturasRecibidas }
     * 
     */
    public SuministroLRFacturasRecibidas createSuministroLRFacturasRecibidas() {
        return new SuministroLRFacturasRecibidas();
    }

    /**
     * Create an instance of {@link LRFacturasRecibidasType }
     * 
     */
    public LRFacturasRecibidasType createLRFacturasRecibidasType() {
        return new LRFacturasRecibidasType();
    }

    /**
     * Create an instance of {@link BajaLRFacturasRecibidas }
     * 
     */
    public BajaLRFacturasRecibidas createBajaLRFacturasRecibidas() {
        return new BajaLRFacturasRecibidas();
    }

    /**
     * Create an instance of {@link LRBajaRecibidasType }
     * 
     */
    public LRBajaRecibidasType createLRBajaRecibidasType() {
        return new LRBajaRecibidasType();
    }

    /**
     * Create an instance of {@link SuministroLRBienesInversion }
     * 
     */
    public SuministroLRBienesInversion createSuministroLRBienesInversion() {
        return new SuministroLRBienesInversion();
    }

    /**
     * Create an instance of {@link LRBienesInversionType }
     * 
     */
    public LRBienesInversionType createLRBienesInversionType() {
        return new LRBienesInversionType();
    }

    /**
     * Create an instance of {@link BajaLRBienesInversion }
     * 
     */
    public BajaLRBienesInversion createBajaLRBienesInversion() {
        return new BajaLRBienesInversion();
    }

    /**
     * Create an instance of {@link LRBajaBienesInversionType }
     * 
     */
    public LRBajaBienesInversionType createLRBajaBienesInversionType() {
        return new LRBajaBienesInversionType();
    }

    /**
     * Create an instance of {@link SuministroLRAgenciasViajes }
     * 
     */
    public SuministroLRAgenciasViajes createSuministroLRAgenciasViajes() {
        return new SuministroLRAgenciasViajes();
    }

    /**
     * Create an instance of {@link LRAgenciasViajesType }
     * 
     */
    public LRAgenciasViajesType createLRAgenciasViajesType() {
        return new LRAgenciasViajesType();
    }

    /**
     * Create an instance of {@link BajaLRAgenciasViajes }
     * 
     */
    public BajaLRAgenciasViajes createBajaLRAgenciasViajes() {
        return new BajaLRAgenciasViajes();
    }

    /**
     * Create an instance of {@link LRBajaAgenciasViajesType }
     * 
     */
    public LRBajaAgenciasViajesType createLRBajaAgenciasViajesType() {
        return new LRBajaAgenciasViajesType();
    }

    /**
     * Create an instance of {@link SuministroLRCobrosMetalico }
     * 
     */
    public SuministroLRCobrosMetalico createSuministroLRCobrosMetalico() {
        return new SuministroLRCobrosMetalico();
    }

    /**
     * Create an instance of {@link LRCobrosMetalicoType }
     * 
     */
    public LRCobrosMetalicoType createLRCobrosMetalicoType() {
        return new LRCobrosMetalicoType();
    }

    /**
     * Create an instance of {@link BajaLRCobrosMetalico }
     * 
     */
    public BajaLRCobrosMetalico createBajaLRCobrosMetalico() {
        return new BajaLRCobrosMetalico();
    }

    /**
     * Create an instance of {@link LRBajaCobrosMetalicoType }
     * 
     */
    public LRBajaCobrosMetalicoType createLRBajaCobrosMetalicoType() {
        return new LRBajaCobrosMetalicoType();
    }

    /**
     * Create an instance of {@link SuministroLROperacionesSeguros }
     * 
     */
    public SuministroLROperacionesSeguros createSuministroLROperacionesSeguros() {
        return new SuministroLROperacionesSeguros();
    }

    /**
     * Create an instance of {@link LROperacionesSegurosType }
     * 
     */
    public LROperacionesSegurosType createLROperacionesSegurosType() {
        return new LROperacionesSegurosType();
    }

    /**
     * Create an instance of {@link BajaLROperacionesSeguros }
     * 
     */
    public BajaLROperacionesSeguros createBajaLROperacionesSeguros() {
        return new BajaLROperacionesSeguros();
    }

    /**
     * Create an instance of {@link LRBajaRegistroLROperacionesSegurosType }
     * 
     */
    public LRBajaRegistroLROperacionesSegurosType createLRBajaRegistroLROperacionesSegurosType() {
        return new LRBajaRegistroLROperacionesSegurosType();
    }

    /**
     * Create an instance of {@link SuministroLRDetOperacionIntracomunitaria }
     * 
     */
    public SuministroLRDetOperacionIntracomunitaria createSuministroLRDetOperacionIntracomunitaria() {
        return new SuministroLRDetOperacionIntracomunitaria();
    }

    /**
     * Create an instance of {@link LROperacionIntracomunitariaType }
     * 
     */
    public LROperacionIntracomunitariaType createLROperacionIntracomunitariaType() {
        return new LROperacionIntracomunitariaType();
    }

    /**
     * Create an instance of {@link BajaLRDetOperacionIntracomunitaria }
     * 
     */
    public BajaLRDetOperacionIntracomunitaria createBajaLRDetOperacionIntracomunitaria() {
        return new BajaLRDetOperacionIntracomunitaria();
    }

    /**
     * Create an instance of {@link LRBajaOperacionIntracomunitariaType }
     * 
     */
    public LRBajaOperacionIntracomunitariaType createLRBajaOperacionIntracomunitariaType() {
        return new LRBajaOperacionIntracomunitariaType();
    }

    /**
     * Create an instance of {@link SuministroLRCobrosEmitidas }
     * 
     */
    public SuministroLRCobrosEmitidas createSuministroLRCobrosEmitidas() {
        return new SuministroLRCobrosEmitidas();
    }

    /**
     * Create an instance of {@link LRCobrosEmitidasType }
     * 
     */
    public LRCobrosEmitidasType createLRCobrosEmitidasType() {
        return new LRCobrosEmitidasType();
    }

    /**
     * Create an instance of {@link SuministroLRPagosRecibidas }
     * 
     */
    public SuministroLRPagosRecibidas createSuministroLRPagosRecibidas() {
        return new SuministroLRPagosRecibidas();
    }

    /**
     * Create an instance of {@link LRPagosEmitidasType }
     * 
     */
    public LRPagosEmitidasType createLRPagosEmitidasType() {
        return new LRPagosEmitidasType();
    }

    /**
     * Create an instance of {@link RegistroSii.PeriodoImpositivo }
     * 
     */
    public RegistroSii.PeriodoImpositivo createRegistroSiiPeriodoImpositivo() {
        return new RegistroSii.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link SujetaPrestacionType.Exenta }
     * 
     */
    public SujetaPrestacionType.Exenta createSujetaPrestacionTypeExenta() {
        return new SujetaPrestacionType.Exenta();
    }

    /**
     * Create an instance of {@link SujetaPrestacionType.NoExenta.DesgloseIVA }
     * 
     */
    public SujetaPrestacionType.NoExenta.DesgloseIVA createSujetaPrestacionTypeNoExentaDesgloseIVA() {
        return new SujetaPrestacionType.NoExenta.DesgloseIVA();
    }

    /**
     * Create an instance of {@link SujetaType.Exenta }
     * 
     */
    public SujetaType.Exenta createSujetaTypeExenta() {
        return new SujetaType.Exenta();
    }

    /**
     * Create an instance of {@link SujetaType.NoExenta.DesgloseIVA }
     * 
     */
    public SujetaType.NoExenta.DesgloseIVA createSujetaTypeNoExentaDesgloseIVA() {
        return new SujetaType.NoExenta.DesgloseIVA();
    }

    /**
     * Create an instance of {@link FacturaType.FacturasAgrupadas }
     * 
     */
    public FacturaType.FacturasAgrupadas createFacturaTypeFacturasAgrupadas() {
        return new FacturaType.FacturasAgrupadas();
    }

    /**
     * Create an instance of {@link FacturaType.FacturasRectificadas }
     * 
     */
    public FacturaType.FacturasRectificadas createFacturaTypeFacturasRectificadas() {
        return new FacturaType.FacturasRectificadas();
    }

    /**
     * Create an instance of {@link DesgloseFacturaRecibidasType.InversionSujetoPasivo }
     * 
     */
    public DesgloseFacturaRecibidasType.InversionSujetoPasivo createDesgloseFacturaRecibidasTypeInversionSujetoPasivo() {
        return new DesgloseFacturaRecibidasType.InversionSujetoPasivo();
    }

    /**
     * Create an instance of {@link DesgloseFacturaRecibidasType.DesgloseIVA }
     * 
     */
    public DesgloseFacturaRecibidasType.DesgloseIVA createDesgloseFacturaRecibidasTypeDesgloseIVA() {
        return new DesgloseFacturaRecibidasType.DesgloseIVA();
    }

    /**
     * Create an instance of {@link FacturaExpedidaType.DatosInmueble }
     * 
     */
    public FacturaExpedidaType.DatosInmueble createFacturaExpedidaTypeDatosInmueble() {
        return new FacturaExpedidaType.DatosInmueble();
    }

    /**
     * Create an instance of {@link FacturaExpedidaType.TipoDesglose }
     * 
     */
    public FacturaExpedidaType.TipoDesglose createFacturaExpedidaTypeTipoDesglose() {
        return new FacturaExpedidaType.TipoDesglose();
    }

    /**
     * Create an instance of {@link IDFacturaRecibidaNombreBCType.IDEmisorFactura }
     * 
     */
    public IDFacturaRecibidaNombreBCType.IDEmisorFactura createIDFacturaRecibidaNombreBCTypeIDEmisorFactura() {
        return new IDFacturaRecibidaNombreBCType.IDEmisorFactura();
    }

    /**
     * Create an instance of {@link IDFacturaRecibidaNombreType.IDEmisorFactura }
     * 
     */
    public IDFacturaRecibidaNombreType.IDEmisorFactura createIDFacturaRecibidaNombreTypeIDEmisorFactura() {
        return new IDFacturaRecibidaNombreType.IDEmisorFactura();
    }

    /**
     * Create an instance of {@link IDFacturaRecibidaType.IDEmisorFactura }
     * 
     */
    public IDFacturaRecibidaType.IDEmisorFactura createIDFacturaRecibidaTypeIDEmisorFactura() {
        return new IDFacturaRecibidaType.IDEmisorFactura();
    }

    /**
     * Create an instance of {@link IDFacturaExpedidaType.IDEmisorFactura }
     * 
     */
    public IDFacturaExpedidaType.IDEmisorFactura createIDFacturaExpedidaTypeIDEmisorFactura() {
        return new IDFacturaExpedidaType.IDEmisorFactura();
    }

    /**
     * Create an instance of {@link IDFacturaExpedidaBCType.IDEmisorFactura }
     * 
     */
    public IDFacturaExpedidaBCType.IDEmisorFactura createIDFacturaExpedidaBCTypeIDEmisorFactura() {
        return new IDFacturaExpedidaBCType.IDEmisorFactura();
    }

    /**
     * Create an instance of {@link IDFacturaConsulta1Type.IDEmisorFactura }
     * 
     */
    public IDFacturaConsulta1Type.IDEmisorFactura createIDFacturaConsulta1TypeIDEmisorFactura() {
        return new IDFacturaConsulta1Type.IDEmisorFactura();
    }

    /**
     * Create an instance of {@link ClavePaginacionBienType.IDEmisorFactura }
     * 
     */
    public ClavePaginacionBienType.IDEmisorFactura createClavePaginacionBienTypeIDEmisorFactura() {
        return new ClavePaginacionBienType.IDEmisorFactura();
    }

    /**
     * Create an instance of {@link IDFacturaComunitariaType.IDEmisorFactura }
     * 
     */
    public IDFacturaComunitariaType.IDEmisorFactura createIDFacturaComunitariaTypeIDEmisorFactura() {
        return new IDFacturaComunitariaType.IDEmisorFactura();
    }

    /**
     * Create an instance of {@link RespuestaOperacionesSegurosBajaType.PeriodoImpositivo }
     * 
     */
    public RespuestaOperacionesSegurosBajaType.PeriodoImpositivo createRespuestaOperacionesSegurosBajaTypePeriodoImpositivo() {
        return new RespuestaOperacionesSegurosBajaType.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link RespuestaOperacionesSegurosType.PeriodoImpositivo }
     * 
     */
    public RespuestaOperacionesSegurosType.PeriodoImpositivo createRespuestaOperacionesSegurosTypePeriodoImpositivo() {
        return new RespuestaOperacionesSegurosType.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link RespuestaAgenciasViajesBajaType.PeriodoImpositivo }
     * 
     */
    public RespuestaAgenciasViajesBajaType.PeriodoImpositivo createRespuestaAgenciasViajesBajaTypePeriodoImpositivo() {
        return new RespuestaAgenciasViajesBajaType.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link RespuestaMetalicoBajaType.PeriodoImpositivo }
     * 
     */
    public RespuestaMetalicoBajaType.PeriodoImpositivo createRespuestaMetalicoBajaTypePeriodoImpositivo() {
        return new RespuestaMetalicoBajaType.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link RespuestaAgenciasViajesType.PeriodoImpositivo }
     * 
     */
    public RespuestaAgenciasViajesType.PeriodoImpositivo createRespuestaAgenciasViajesTypePeriodoImpositivo() {
        return new RespuestaAgenciasViajesType.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link RespuestaMetalicoType.PeriodoImpositivo }
     * 
     */
    public RespuestaMetalicoType.PeriodoImpositivo createRespuestaMetalicoTypePeriodoImpositivo() {
        return new RespuestaMetalicoType.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link RespuestaBienBajaType.PeriodoImpositivo }
     * 
     */
    public RespuestaBienBajaType.PeriodoImpositivo createRespuestaBienBajaTypePeriodoImpositivo() {
        return new RespuestaBienBajaType.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link RespuestaBienType.PeriodoImpositivo }
     * 
     */
    public RespuestaBienType.PeriodoImpositivo createRespuestaBienTypePeriodoImpositivo() {
        return new RespuestaBienType.PeriodoImpositivo();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRFEmitidasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRFacturasEmitidas")
    public JAXBElement<RespuestaLRFEmitidasType> createRespuestaLRFacturasEmitidas(RespuestaLRFEmitidasType value) {
        return new JAXBElement<RespuestaLRFEmitidasType>(_RespuestaLRFacturasEmitidas_QNAME, RespuestaLRFEmitidasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRBajaFEmitidasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRBajaFacturasEmitidas")
    public JAXBElement<RespuestaLRBajaFEmitidasType> createRespuestaLRBajaFacturasEmitidas(RespuestaLRBajaFEmitidasType value) {
        return new JAXBElement<RespuestaLRBajaFEmitidasType>(_RespuestaLRBajaFacturasEmitidas_QNAME, RespuestaLRBajaFEmitidasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRFRecibidasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRFacturasRecibidas")
    public JAXBElement<RespuestaLRFRecibidasType> createRespuestaLRFacturasRecibidas(RespuestaLRFRecibidasType value) {
        return new JAXBElement<RespuestaLRFRecibidasType>(_RespuestaLRFacturasRecibidas_QNAME, RespuestaLRFRecibidasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRBajaFRecibidasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRBajaFacturasRecibidas")
    public JAXBElement<RespuestaLRBajaFRecibidasType> createRespuestaLRBajaFacturasRecibidas(RespuestaLRBajaFRecibidasType value) {
        return new JAXBElement<RespuestaLRBajaFRecibidasType>(_RespuestaLRBajaFacturasRecibidas_QNAME, RespuestaLRBajaFRecibidasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRBienesInversionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRBienesInversion")
    public JAXBElement<RespuestaLRBienesInversionType> createRespuestaLRBienesInversion(RespuestaLRBienesInversionType value) {
        return new JAXBElement<RespuestaLRBienesInversionType>(_RespuestaLRBienesInversion_QNAME, RespuestaLRBienesInversionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRBajaBienesInversionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRBajaBienesInversion")
    public JAXBElement<RespuestaLRBajaBienesInversionType> createRespuestaLRBajaBienesInversion(RespuestaLRBajaBienesInversionType value) {
        return new JAXBElement<RespuestaLRBajaBienesInversionType>(_RespuestaLRBajaBienesInversion_QNAME, RespuestaLRBajaBienesInversionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLROComunitariasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRDetOperacionesIntracomunitarias")
    public JAXBElement<RespuestaLROComunitariasType> createRespuestaLRDetOperacionesIntracomunitarias(RespuestaLROComunitariasType value) {
        return new JAXBElement<RespuestaLROComunitariasType>(_RespuestaLRDetOperacionesIntracomunitarias_QNAME, RespuestaLROComunitariasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRBajaOComunitariasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRBajaDetOperacionesIntracomunitarias")
    public JAXBElement<RespuestaLRBajaOComunitariasType> createRespuestaLRBajaDetOperacionesIntracomunitarias(RespuestaLRBajaOComunitariasType value) {
        return new JAXBElement<RespuestaLRBajaOComunitariasType>(_RespuestaLRBajaDetOperacionesIntracomunitarias_QNAME, RespuestaLRBajaOComunitariasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRAgenciasViajesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRAgenciasViajes")
    public JAXBElement<RespuestaLRAgenciasViajesType> createRespuestaLRAgenciasViajes(RespuestaLRAgenciasViajesType value) {
        return new JAXBElement<RespuestaLRAgenciasViajesType>(_RespuestaLRAgenciasViajes_QNAME, RespuestaLRAgenciasViajesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRIMetalicoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRCobrosMetalico")
    public JAXBElement<RespuestaLRIMetalicoType> createRespuestaLRCobrosMetalico(RespuestaLRIMetalicoType value) {
        return new JAXBElement<RespuestaLRIMetalicoType>(_RespuestaLRCobrosMetalico_QNAME, RespuestaLRIMetalicoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLROperacionesSegurosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLROperacionesSeguros")
    public JAXBElement<RespuestaLROperacionesSegurosType> createRespuestaLROperacionesSeguros(RespuestaLROperacionesSegurosType value) {
        return new JAXBElement<RespuestaLROperacionesSegurosType>(_RespuestaLROperacionesSeguros_QNAME, RespuestaLROperacionesSegurosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRBajaIMetalicoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRBajaCobrosMetalico")
    public JAXBElement<RespuestaLRBajaIMetalicoType> createRespuestaLRBajaCobrosMetalico(RespuestaLRBajaIMetalicoType value) {
        return new JAXBElement<RespuestaLRBajaIMetalicoType>(_RespuestaLRBajaCobrosMetalico_QNAME, RespuestaLRBajaIMetalicoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRBajaAgenciasViajesType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRBajaAgenciasViajes")
    public JAXBElement<RespuestaLRBajaAgenciasViajesType> createRespuestaLRBajaAgenciasViajes(RespuestaLRBajaAgenciasViajesType value) {
        return new JAXBElement<RespuestaLRBajaAgenciasViajesType>(_RespuestaLRBajaAgenciasViajes_QNAME, RespuestaLRBajaAgenciasViajesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRBajaOperacionesSegurosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRBajaOperacionesSeguros")
    public JAXBElement<RespuestaLRBajaOperacionesSegurosType> createRespuestaLRBajaOperacionesSeguros(RespuestaLRBajaOperacionesSegurosType value) {
        return new JAXBElement<RespuestaLRBajaOperacionesSegurosType>(_RespuestaLRBajaOperacionesSeguros_QNAME, RespuestaLRBajaOperacionesSegurosType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRCobrosEmitidasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRCobrosEmitidas")
    public JAXBElement<RespuestaLRCobrosEmitidasType> createRespuestaLRCobrosEmitidas(RespuestaLRCobrosEmitidasType value) {
        return new JAXBElement<RespuestaLRCobrosEmitidasType>(_RespuestaLRCobrosEmitidas_QNAME, RespuestaLRCobrosEmitidasType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RespuestaLRPagosRecibidasType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd", name = "RespuestaLRPagosRecibidas")
    public JAXBElement<RespuestaLRPagosRecibidasType> createRespuestaLRPagosRecibidas(RespuestaLRPagosRecibidasType value) {
        return new JAXBElement<RespuestaLRPagosRecibidasType>(_RespuestaLRPagosRecibidas_QNAME, RespuestaLRPagosRecibidasType.class, null, value);
    }

}
