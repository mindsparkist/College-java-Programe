public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 8, 1, 3, 9, 5,};
        var search = new Search();
        var index = search.linearSearch(numbers, 5);
        System.out.println(index);
    }
}
