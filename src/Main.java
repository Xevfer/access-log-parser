import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int validFileCount = 0;
        while (true) {
            System.out.println("Введите путь к файлу");
            String path =new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExist=file.exists();
            boolean isDirectory=file.isDirectory();

            if (!fileExist) {
                System.out.println("Файл не существует. Попробуйте снова.");
                continue;
            } else if (isDirectory) {
                System.out.println("Указанный путь ведёт к папке, а не к файлу. Попробуйте снова.");
                continue;
            }

            // Если все проверки пройдены — это корректный файл
            validFileCount++;
            System.out.println("Путь указан верно.");
            System.out.println("Это файл номер " + validFileCount);
        }
    }
}



