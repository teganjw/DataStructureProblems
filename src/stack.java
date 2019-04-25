import java.util.Random;
import java.util.*;
import java.util.Stack;

public class stack {

    private int[] arr = new int[20];
    private Stack s = new Stack();

    public stack(){
        populateArr();
        sortArr();
        pushStack();
        reverseArr(s);
    }

    public void pushStack() {
        for(int i=0; i<arr.length; i++){
            s.push(arr[i]);
        }
        System.out.println("The stack is: " + s);
    }

    public void populateArr(){
        Random rand = new Random(101);
        for(int i=0; i<arr.length; i++){
            arr[i]= rand.nextInt(51);;
        }
    }

    public void sortArr(){
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[(j + 1)]) {  //Check if sort is needed
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }

    public void reverseArr(Stack sample){
        for(int i=0; i<arr.length; i++){
            arr[i] = (int) sample.pop();
        }
        System.out.print("The reversed stack is: ");
        for(int j=0; j<arr.length; j++){
            System.out.print(arr[j] + ", ");
        }

    }




}
