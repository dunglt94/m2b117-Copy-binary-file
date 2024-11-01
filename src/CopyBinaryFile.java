import java.io.*;

public class CopyBinaryFile {
    public void copyFile(String srcFile, String destFile) {
        try {
            File source = new File(srcFile);
            if (!source.exists()) {
                throw new FileNotFoundException(srcFile);
            }

            File dest = new File(destFile);
            if (dest.exists()) {
                System.out.println("File '"+ dest.getName() + "' already exists");
            }

            FileInputStream fis = new FileInputStream(source);
            FileOutputStream fos = new FileOutputStream(dest);
            
            byte[] buffer = new byte[1024];
            int length;
            int totalByteCopied = 0;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
                totalByteCopied += length;
            }
            System.out.println("File copied");
            System.out.println("Number of bytes copied is " + totalByteCopied);
            fis.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cant't copy the file");
            System.out.println(e.getMessage());
        }
    }
}
