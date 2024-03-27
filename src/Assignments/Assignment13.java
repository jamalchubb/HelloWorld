package Assignments;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.util.Map;
import java.util.Random;
import java.util.HashMap;

public class Assignment13 {
    public static void main(String[] args) throws Exception {
        String [] dressings = {"Italian", "Ranch", "Blue Cheese", "Vinaigrette", "Thousand Island"};
        Random rand = new Random();
        try(BufferedWriter writer = new BufferedWriter(new java.io.FileWriter("dressings.txt"))){
            for (int i = 0; i < 100; i++){
               writer.write(dressings[rand.nextInt(dressings.length)] + "\n"); //
            }
        }

        Map<String, Integer> dressingsCount = new HashMap<>();
        try(BufferedReader reader = new BufferedReader(new java.io.FileReader("dressings.txt"))){
            String line;
            while((line = reader.readLine()) != null){
                dressingsCount.put(line, dressingsCount.getOrDefault(line, 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : dressingsCount.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }
}
