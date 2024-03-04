import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(6);
        System.out.println("Вместимость очереди (6)шесть элементов.\n");

        // Добавляем элементы в очередь
        queue.push(1);
        queue.push(8);
        queue.push(0);
        queue.push(7);
        queue.push(2);
        queue.push(6);
        System.out.println("Добавили (6)шесть элементов в очередь.");

        // Печатаем элементы
        System.out.println("Элементы в очереди:");
        queue.print();
        System.out.println();

        // Добавляем элемент в очередь
        queue.push(9);
        System.out.println("Добавлен седьмой элемент(9) в очередь.");
        // Печатаем элементы
        System.out.println("Элементы в очереди после добавления:");
        queue.print();
        System.out.println();

        // Извлекаем элементы
        try {
            System.out.println("Извлечен элемент: " + queue.pop());
            System.out.println("Извлечен элемент: " + queue.pop());
        } catch (NoSuchElementException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        System.out.println("\nОставшиеся элементы в очереди:");
        queue.print();
    }
}
