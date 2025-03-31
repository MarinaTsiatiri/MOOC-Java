public class ArrayPrinter {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        for (int num : array){
            if (num!=array[array.length - 1]){
                System.out.print(num + ", ");
            } else {
                System.out.print(num);
            }
        }
    }
}
