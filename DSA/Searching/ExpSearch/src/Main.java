public class Main {
    public static void main(String[] args) {
        int[] numbers = {7, 8, 1, 3, 9, 5,};
        var search = new ExpSearch();
        var index = search.ExpSearchImp(numbers, 5);
        System.out.println(index);
    }
}
