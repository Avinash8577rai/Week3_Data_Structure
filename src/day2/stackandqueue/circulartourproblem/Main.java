package day2.stackandqueue.circulartourproblem;

public class Main {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int result = CircularTour.findStartingPoint(petrol, distance);
        System.out.println("Starting Petrol Pump Index: " + result);
    }
    }

