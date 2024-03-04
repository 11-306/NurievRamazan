import java.util.NoSuchElementException;

public class Queue {
    // Массив элементов для хранения данных
    public Node[] elements;
    // Текущий размер очереди
    public int size;
    // Максимальная вместимость очереди
    public int capacity;
    // Указатель на начало очереди
    public int front;
    // Указатель на конец очереди
    public int rear;

    // Конструктор с указанием вместимости очереди
    public Queue(int capacity) {
        this.capacity = capacity;
        this.elements = new Node[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }

    // Внутренний класс для элементов очереди
    class Node {
        public int data;
        public Node(int data) {
            this.data = data;
        }
    }

    // Метод добавления элемента в очередь
    public void push(int data) {
        if (size == capacity) {
            // Если нет места, убираем первый элемент или перемещаем элементы
            front = (front + 1) % capacity;
            size--;
        }

        elements[rear] = new Node(data);
        rear = (rear + 1) % capacity;
        size++;
    }

    // Метод извлечения элемента из очереди
    public int pop() {
        if (size == 0) {
            throw new NoSuchElementException("Очередь пуста");
        }

        int result = elements[front].data;
        front = (front + 1) % capacity;
        size--;
        return result;
    }

    // Метод для печати содержимого очереди
    public void print() {
        if (size == 0) {
            System.out.println("Очередь пуста");
            return;
        }

        int index = front;
        for (int i = 0; i < size; i++) {
            System.out.println(elements[index].data);
            index = (index + 1) % capacity;
        }
    }
}
