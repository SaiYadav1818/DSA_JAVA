package mypackage;

import Myinterace.interfaceObj;

public class PacInterfaceObj implements interfaceObj {
 

public void printInterface()
{
    System.out.println("how many ways we can create obj for interface");
} 
    public static void main(String[] args) {
        /*interfaceObj obj = new PacInterfaceObj();
        obj.printInterface();*/
    /* interfaceObj obj =new interfaceObj() //error*/
    PacInterfaceObj obj1=new PacInterfaceObj();
    obj1.printInterface();
  /*   interfaceObj obj2;//it is ok creating reference varible
    interfaceObj arr[]=new interfaceObj[2];//arraay of objects for an interface is permmited*/
}}
/*
javac Myinterface\interfaceObj.java
javac mypackage\PacInterfaceObj.java
java mypackage.PacInterfaceObj
 */