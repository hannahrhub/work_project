
public class Main {
    public static void main(String[] args) {
        int a[][] = new int[3][];
        a[1] = new int[]{1, 2, 3};
        a[2] = new int[]{4, 5};
        System.out.println(a[1][1]);
    }
}

//cos looks at whatever is in a[1] (the no of the array then the index) and then what at 1st index