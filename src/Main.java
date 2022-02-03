import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        int size = 0;
        int border = 0;
        int treshold = 0;

        Scanner scanner = new Scanner(System.in);

        logger.log("Просим ввести входные данные для списка");

        System.out.println("Введите размер списка:");
        size = scanner.nextInt();

        System.out.println("Введите верхнюю границу для значений:");
        border = scanner.nextInt();

        logger.log("Создаём и наполняем список");
        Random random = new Random();

        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            source.add(random.nextInt(border));
        }

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");
        treshold = scanner.nextInt();

        logger.log("Запускаем фильтрацию");
        Filter filter = new Filter(treshold);

        logger.log("Выводим результат на экран");
        List<Integer> result = filter.filterOut(source);
        System.out.print("Отфильтрованный список: ");
        result.forEach(number -> System.out.print(number + " "));
        System.out.println();
        logger.log("Завершаем программу");
    }
}