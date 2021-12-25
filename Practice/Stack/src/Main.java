import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = new String("Love You");
//        reverse the string ?
//        take the original string
//        convert it into char array
//        create a char array of size == str.length
        char[] charr = new char[str.length()];
//        copy the elements of string to the ch array
        for (int i = 0; i < str.length(); i++) {
            charr[i] = str.charAt(i);
        }
//        put the charray  into stack
//        loop over the array elemrnts anf push one by one
        for (char c : charr) {
          stack.push(c);
        }
//        pop elements until the stack is empty
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
