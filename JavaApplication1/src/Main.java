/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import org.l2program.Acceleratable;
import org.l2program.Bank;
import org.l2program.BankAccount;
import org.l2program.Car;
import org.l2program.Toyota;

/**
 *
 * @author sander
 */
public class Main {

    int data;

    public int square(int x) {
        return x * x;
    }

    public void testPrint() {
        System.out.println(5 * 5);
    }

    public int fibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be > 0");
        }
        switch (n) {
            case 1:
            case 2:
                return 1;
            default:
                return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void driveAcceleratable(Acceleratable a) {
        a.accelerate();
    }

    public static double newtonSqrt(double n) {
        return newtonSqrt(n, 0.01);
    }

    public static double newtonSqrt(double n, double errorThreshold) {
        return newtonSqrt(n, n/2 , errorThreshold);
    }

    public static double newtonSqrt(double n, double approx, double errorThreshold) {
        double currentApprox;
        double newApprox = approx;
        int count = 0;
        do {
            currentApprox = newApprox;
            count = count + 1;
            newApprox = currentApprox - (currentApprox * currentApprox - n) / (2 * currentApprox);
            System.out.println("Iteration " + count + ":" + newApprox);
        } while (Math.abs(newApprox - currentApprox) >= errorThreshold);
        System.out.println("Math.sqrt(" + n + ")=" + Math.sqrt(n));
        return newApprox;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        newtonSqrt(100, 0.0001);
        //System.out.println(newtonSqrt(18.0, 10.0, 0.01));
//        BufferedReader myIn = new BufferedReader(new InputStreamReader(System.in));
//        String input = myIn.readLine();
//        int max=Integer.parseInt(input);
//        for (int i = 1; i <= max; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                System.out.println("FIZZBUZZ");
//            } else if (i % 3 == 0) {
//                System.out.println("FIZZ");
//            } else if (i % 5 == 0) {
//                System.out.println("BUZZ");
//            } else {
//                System.out.println(i);
//            }
//        }
//        Main main = new Main();
//        main.testPrint();
//        main.data = 5;
//        
//        
//        
//        try {
//            System.out.println(main.fibonacci(-1));
//        } finally {
//            System.out.println("Program complete!");
//        }
//        int n = 5;
//        Car vehicle = new Toyota();
//        Car vehicle2 = new Toyota();
//        Car vehicle3 = vehicle;
//        if(vehicle == vehicle3) {
//            
//        }
//        
//        vehicle.setNWheels(5);
//        vehicle.getNWheels();
//        if(Toyota.HAS_POWER_STEERING) {
//            System.out.println("It does.");
//        }
//        driveAcceleratable((Acceleratable) vehicle);
        Bank b = new Bank();
        long acct1ID = b.registerAccount(new BankAccount(1000));
        long acct2ID = b.registerAccount(new BankAccount(500));

        System.out.println(b.queryAccount(acct1ID).getBalance());
        b.queryAccount(acct1ID).deposit(100);
        System.out.println(b.queryAccount(acct1ID).getBalance());
        b.transferBetween(acct1ID, acct2ID, 300);
        b.queryAccount(acct1ID).printLog();
    }

}
