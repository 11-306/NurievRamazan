import java.util.Deque;
import java.util.LinkedList;

public class MinMaxStack {
    private final Deque<Integer> data;
    private final Deque<Integer> min;
    private final Deque<Integer> max;

    public MinMaxStack() {
        data = new LinkedList<>();
        min = new LinkedList<>();
        max = new LinkedList<>();
    }

    int min(){
        return min.peek();
    }

    int max(){
        return max.peek();
    }

    void push(int x){
        data.push(x);
        if (min.isEmpty() || min.peek() > x){
            min.push(x);
        }
        if (max.isEmpty() || max.peek() < x){
            max.push(x);
        }
    }

    void pop(){
        if (!data.isEmpty()){
            int temp = data.pop();
            if (temp == min.peek()){
                min.pop();
            }
            if (temp == max.peek()){
                max.pop();
            }
        } else{
            throw new IllegalArgumentException("Стек пустой");
        }
    }
}
