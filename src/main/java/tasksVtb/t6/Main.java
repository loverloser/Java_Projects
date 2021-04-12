package tasksVtb.t6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        firstMethod();
        //secondMethod();

    }

    public static void firstMethod() {
        double[] arr = new double[1_000_000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println((double) (System.currentTimeMillis() - a));
    }

    public static void secondMethod() {
        final int ARRAY_LENGTH = 1_000_000;
        final int HALF = ARRAY_LENGTH / 2;
        float[] arr = new float[ARRAY_LENGTH];
        Arrays.fill(arr, 1.0f);
        long a = System.currentTimeMillis();
        float[] right = new float[HALF];
        float[] left = new float[HALF];
        System.arraycopy(arr, 0, left, 0, HALF);
        System.arraycopy(arr, HALF, right, 0,HALF);

        Thread leftThread = new Thread(() -> {
            for (int i = 0; i < left.length; i++) {
                left[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread rightThread = new Thread(() -> {
            for (int i = 0, j = HALF; i < right.length; i++, j++) {
                right[i] = (float) (arr[i] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
            }
        });


        leftThread.start();
        rightThread.start();

        try{
            leftThread.join();
            rightThread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        System.arraycopy(left, 0, arr, 0, HALF);
        System.arraycopy(right, 0, arr, HALF, HALF);

        System.out.println((double) (System.currentTimeMillis() - a));
    }

}
