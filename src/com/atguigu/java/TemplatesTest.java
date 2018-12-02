package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author unnatural
 * @date 2018/12/1 - 21:50
 */
public class TemplatesTest {

    //模板六;prsf:可以生成private static final
    private static final Customer cust = new Customer();

    //变形:psf
    public static final int NUM = 1;
    //变形psfi
    public static final int NUM2 = 2;
    //变形：psfs
    public static final String NATION = "china";


    //模板1：psvm
    public static void main(String[] args){

        //模板二:sout
        System.out.println("hello!");

        //变形:soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        
        int num1 = 10;
        int num2 = 20;
        System.out.println("num2 = " + num2);


        //模版三:fori
        String[] arr = new String[]{"Tom", "Jerry", "Handmeimei", "lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        
        //变形;itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
            
        }

        //模板四:list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        for (Object o : list) {
            
        }
        
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        
        //变形:list.forr
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        
    }
    
    public void method(){
        System.out.println("TemplateTest.method");
        
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add(567);

        //模板五;ifn
        if (list == null) {
            
        }

        //变形;inn
        if (list != null) {
            
        }

        //变形;xxx.nn // xxx.null
        if (list != null) {

        }

        if (list == null) {

        }


    }
}
