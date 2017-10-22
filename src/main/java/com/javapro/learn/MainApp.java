package com.javapro.learn;

import com.javapro.learn.beans.MyBean;
import com.javapro.learn.config.AppConfig;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Vladimir on 22.10.2017.
 */
public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        MyBean myBean = ctx.getBean(MyBean.class);
        myBean.getInfo();


    }
}
