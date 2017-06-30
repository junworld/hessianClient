package com.hessian.client;

import com.hessian.api.BasicAPI;
import com.hessian.api.HessianInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.MalformedURLException;

/**
 * Created by zhaojun5 on 2017/6/28.
 */
public class Client {

    public static void main(String[] args) throws MalformedURLException {
//        String url = "http://hessian.caucho.com/test/test";
        //String url = "http://localhost:8080/hello";
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        HessianInterface hessianService = (HessianInterface)context.getBean("hessianService");
        hessianService.hello();
        BasicAPI basicAPI = (BasicAPI)context.getBean("baseService");
        basicAPI.hello();
        /*String url = "http://localhost:8080/api/service/hessianInterface";
        HessianProxyFactory factory = new HessianProxyFactory();
        BasicAPI basic = (BasicAPI) factory.create(BasicAPI.class, url);
        System.out.println("hello(): " + basic.hello());*/

    }

}
