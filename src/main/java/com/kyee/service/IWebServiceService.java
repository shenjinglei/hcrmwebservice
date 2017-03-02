package com.kyee.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by zrc on 17/2/27.
 */
@WebService(endpointInterface = "com.kyee.service.IWebServiceService",
        targetNamespace = "http://impl.service.kyee.com/")
public interface IWebServiceService {
    @WebMethod
    String getPatientInfo(String str1,String str2) throws Exception;
}
