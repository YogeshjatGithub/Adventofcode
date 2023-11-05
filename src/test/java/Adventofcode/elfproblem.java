package Adventofcode;
//first created a package in that package
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
//created class after importing packages
public class elfproblem {
    @Test
    public void test(){
        //reading a file
        try {
            List<String> lines = Files.readAllLines(Path.of("src/test/java/Adventofcode/AdvInput1"));
            List<Integer> person = new ArrayList<>();//to create arraylist
            int currentperson = 0;
            //used for loop (control structures)here to simplfy the iteration task
            for (String line : lines) {
                if (line.isEmpty()) { //whitespaces are considered for our new sublists
                    person.add(currentperson);
                    currentperson = 0;
                } else {
                    int cal = Integer.parseInt(line);//type conversion applied.
                    currentperson += cal;
                }
            }

            int cals = 0;
            int maximum = -1;

            for (int i = 0; i < person.size(); i++) {
                if (person.get(i) > cals) {
                    cals = person.get(i);
                    maximum = i + 1;
                }
            }

            System.out.println( "person number "+maximum + " is carrying the most calories: " + cals);
            int answerexpected = 70720;
            //used assert equals here with the maximum calories we could expect from the input file
            Assertions.assertEquals(answerexpected, cals,
                    "The answer found is incorret.");//if the sum doesnt match this message will be dispalyed
        } catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
