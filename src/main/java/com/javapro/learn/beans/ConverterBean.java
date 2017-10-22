package com.javapro.learn.beans;

import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Set;

/**
 * Created by Vladimir on 22.10.2017.
 */
@Component
public class ConverterBean {

    private Set<String> nameSet;

    public ConverterBean(Map<String, String> map) {
        setNameSet(map.keySet());
    }

    public Set<String> getNameSet() {
        return nameSet;
    }

    public void setNameSet(Set<String> nameSet) {
        this.nameSet = nameSet;
    }
}
