
package com.sportmaster.wc.interfaces.webservices.productbean;

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
@WebServiceClient(name = "ProductEndpointService", targetNamespace = "http://www.sportmaster.ru/plmproduct", wsdlLocation = "file:/C:/Users/Admin/Desktop/WSDL/product/PlmProduct.wsdl")
public class ProductEndpointService
    extends Service
{

    private final static URL PRODUCTENDPOINTSERVICE_WSDL_LOCATION;
    private final static WebServiceException PRODUCTENDPOINTSERVICE_EXCEPTION;
    private final static QName PRODUCTENDPOINTSERVICE_QNAME = new QName("http://www.sportmaster.ru/plmproduct", "ProductEndpointService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL(LCSProperties.get("com.sportmaster.wc.interfaces.webservices.outbound.productIntegration.productoutboundWSDLLocation"));
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        PRODUCTENDPOINTSERVICE_WSDL_LOCATION = url;
        PRODUCTENDPOINTSERVICE_EXCEPTION = e;
    }

    public ProductEndpointService() {
        super(__getWsdlLocation(), PRODUCTENDPOINTSERVICE_QNAME);
    }

    public ProductEndpointService(WebServiceFeature... features) {
        super(__getWsdlLocation(), PRODUCTENDPOINTSERVICE_QNAME, features);
    }

    public ProductEndpointService(URL wsdlLocation) {
        super(wsdlLocation, PRODUCTENDPOINTSERVICE_QNAME);
    }

    public ProductEndpointService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, PRODUCTENDPOINTSERVICE_QNAME, features);
    }

    public ProductEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ProductEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ProductWS
     */
    @WebEndpoint(name = "ProductEndpointPort")
    public ProductWS getProductEndpointPort() {
        return super.getPort(new QName("http://www.sportmaster.ru/plmproduct", "ProductEndpointPort"), ProductWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ProductWS
     */
    @WebEndpoint(name = "ProductEndpointPort")
    public ProductWS getProductEndpointPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.sportmaster.ru/plmproduct", "ProductEndpointPort"), ProductWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (PRODUCTENDPOINTSERVICE_EXCEPTION!= null) {
            throw PRODUCTENDPOINTSERVICE_EXCEPTION;
        }
        return PRODUCTENDPOINTSERVICE_WSDL_LOCATION;
    }

}