package com.company;

/**
 * Created by Piotr Czubkowski on 2017-05-22.
 */
public class Calculator {
    public static void main(String[] args) {
//        IntegerMath adding = (a,b) -> a + b;
        IntegerMath adding = new IntegerMath() {
            @Override
            public int operate(int a, int b) {
                return a +b ;
            }
        };

        IntegerMath subtraction = (a,b) -> a-b;
        IntegerMath multiplication = (a,b) -> a*b;
        IntegerMath division = (a,b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Nie dziel przez zero");
            }
            return a/b;
        };

        System.out.println(operateBinary(5,10,adding));
        System.out.println(operateBinary(20,10,subtraction));
        System.out.println(operateBinary(20,10,multiplication));
        System.out.println(operateBinary(20,0,division));
    }

    public static int operateBinary (int a, int b, IntegerMath math){
        return math.operate(a,b);
    }
}
