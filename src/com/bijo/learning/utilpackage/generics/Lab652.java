package com.bijo.learning.utilpackage.generics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Lab652 {
    public static void main(String[] args) {
        ArrayList<String> emails= new ArrayList<>();
        emails.add("a@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        ArrayList<Long> phones=new ArrayList<>();
        phones.add(12345L);
        phones.add(45678L);
        phones.add(67890L);

        LinkedHashMap<String,Long> refs=new LinkedHashMap<>();
        refs.put("A",11111L);
        refs.put("B",22222L);
        refs.put("C",33333L);

        Student652 st=new Student652(99,"Bijo",emails,phones,refs);
        ArrayList<Student652> stList=new ArrayList<>();
        stList.add(st);
        stList.add(st);
        stList.add(st);
        stList.add(st);
        System.out.println(stList);
        System.out.println(st);

    }
}

class Student652{
    int sid;
    String name;
    List<String> emails;
    List<Long> phones;
    Map<String,Long> refs;

    public Student652(int sid,String name,List<String> emails,List<Long> phones,Map<String,Long> refs){
        this.sid=sid;
        this.name=name;
        this.emails=emails;
        this.phones=phones;
        this.refs=refs;
    }

    public String toString(){
        return "\n"+sid+"\t"+name+"\t"+emails+"\t"+phones+"\t"+refs;
    }
}