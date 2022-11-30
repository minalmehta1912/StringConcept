package org.example;

public class Main
{
    public static void main(String[] args)
    {
        String s1="minal";//new obj created in scp
        String s2="minal";//reference created for s2
        String s3="mehta";//new object created
        System.out.println(s1==s2);//check reference --return true
        System.out.println(s1.equals(s3));//check content --return false
        System.out.println(s1.equals(s2));//check content --return true

        String str1=new String("Amit");//new obj created in heap and also new obj created in scp if not
        String str2=new String("Amit");//new obj created


        System.out.println(str1==str2);//str1 and str2 new object created in heap--return false

        System.out.println(str1.equals(str2));//str1 n str2 check content--return true
        System.out.println("s1 hascode="+s1.hashCode());//before update hascode 103900669
        s1=s1+"mehta";//new object created in scp
        System.out.println("s1=s1+mehta hascode="+s1.hashCode());//after update hascode=1070551136 changed new obj created

        //String constructors
        String es=new String();//empty string constructor
        String str3=new String("Dhyaan");//string literal constructor

        StringBuffer sb=new StringBuffer("ex-string-buffer");
        StringBuilder strb=new StringBuilder("ex-string-builder");
        byte[] b={96,97,98,99,100};
        char[] ch={'j','a','v','a'};

        String str4=new String(sb);//String buffer to string
        String str5=new String(strb);//String builder to string
        String str6=new String(b);//byte to string
        String str7=new String(ch);//char to string

        System.out.println("str4="+str4);//ex-string-buffer
        System.out.println("str5="+str5);//ex-string-builder
        System.out.println("str6="+str6);//abcd
        System.out.println("str7="+str7);//java

//String Methods
        String s=new String("Hello,my name is minal");
        System.out.println("s="+s);
        System.out.println("length="+s.length());//length=22
        System.out.println("substring start 4="+s.substring(4));//o,my name is minal
        System.out.println("substring start 4 end 10="+s.substring(4,10));// o,my n  --end is n-1
        System.out.println(s.toLowerCase());//lower case
        System.out.println(s.toUpperCase());//upper case
        System.out.println(s.charAt(6));//return m
        System.out.println(s.indexOf('l'));//return l first occurence --2
        System.out.println(s.replace('m','j'));//replace m with j
        System.out.println(s.lastIndexOf('m'));//index 17
        System.out.println("is empty="+s.isEmpty());//false
        System.out.println(s.concat(" mehta"));//Hello,my name is minal mehta

        String str=new String("MinalMehta");
        String strn=new String("minalmehta");
        System.out.println(str.equalsIgnoreCase(strn));//true
        System.out.println("start with="+str.startsWith("Minal"));//true
        System.out.println("end with="+str.endsWith(strn));//false



        s="   minal  ";
        System.out.println(s.trim());//remove blank space from right n left

    }
}