public class MainMinMaxStack {
    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();
        stack.push(8);
        stack.push(9);
        stack.push(10);
        stack.push(0);
        stack.pop();
        stack.push(1);

        System.out.println("Максимальное число: " + stack.max());
        System.out.println("Минимальное число: " + stack.min());
    }
}
