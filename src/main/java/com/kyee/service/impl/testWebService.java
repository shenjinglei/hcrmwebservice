package com.kyee.service.impl;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * Created by zrc on 17/2/27.
 */
@WebService
public class testWebService {
    public String getValue(String name){
        return "我叫" + name;

    }

//    public static void main(String[] args) {
//        Endpoint.publish("http://localhost:8001/Service/ServiceHello",new testWebService());
//    }
}
