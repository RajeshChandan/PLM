
package com.sportmaster.wc.interfaces.webservices.bean;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

import com.lcs.wc.util.LCSProperties;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "PlmEndpointService", targetNamespace = "http://www.sportmaster.ru/plmservice", wsdlLocation = "file:/appl/ptc/Windchill_11.0/Build/WSDL/material/PlmPort.wsdl")
public class PlmEndpointService
    extends Service
{

    private final static URL PLMENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PLMENDPOINTSERVICE_EXCEPTION;
    private final static QName PLMENDPOINTSERVICE_QNAME = new QName("http://www.sportmaster.ru/plmservice", "PlmEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL(LCSProperties.get("com.sportmaster.wc.interfaces.webservices.wsdllocation"));
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PLMENDPOINTSERVICE_WSDL_LOCATION = url;
        PLMENDPOINTSERVICE_EXCEPTION = e;
    }

    public PlmEndpointService() {
        super(__getWsdlLocation(), PLMENDPOINTSERVICE_QNAME);
    }

    public PlmEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PLMENDPOINTSERVICE_QNAME, features);
    }

    public PlmEndpointService(URL wsdlLocation) {
        super(wsdlLocation, PLMENDPOINTSERVICE_QNAME);
    }

    public PlmEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PLMENDPOINTSERVICE_QNAME, features);
    }

    public PlmEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public PlmEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns PlmWS
     */
    @WebEndpoint(name = "PlmEndpointPort")
    public PlmWS getPlmEndpointPort() {
        return super.getPort(new QName("http://www.sportmaster.ru/plmservice", "PlmEndpointPort"), PlmWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PlmWS
     */
    @WebEndpoint(name = "PlmEndpointPort")
    public PlmWS getPlmEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.sportmaster.ru/plmservice", "PlmEndpointPort"), PlmWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PLMENDPOINTSERVICE_EXCEPTION!= null) {
            throw PLMENDPOINTSERVICE_EXCEPTION;
        }
        return PLMENDPOINTSERVICE_WSDL_LOCATION;
    }

}