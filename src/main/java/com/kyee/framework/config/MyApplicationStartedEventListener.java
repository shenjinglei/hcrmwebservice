package com.kyee.framework.config;

import com.kyee.service.impl.WebServiceService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

import javax.xml.ws.Endpoint;

/**
 * Created by zrc on 17/2/22.
 */
@Slf4j
public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {

    //解决监听被多次调用问题
    private static boolean isStart = false;
    @Override
    public void onApplicationEvent(ApplicationStartedEvent event){
        if(!isStart){
            isStart=true;
            Endpoint.publish("http://localhost:8002/hcrmwebservice",new WebServiceService());
            log.debug("启动成功");
        }
    }

}
