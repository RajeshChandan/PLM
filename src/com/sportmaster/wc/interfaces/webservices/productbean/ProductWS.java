
package com.sportmaster.wc.interfaces.webservices.productbean;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ProductWS", targetNamespace = "http://www.sportmaster.ru/plmproduct")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ProductWS {


    /**
     * 
     * @param colorwaySeasonLinkInformationUpdatesRequest
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.productbean.ColorwaySeasonLinkInformationUpdatesRequestResponse
     */
    @WebMethod
    @WebResult(name = "colorwaySeasonLinkInformationUpdatesRequestResponse", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "colorwaySeasonLinkInformationUpdatesRequestResponse")
    public ColorwaySeasonLinkInformationUpdatesRequestResponse colorwaySeasonLinkInformationUpdatesRequest(
        @WebParam(name = "colorwaySeasonLinkInformationUpdatesRequest", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "colorwaySeasonLinkInformationUpdatesRequest")
        ColorwaySeasonLinkInformationUpdatesRequest colorwaySeasonLinkInformationUpdatesRequest);

    /**
     * 
     * @param colorwayInformationUpdatesRequest
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.productbean.ColorwayInformationUpdatesRequestResponse
     */
    @WebMethod
    @WebResult(name = "colorwayInformationUpdatesRequestResponse", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "colorwayInformationUpdatesRequestResponse")
    public ColorwayInformationUpdatesRequestResponse colorwayInformationUpdatesRequest(
        @WebParam(name = "colorwayInformationUpdatesRequest", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "colorwayInformationUpdatesRequest")
        ColorwayInformationUpdatesRequest colorwayInformationUpdatesRequest);

    /**
     * 
     * @param getStatusProductRequest
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.productbean.GetStatusProductRequestResponse
     */
    @WebMethod
    @WebResult(name = "getStatusProductRequestResponse", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "getStatusProductRequestResponse")
    public GetStatusProductRequestResponse getStatusProductRequest(
        @WebParam(name = "getStatusProductRequest", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "getStatusProductRequest")
        GetStatusProductRequest getStatusProductRequest);

    /**
     * 
     * @param getPricesUpdates
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.productbean.GetPricesUpdatesResponse
     */
    @WebMethod
    @WebResult(name = "getPricesUpdatesResponse", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "getPricesUpdatesResponse")
    public GetPricesUpdatesResponse getPricesUpdates(
        @WebParam(name = "getPricesUpdates", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "getPricesUpdates")
        GetPricesUpdatesRequest getPricesUpdates);

    /**
     * 
     * @param productInformationUpdatesRequest
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.productbean.ProductInformationUpdatesRequestResponse
     */
    @WebMethod
    @WebResult(name = "productInformationUpdatesRequestResponse", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "productInformationUpdatesRequestResponse")
    public ProductInformationUpdatesRequestResponse productInformationUpdatesRequest(
        @WebParam(name = "productInformationUpdatesRequest", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "productInformationUpdatesRequest")
        ProductInformationUpdatesRequest productInformationUpdatesRequest);

    /**
     * 
     * @param productSeasonLinkInformationUpdatesRequest
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.productbean.ProductSeasonLinkInformationUpdatesRequestResponse
     */
    @WebMethod
    @WebResult(name = "productSeasonLinkInformationUpdatesRequestResponse", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "productSeasonLinkInformationUpdatesRequestResponse")
    public ProductSeasonLinkInformationUpdatesRequestResponse productSeasonLinkInformationUpdatesRequest(
        @WebParam(name = "productSeasonLinkInformationUpdatesRequest", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "productSeasonLinkInformationUpdatesRequest")
        ProductSeasonLinkInformationUpdatesRequest productSeasonLinkInformationUpdatesRequest);

    /**
     * 
     * @param getStatusPrices
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.productbean.GetStatusPricesResponse
     */
    @WebMethod
    @WebResult(name = "getStatusPricesResponse", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "getStatusPricesResponse")
    public GetStatusPricesResponse getStatusPrices(
        @WebParam(name = "getStatusPrices", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "getStatusPrices")
        GetStatusPricesRequest getStatusPrices);

    /**
     * 
     * @param getProductUpdatesRequest
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.productbean.GetProductUpdatesRequestResponse
     */
    @WebMethod
    @WebResult(name = "getProductUpdatesRequestResponse", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "getProductUpdatesRequestResponse")
    public GetProductUpdatesRequestResponse getProductUpdatesRequest(
        @WebParam(name = "getProductUpdatesRequest", targetNamespace = "http://www.sportmaster.ru/plmproduct", partName = "getProductUpdatesRequest")
        GetProductUpdatesRequest getProductUpdatesRequest);

}