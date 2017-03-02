package com.kyee.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kyee.mapper.VHisDeptInfoMapper;
import com.kyee.service.IWebServiceService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by zrc on 17/2/27.
 */
public class WebServiceService implements IWebServiceService {
    @Autowired
    VHisDeptInfoMapper vHisDeptInfoMapper;
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String getPatientInfo(String str1,String str2) throws Exception {
        String resultStr = null;
        List<Map<String,Object>> resultList = vHisDeptInfoMapper.selectAll();
        resultStr = objectMapper.writeValueAsString(resultList);
        return resultStr;
    }
}
