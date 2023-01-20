package com.driver;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();
        p.product(3, 5);
       p.product(2, 4, 6);

        p.product(12.3, 11.5);
    }


   public static class Product {
        public int product(int x, int y) {
       return x*y;
        }

        public int product(int x, int y, int z) {
             return x*y*z;
        }

        public double product(double x, double y) {
              return x*y;
        }
    }
}