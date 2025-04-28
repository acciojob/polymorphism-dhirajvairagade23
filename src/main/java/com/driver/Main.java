package com.driver;

public class Main {
    public static class Product{

        public int Product(int x,int y){
            return x*y;
        }
        public int Product(int x,int y, int z){
            return x*y*z;
        }
        public double Product(double x,double y){
            return x*y;
        }
    }


    public static void main(String args[]){

        Product p=new Product();
        int ans1 = p.Product(3,4);
        int ans2 = p.Product(4,6,2);
        double ans3 = p.Product(2,3);

        System.out.println(ans1+" "+ans2+" "+ans3);

    }
}