package com.javapro.learn.beans;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Vladimir on 22.10.2017.
 */
@Component
public class MyBean {
    private String name;
    private String[] names;
    private List<String> nameList;
    private Map<String, String> nameMap;
    private Set<String> nameSet;

    public MyBean(String name, String[] names, List<String> nameList, Map<String, String> nameMap, Set<String> nameSet) {
        this.name = name;
        this.names = names;
        this.nameList = nameList;
        this.nameMap = nameMap;
        this.nameSet = nameSet;
    }

    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("names: " + Arrays.deepToString(names));
        System.out.println("nameList: " + nameList);
        System.out.println("nameMap: " + Arrays.toString(nameMap.entrySet().toArray()));
        System.out.println(Arrays.toString(nameSet.toArray()));
    }
}
