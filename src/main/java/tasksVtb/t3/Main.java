package tasksVtb.t3;

public class Main {
    public static void main(String[] args) {

    }

    public void myArray(String[][] arr) throws MyArraySizeException{
        if(arr.length != 4){
            throw new MyArraySizeException("Неверный размер массива");
        }

        for (int i = 0; i < arr.length; i++) {

        }
    }

}
