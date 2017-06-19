package com.prototype.wsdl.facturas.suministro;

import javax.xml.bind.JAXBElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

/**
 * Created by aitor on 06/06/2017.
 */
public class FacturasClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(FacturasClient.class);

    @Autowired Jaxb2Marshaller marshaller;

    public RespuestaLRFEmitidasType sendAndReceiveFacturas() {

        SuministroLRFacturasEmitidas facturasEmitidasRequest = new SuministroLRFacturasEmitidas();
        CabeceraSii cabecera = new CabeceraSii();
        cabecera.setIDVersionSii("0.6");
        PersonaFisicaJuridicaESType personaFisica = new PersonaFisicaJuridicaESType();
        personaFisica.setNombreRazon("MARC LABLANC, S.L.3");
        personaFisica.setNIF("B59364703");
        cabecera.setTitular(personaFisica);
        cabecera.setTipoComunicacion(ClaveTipoComunicacionType.A_0);
        facturasEmitidasRequest.setCabecera(cabecera);

        LRfacturasEmitidasType factura1 = new LRfacturasEmitidasType();
        RegistroSii.PeriodoImpositivo periodoImpositivo = new RegistroSii.PeriodoImpositivo();
        periodoImpositivo.setEjercicio("2016");
        periodoImpositivo.setPeriodo("01");
        factura1.setPeriodoImpositivo(periodoImpositivo);

        IDFacturaExpedidaType idFactura = new IDFacturaExpedidaType();
        IDFacturaExpedidaType.IDEmisorFactura idEmisorFactura = new IDFacturaExpedidaType.IDEmisorFactura();
        idEmisorFactura.setNIF("B59364703");
        idFactura.setIDEmisorFactura(idEmisorFactura);
        idFactura.setNumSerieFacturaEmisor("F1110385");
        idFactura.setFechaExpedicionFacturaEmisor("23-09-2016");
        factura1.setIDFactura(idFactura);

        FacturaExpedidaType facturaExpedida = new FacturaExpedidaType();

        facturaExpedida.setTipoFactura(ClaveTipoFacturaType.F_1);
        facturaExpedida.setClaveRegimenEspecialOTrascendencia("01");
        facturaExpedida.setImporteTotal("726.90");
        facturaExpedida.setDescripcionOperacion("FACTURACION");

        PersonaFisicaJuridicaType persF = new PersonaFisicaJuridicaType();
        persF.setNombreRazon("A- CLIENTES VARIOS -GENERICO-");
        persF.setNIF("17839512E");
        facturaExpedida.setContraparte(persF);

        FacturaExpedidaType.TipoDesglose tipoDes = new FacturaExpedidaType.TipoDesglose();
        TipoSinDesgloseType desglo = new TipoSinDesgloseType();
        SujetaType sujeta = new SujetaType();
        SujetaType.NoExenta noEx = new SujetaType.NoExenta();
        noEx.setTipoNoExenta(TipoOperacionSujetaNoExentaType.S_1);
        SujetaType.NoExenta.DesgloseIVA desgloseIVA = new SujetaType.NoExenta.DesgloseIVA();
        // Detalles IVAs
        DetalleIVAEmitidaType detalle1 = new DetalleIVAEmitidaType();
        detalle1.setTipoImpositivo("21");
        detalle1.setBaseImponible("600.74");
        detalle1.setCuotaRepercutida("126.16");
        detalle1.setTipoRecargoEquivalencia("");
        detalle1.setCuotaRecargoEquivalencia("");
        desgloseIVA.getDetalleIVA().add(detalle1);

        noEx.setDesgloseIVA(desgloseIVA);
        sujeta.setNoExenta(noEx);
        desglo.setSujeta(sujeta);
        tipoDes.setDesgloseFactura(desglo);
        facturaExpedida.setTipoDesglose(tipoDes);
        factura1.setFacturaExpedida(facturaExpedida);
        facturasEmitidasRequest.getRegistroLRFacturasEmitidas().add(factura1);

        System.setProperty("javax.net.ssl.keyStore","C:\\cert\\giak.pfx");
        System.setProperty("javax.net.ssl.keyStoreType","PKCS12");
        System.setProperty("javax.net.ssl.keyStorePassword","zapata");

        RespuestaLRFEmitidasType response1 = new RespuestaLRFEmitidasType();

        JAXBElement<RespuestaLRFEmitidasType> response = (JAXBElement) getWebServiceTemplate()
                .marshalSendAndReceive("https://www7.aeat.es/wlpl/SSII-FACT/ws/fe/SiiFactFEV1SOAP"/*http://www.webservicex.net/globalweather.asmx"*/,
                        facturasEmitidasRequest,
                        new SoapActionCallback(""));

        // MarshallingUtils.marshal(marshaller, requestPayload, request());

        RespuestaLRFEmitidasType responseBean = response.getValue();






        return response1;
    }
}