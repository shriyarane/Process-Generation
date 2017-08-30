package com.shriyarane;

public class Main {

    public static void main(String[] args) {
        // write your code here

        System.out.println("PID \t\t Cycles \t\t A.Time \t\t\t\t Bursts");
        int PID = 10;
        int arrivalTime = 0;
        int cycles;
        int totalBursts;

        for(int i = 1; i <= PID; i++){
            cycles = (int)(Math.random() * 10) + 1; //Generates cycles
            totalBursts = (cycles * 2) + 1;
            int bursts[] = new int[totalBursts]; //creates arrays of all bursts
            int CPUBursts[] = new int[cycles];
            int IOBursts[] = new int[(cycles + 1)];

            if(i == 1){
                arrivalTime = 0;
            }
            else {
                arrivalTime += (int)(Math.random() * 5) + 1;
            }

            System.out.print(i + "\t\t\t  " + cycles + " \t\t\t\t" + arrivalTime + "\t\t\t");

            for(int j = 0; j < totalBursts; j++){        //controls the bursts
                bursts[j] = (int)(Math.random() * 10) + 1; //assigns burst durations

                if(j % 2 == 0){ //for the IO burst array
                    int k = 0;
                    IOBursts[k] = bursts[j]; //places burst times in the array
                    k++; //increments array counter

                    if(j == 0){   //sets I = burst time
                        if(bursts[j] < 10){
                            System.out.print("I: " + bursts[j] + "   ");
                        }
                        else {
                            System.out.print("I: " + bursts[j] + "  ");
                        }
                    }
                    else if( j == (totalBursts - 1)){ //sets O = burst time
                        if(bursts[j] < 10){
                            System.out.print("O: " + bursts[j] + "   ");
                        }
                        else {
                            System.out.print("O: " + bursts[j] + "  ");
                        }
                    }
                    else {   //sets I/O = burst time
                        if(bursts[j] < 10){
                            System.out.print("I/O: " + bursts[j] + "   ");
                        }
                        else {
                            System.out.print("I/O: " + bursts[j] + "  ");
                        }
                    }
                }

                else { //for CPU burst array
                    int l = 0;
                    CPUBursts[l] = bursts[j]; //places burst times in the array
                    l++; //increments array counter

                    if(bursts[j] < 10){
                        System.out.print("C: " + bursts[j] + "   ");
                    }
                    else {
                        System.out.print("C: " + bursts[j] + "  ");
                    }
                }
            }
            System.out.print("\n");
        }

    }
}

