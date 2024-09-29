package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");
        Scanner in= new Scanner(System.in);
        System.out.println("Task 1");
        System.out.print("a=");
        float a= in.nextFloat();
        System.out.print("b=");
        float b= in.nextFloat();
        System.out.print("c=");
        float c= in.nextFloat();
        //System.out.println(triangle(7,4,9));
        System.out.println(triangle(a,b,c));
        System.out.println("Task 2");
        System.out.print("x1=");
        float x1= in.nextFloat();
        System.out.print("y1=");
        float y1= in.nextFloat();
        System.out.print("x2=");
        float x2= in.nextFloat();
        System.out.print("y2=");
        float y2= in.nextFloat();
        //System.out.println(distance(0,0,1,1));
        System.out.println(distance(x1,y1,x2,y2));
        System.out.println("Task 3");
        System.out.print("a=");
        a= in.nextFloat();
        System.out.print("n=");
        int n= in.nextInt();
        //System.out.println(powerLoop(2,-4));
        System.out.println(powerLoop(a,n));
        System.out.println("Task 4");
        System.out.print("a=");
        a= in.nextFloat();
        System.out.print("n=");
        n= in.nextInt();
        //System.out.println(power(2,4));
        System.out.println(power(a,n));
        System.out.println("Task 5");
        System.out.print("n=");
        n= in.nextInt();
        //System.out.println(tribonacci(7));
        System.out.println(tribonacci(n));
    }
//    public static boolean triangle(float a, float b, float c){
//        return triangle(a,b,c,0);
//    }
//    public static boolean triangle(float a, float b, float c,int z){
//        if(a<=0 || b<=0 || c<=0){
//            return false;
//        }
//        z++;
//        if (a+b>c){
//            if (3 == z){
//                return true;
//            }
//            return triangle(b,c,a,z);
//        }
//        else {
//            return false;
//        }
//    }
    public static boolean triangle(float a, float b, float c){
        if(a<=0 || b<=0 || c<=0){return false;}
        return a + b > c && a + c > b && b + c > a;
    }
    public static double distance(float x1, float y1, float x2, float y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }
    public static float powerLoop(float a,int n){
        if(n==1) return a;
        if(n==0) return 1F;
        if(n<0) return 1/powerLoop(a,n*-1);
        return a*powerLoop(a,n-1);
    }
    public static Float power(float a,int n){
        if(n==1) return a;
        if(n==0) return 1F;
        if(n<0) return null;
        return a*power(a,n-1);
    }
    public static Integer tribonacci (int n){
        if (n==0){return 0;}
        if (n==1){return 0;}
        if (n==2){return 1;}
        if (n<0){return null;}
        return tribonacci(n-1)+ tribonacci(n-2)+ tribonacci(n-3);
    }
}