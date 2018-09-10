package com.bijo.learning.exceptionhandling;

public class Lab547 {
    public static void main(String[] args) {
        System.out.println("Main started");

        try {
            String data=args[0];
            int x=Integer.parseInt(data);
            int res=10/x;
            System.out.println("Result:" +res);
//        } catch (Exception e){

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provide one value as input");
        }catch (NumberFormatException e){
            System.out.println("Provide int value");
        }catch (ArithmeticException e){
            System.out.println("Provide non zero value");
        }

        System.out.println("Main completed");
    }
}
