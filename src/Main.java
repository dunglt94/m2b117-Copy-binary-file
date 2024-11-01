import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file path: ");
        String sourcePath = scanner.nextLine();
        System.out.print("Enter destination file path: ");
        String destinationPath = scanner.nextLine();
        CopyBinaryFile copyBinaryFile = new CopyBinaryFile();
        copyBinaryFile.copyFile(sourcePath, destinationPath);
    }
}
