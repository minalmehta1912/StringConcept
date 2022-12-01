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

        //String Buffer
        //String Buffer Constructor
        StringBuffer sb1=new StringBuffer();//It creates an empty String buffer with the initial capacity of 16.
        System.out.println(sb1.capacity());//16

        StringBuffer sb2=new StringBuffer(1000);//it creates an empty String buffer with the specified capacity as length.
        System.out.println(sb2.capacity());//1000

        StringBuffer sb3=new StringBuffer("Mishti");// It creates a String buffer with the specified string..
        System.out.println(sb3.capacity());//String_length+16=22
        System.out.println(sb3.length());//6

        System.out.println(sb3.append("Mehta"));//MishtiMehta
        System.out.println(sb3.append(24));//MishtiMehta24
        System.out.println(sb3.append(5.5));//MishtiMehta245.5
        System.out.println(sb3.append('G'));//MishtiMehta245.5G

        System.out.println(sb3.charAt(0));//M
        sb3.setCharAt(0,'G');//GishtiMehta245.5G
        System.out.println(sb3);

        System.out.println(sb3.insert(0,"Kumari "));//String---Kumari GishtiMehta245.5G
        System.out.println(sb3.insert(6,2019));//int-----Kumari2019 GishtiMehta245.5G
        System.out.println(sb3.insert(0,true));//boolean------trueKumari2019 GishtiMehta245.5G
        System.out.println(sb3.insert(0,2.2));//float----------2.2Kumari2019 GishtiMehta245.5G
        System.out.println(sb3.insert(0,'X'));//char----------X2.2Kumari2019 GishtiMehta245.5G

        System.out.println(sb3.delete(2,5));//X2rueKumari2019 GishtiMehta245.5G
        System.out.println(sb3.deleteCharAt(1));//XrueKumari2019 GishtiMehta245.5G

        System.out.println(sb3.reverse());//G5.542atheMithsiG 9102iramuKeurX

        sb2.append("Programming");
        System.out.println(sb2.capacity());//1000
        sb2.trimToSize();
        System.out.println(sb2.capacity());//11

        sb2.setLength(7);
        System.out.println(sb2);//program

        System.out.println(sb2.capacity());//11
        System.out.println(sb2.length());//7


        sb2.ensureCapacity(20);
        System.out.println(sb2.capacity());//24



        //String Builder
        //String Builder Constructor
        StringBuilder sbr1=new StringBuilder();//It creates an empty String buffer with the initial capacity of 16.
        System.out.println(sbr1.capacity());//16

        StringBuilder sbr2=new StringBuilder(1000);//it creates an empty String buffer with the specified capacity as length.
        System.out.println(sbr2.capacity());//1000

        StringBuilder sbr3=new StringBuilder("Mishti");// It creates a String buffer with the specified string..
        System.out.println(sbr3.capacity());//String_length+16=22
        System.out.println(sbr3.length());//6

        System.out.println(sbr3.append("Mehta"));//MishtiMehta
        System.out.println(sbr3.append(24));//MishtiMehta24
        System.out.println(sbr3.append(5.5));//MishtiMehta245.5
        System.out.println(sbr3.append('G'));//MishtiMehta245.5G

        System.out.println(sbr3.charAt(0));//M
        sbr3.setCharAt(0,'G');//GishtiMehta245.5G
        System.out.println(sb3);

        System.out.println(sbr3.insert(0,"Kumari "));//String---Kumari GishtiMehta245.5G
        System.out.println(sbr3.insert(6,2019));//int-----Kumari2019 GishtiMehta245.5G
        System.out.println(sbr3.insert(0,true));//boolean------trueKumari2019 GishtiMehta245.5G
        System.out.println(sbr3.insert(0,2.2));//float----------2.2Kumari2019 GishtiMehta245.5G
        System.out.println(sbr3.insert(0,'X'));//char----------X2.2Kumari2019 GishtiMehta245.5G

        System.out.println(sbr3.delete(2,5));//X2rueKumari2019 GishtiMehta245.5G
        System.out.println(sbr3.deleteCharAt(1));//XrueKumari2019 GishtiMehta245.5G

        System.out.println(sbr3.reverse());//G5.542atheMithsiG 9102iramuKeurX

        sbr2.append("Programming");
        System.out.println(sbr2.capacity());//1000
        sbr2.trimToSize();
        System.out.println(sbr2.capacity());//11

        sbr2.setLength(7);
        System.out.println(sbr2);//program

        System.out.println(sbr2.capacity());//11
        System.out.println(sbr2.length());//7


        sbr2.ensureCapacity(20);
        System.out.println(sbr2.capacity());//24
































//        StringBuilder s_b=new StringBuilder();
//        System.out.println(s_b.capacity());//16
//        System.out.println(s_b.capacity());//16









    }
}