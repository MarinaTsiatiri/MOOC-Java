public class Printer {

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int num : array){
            while (num!=0){
                System.out.print("*");
                num--;
            }
            System.out.println("");
        }
    }

}
