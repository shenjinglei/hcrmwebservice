package com.kyee.service.impl;

import com.kyee.mapper.VHisDeptInfoMapper;
import com.kyee.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;

/**
 * Created by zrc on 17/2/27.
 */
@Service
public class PersonServiceImpl extends SpringBeanAutowiringSupport implements IPersonService {
    @PostConstruct
    public void init() {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);
    }
    @Autowired
    VHisDeptInfoMapper vHisDeptInfoMapper;

    @Override
    public List<Map<String,Object>> getPatientInfo(){
        return vHisDeptInfoMapper.selectAll();
    }
}
