package Adventofcode;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
//used chat gpt here for method wise for understanding purpose

public class Methodspractice {
    @Test
    public void readFile() {
        try {
            Path filePath = new File("C:\\Users\\yoges\\Desktop\\Adventofcode\\src\\test\\java\\Adventofcode\\AdvInput1").toPath();
            List<String> lines = Files.readAllLines(filePath, Charset.defaultCharset());

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void typeconversion() {
        try {
            Path filePath = new File("C:\\Users\\yoges\\Desktop\\Adventofcode\\src\\test\\java\\Adventofcode\\AdvInput1").toPath();
            List<String> lines = Files.readAllLines(filePath, Charset.defaultCharset());

            List<Integer> integers = convertLinesToInteger(lines);
            for (int num : integers) {
                System.out.println(num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Integer> convertLinesToInteger(List<String> lines) {
        List<Integer> integers = new ArrayList<>();
        for (String liness : lines) {
            try {
                int number = Integer.parseInt(liness);
                integers.add(number);
            } catch (NumberFormatException e) {
                System.err.println("not changeable: " + lines);
            }
        }
        return integers;
    }
    @Test

    public List<List<String>> emptylines(List<String> lines) {
        List<List<String>> result = new ArrayList<>();
        List<String> currentInput = new ArrayList<>();

        for (String line : lines) {
            if (line.isEmpty()) {
                if (!currentInput.isEmpty()) {
                    result.add(currentInput);
                    currentInput = new ArrayList<>();
                }
            } else {
                currentInput.add(line);
            }
        }

        if (!currentInput.isEmpty()) {
            result.add(currentInput);
        }

        return result;
    }
@Test
    public List<String> combineSublists(List<List<String>> sublists) {
        List<String> combinedList = new ArrayList<>();
        for (List<String> sublist : sublists) {
            combinedList.add(String.join(System.lineSeparator(), sublist));
        }
        return combinedList;

    }

}
