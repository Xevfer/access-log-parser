import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = new Scanner(System.in).nextLine();
        int validFileCount = 0;
        while (true) {
            System.out.println("Введите путь к файлу, который нужно парсить:");
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists) {
                System.out.println("Файл не существует. Попробуйте снова.");
                continue; // возвращаемся к запросу пути
            } else if (!isDirectory) {
                System.out.println("Указанный путь ведёт к папке, а не к файлу. Попробуйте снова.");
                continue; // продолжаем цикл
            } else {

            // Если все проверки прошли успешно:
            validFileCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + validFileCount);
        }
    }

    }
    }

