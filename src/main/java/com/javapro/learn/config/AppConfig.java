package com.javapro.learn.config;

import com.javapro.learn.beans.ConverterBean;
import com.javapro.learn.beans.MyBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Vladimir on 22.10.2017.
 */
@Configuration
@PropertySource("classpath:auditorium.properties")
public class AppConfig {

    @Value("${name}")
    private String name;

    @Value("${names}")
    private String[] names;

    @Value("#{'${nameList}'.split(',')}")
    private List<String> nameList;

    @Value("#{${nameMap}}")
    private Map<String, String> nameMap;

    @Value("#{converterBean.nameSet}")
    private Set<String> nameSet;


    @Bean
    public MyBean myBean() {
        return new MyBean(name, names, nameList, nameMap, nameSet);
    }


    @Bean
    public ConverterBean converterBean() {
        return new ConverterBean(nameMap);
    }
}
