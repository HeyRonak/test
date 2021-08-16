package com.test;

public class Main {

    public static void main(String[] args) {

        System.out.println(Add(""));
        System.out.println(Add("15"));
        System.out.println(Add("123,11"));
        System.out.println(Add("123,11,123"));

    }

    /* The method can take up to two numbers, separated by commas, and will return their sum. */
    public static int Add(String number){
        int total = 0;
        String FirstNum = "0";
        String SecondNum = "0";

        if(number.isEmpty()){
            return total;
        } else if(isValid(number)){

            int FirstNumIdx = number.indexOf(",");
            if (FirstNumIdx != -1) {
                 FirstNum = number.substring(0,FirstNumIdx);
                 SecondNum = number.substring(FirstNumIdx+1);
            }else{
                FirstNum = number.substring(0);
            }
        }

        total =  Integer.parseInt(FirstNum) + Integer.parseInt(SecondNum);
        return total;

    }

    static boolean isValid(String number) {

        if( CountCommas(number) > 1 ) {
            return false;
        }
        return true;

    }

    static int CountCommas(String number) {
        int count=0;
        for(char c : number.toCharArray()){
            if(c == ','){
                count++;
            }
        }
        return count;
    }


}
