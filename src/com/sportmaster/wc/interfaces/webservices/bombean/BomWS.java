
package com.sportmaster.wc.interfaces.webservices.bombean;

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
@WebService(name = "BomWS", targetNamespace = "http://www.sportmaster.ru/plmbom")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BomWS {


    /**
     * 
     * @param bomRequest
     * @return
     *     returns com.sportmaster.wc.interfaces.webservices.bomBean.BOMRequestResponse
     */
    @WebMethod
    @WebResult(name = "bomRequestResponse", targetNamespace = "http://www.sportmaster.ru/plmbom", partName = "bomRequestResponse")
    public BOMRequestResponse bomRequest(
        @WebParam(name = "bomRequest", targetNamespace = "http://www.sportmaster.ru/plmbom", partName = "bomRequest")
        BOMRequest bomRequest);

}