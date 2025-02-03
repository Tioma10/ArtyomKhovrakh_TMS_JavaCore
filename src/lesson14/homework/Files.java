package lesson14.homework;

import java.io.*;


public class Files {
    public static void main(String[] args) {
        getFileWriter(getFileReader());
    }

    public static String getFileReader() {
        String maxWord = "s";
        try {
            File file = new File("src/lesson14/homework/Romeo.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] arrayWord = line.split("[^A-Za-z0-9]");
                for (String w : arrayWord) {
                    if (w.length() > maxWord.length()) {
                        maxWord = w;
                    }
                }
            }
            br.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("We didn't find the file");
        }
        return maxWord;
    }

    public static void getFileWriter(String msg) {
        try (FileWriter write = new FileWriter("src/lesson14/homework/New.txt", true)) {
            write.write(msg);
        } catch (IOException e) {
            System.out.println("We didn't find the file");
        }
    }

}
