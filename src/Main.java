//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 1;
        int[] taskOne = new int[]{a, b, c};

        int i;
        int j;
        for(i = 0; i < taskOne.length; ++i) {
            for(j = i + 1; j < taskOne.length; ++j) {
                if (taskOne[i] > taskOne[j]) {
                    int temp = taskOne[i];
                    taskOne[i] = taskOne[j];
                    taskOne[j] = temp;
                }
            }
        }

        i = taskOne[0];
        j = taskOne[1];
        int taskOneMax = taskOne[taskOne.length - 1];
        int diff = taskOneMax - i;
        System.out.println("Difference between min and max is " + diff);
        System.out.println("the smallest number in the array is " + i);
        System.out.println("the second smallest number in the array is " + j);
        float x = 5.0F;
        float y = 5.0F;
        float inside = 4.0F * x / 5.0F;
        float insideY = inside - y;
        float outside = insideY * insideY;
        float firstX = x * x;
        float var10000 = firstX + outside;
        System.out.println("the results of task 3 is " + firstX);
    }
}
