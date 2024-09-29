package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
        System.out.println(triangle(7,4,9));
        System.out.println(tribonacci(7));
        System.out.println(distance(0,0,1,1));
    }
    public static boolean triangle(float a, float b, float c){
        return triangle(a,b,c,0);
    }
    public static boolean triangle(float a, float b, float c,int z){
        if(a<=0 || b<=0 || c<=0){
            return false;
        }
        z++;
        if (a+b>c){
            if (3 == z){
                return true;
            }
            return triangle(b,c,a,z);
        }
        else {
            return false;
        }
    }
    public static double distance(float x1, float y1, float x2, float y2){
        return Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
    }
    public static int tribonacci (int n){
        if (n==0){return 0;}
        if (n==1){return 0;}
        if (n==2){return 1;}
        return n= tribonacci(n-1)+ tribonacci(n-2)+ tribonacci(n-3);
    }
}