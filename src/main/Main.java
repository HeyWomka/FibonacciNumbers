package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int input;

        while (true){
            Functions.showMsg("Exit - 0\nEnter number: ", StringParam.INLINE_ROW);
            Scanner in = new Scanner(System.in);
            input = in.nextInt();

            if(input == 0) {
                Functions.showMsg(StringParam.SECRET_MSG_XD);
                break;
            }

            Functions.initCounter();
            Functions.showMsg("Fib 1 | Result: " + Functions.fib1(input));
            Functions.showMsg("Fib 1 | Counter: " + Functions.getCounter(), StringParam.NEXT_LINE);

            Functions.initCounter();
            Functions.showMsg("Fib 2 | Result: " + Functions.fib2(input));
            Functions.showMsg("Fib 2 | Counter: " + Functions.getCounter(), StringParam.NEXT_LINE);

            Functions.initCounter();
            Functions.showMsg("Fib 3 | Result: " + Functions.fib3(input));
            Functions.showMsg("Fib 3 | Counter: " + Functions.getCounter());

            Functions.showMsg(StringParam.LINE_SEPARATOR);
        }
    }
}
