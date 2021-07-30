public class Main {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        var search = new binarySearch();
        var index = search.binarySearchrec(numbers, 1);
        System.out.println(index);
    }
}