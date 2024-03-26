//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //lab 1 task 1 and 2
    //changing variables just to create pull request

    public static void main(String[] args) {

        int a = 7;
        int b = 9;
        int c = 6;

        int[] taskOne = {a, b, c};

        for(int i = 0; i < taskOne.length; i++) {
            for(int j = i + 1; j < taskOne.length; j++) {
                if (taskOne[i] > taskOne[j]) {
                    int temp = taskOne[i];
                    taskOne[i] = taskOne[j];
                    taskOne[j] = temp;
                }
            }
        }

        int taskOneMin = taskOne[0];
        int taskTwo = taskOne[0+1];
        int taskOneMax = taskOne[taskOne.length-1];
        int diff = (taskOneMax - taskOneMin);

            System.out.println("Difference between min and max is " + diff);
            System.out.println("the smallest number in the array is " + taskOneMin);
            System.out.println("the largest number in the array is " + taskOneMax);
            System.out.println("the second smallest number in the array is " + taskTwo);


        //task 3
        float x = 5;
        float y = 9;
        float inside = ( 4*y/5);
        float insideY = (inside - x);
        float outside = (insideY * insideY);
        float firstX = (x*x);
        float result = (firstX + outside);

            System.out.println("the results of task 3 is " + result);
    }
}
