package com.banco.javier.BancoJavier.service;

import com.banco.javier.BancoJavier.dto.TipoCambioRequest;
import com.banco.javier.BancoJavier.dto.TipoCambioResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

@Service
public class SOAPClientService extends WebServiceGatewaySupport {

    @Value("${soap.endpoint}")
    private String soapEndpoint;

    /**
     * Método para obtener el tipo de cambio.
     *
     * @param fecha La fecha del tipo de cambio.
     * @param moneda El código de la moneda.
     * @return La respuesta con el tipo de cambio.
     */
    public TipoCambioResponse obtenerTipoCambio(String fecha, int moneda) {
        TipoCambioRequest request = new TipoCambioRequest();
        request.setFecha(fecha);
        request.setMoneda(moneda);

        return (TipoCambioResponse) getWebServiceTemplate()
            .marshalSendAndReceive(soapEndpoint, request, 
                new SoapActionCallback("http://www.banguat.gob.gt/variables/ws/TipoCambioFechaInicialMoneda"));
    }
}
