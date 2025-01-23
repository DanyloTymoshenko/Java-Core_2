import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter array size");

        int size = scanner.nextInt();

        int[] array = new int[size];

        //change1


        System.out.println("Please enter numbers");

        for(int i=0; i<size; i++){ array[i] = scanner.nextInt(); }
        boolean sorted = true;

        //changed

        for(int i=1; i<size; i++){
                if(array[i] < array[i - 1]){
                    sorted = false;
                    break;
                }
            }
        System.out.println(sorted);

    }
}