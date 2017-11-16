package com.cui.web;

import com.cui.fs.api.CollageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.concurrent.CountDownLatch;

/**
 * Created by cjs
 * Date： 2017/7/12.
 * Time： 11:30.
 */
@SpringBootApplication
@ServletComponentScan
@ImportResource(locations = "classpath:spring/spring-config.xml")
public class Application extends SpringBootServletInitializer {

    //发布服务hessian
   @Autowired
   private CollageService collageService;

    @Bean(name = "/service/collageService")
    public HessianServiceExporter accountService() {
        HessianServiceExporter exporter = new HessianServiceExporter();
        exporter.setService(collageService);
        exporter.setServiceInterface(CollageService.class);
        return exporter;
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }


}