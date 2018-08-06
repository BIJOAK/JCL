package com.bijo.learning.booleanequals;

public class Lab451 {
    public static void main(String[] args) {
        Student451 st1=new Student451(99,"Bijo");
        Student451 st2=new Student451(99,"Bijo");
        Student451 st3=new Student451(88,"Anu");
        Student451 st4=st1;
        System.out.println("using==op");
        System.out.println(st1==st2);
        System.out.println(st1==st3);
        System.out.println(st1==st4);
        System.out.println(st2==st3);

        System.out.println("using equals()");
        System.out.println(st1.equals(st2));
        System.out.println(st1.equals(st3));
        System.out.println(st1.equals(st4));
        System.out.println(st2.equals(st3));
    }
}
class Student451{
    int sid;
    String sname;
    Student451(int sid,String sname){
        this.sid=sid;
        this.sname=sname;
    }
    public boolean equals(Object obj){
        if(obj instanceof Student451){
            Student451 st=(Student451) obj;
            return this.sid==st.sid&&this.sname.equals(st.sname);
        }
        return false;
    }
}
