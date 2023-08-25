package org.example.lambda;

import java.util.Arrays;

interface Drawable{  
    public void draw();  
}

public class LambdaExample {  
    public static void main(String[] args) {  
        int width=10;  
  
        //without lambda
        Drawable d = new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();  

        //with lambda  
        Drawable d2 = () -> System.out.println("Drawing "+width);

        d2.draw();


        // Other example
        int[] numbers = new int[]{11, 22, 33, 44,
                55, 66, 77, 88,
                99, 100};
        System.out.println(Arrays.stream(numbers).reduce((a,b) -> a+b));
    }  
}  