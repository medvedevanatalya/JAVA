package org.step.dz5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {

        String data = "Информация созданного файла: файл создан, 45 2,555 47 ";
        writeFile("dz-test.txt", data);

        data = readerFile("dz-test.txt");
        System.out.println(data);

        writeFile("dz-test-2.txt", data);

        scanner("dz-test-2.txt");
    }

    public static void writeFile(String fileName, String data){
        PrintWriter printWriter = null;

        File file = new File(fileName);
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(file);

            printWriter = new PrintWriter(fileWriter);
            printWriter.println(data);

            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            printWriter.close();
        }
    }

    public static String readerFile(String fileName) {
        StringBuilder data = null;
        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();
            data = new StringBuilder(line);
            while (line != null){
                line = bufferedReader.readLine();
                data.append(line);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data.toString();
    }

    public static void scanner(String fileName) throws FileNotFoundException{
        FileReader fileReader = new FileReader(fileName);

        Scanner scanner = new Scanner(fileReader);
        Scanner console = new Scanner(System.in);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println("this is int " + scanner.nextInt());
            } else if (scanner.hasNextDouble()) {
                System.out.println("this is double " + scanner.nextDouble());
            } else {
                System.out.println("this is String " + scanner.next());
            }
        }
    }
}
