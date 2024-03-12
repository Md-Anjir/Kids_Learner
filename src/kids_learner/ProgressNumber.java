/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kids_learner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ASUS
 */
public class ProgressNumber {
    
    public static int wrong_no_add ;
    public static int correct_no_add ;
    
    public static int wrong_no_sub ;
    public static int correct_no_sub ;
    
    public static int wrong_no_mul ;
    public static int correct_no_mul ;
    
    public static int wrong_no_div ;
     public static int correct_no_div ;
     
     public static void main(String[] args) {
        readNumbersFromFile();
    }

    public static void readNumbersFromFile() {
        String fileName = "progress_numbers.txt";

        try (FileReader fileReader = new FileReader(fileName);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length == 2) {
                    String variableName = parts[0];
                    int value = Integer.parseInt(parts[1]);
                    updateProgress(variableName, value);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading numbers from file: " + e.getMessage());
        }
    }

    public static void updateProgress(String variableName, int value) {
        switch (variableName) {
            case "wrong_no_add":
                ProgressNumber.wrong_no_add = value;
                break;
            case "correct_no_add":
                ProgressNumber.correct_no_add = value;
                break;
            case "wrong_no_sub":
                ProgressNumber.wrong_no_sub = value;
                break;
            case "correct_no_sub":
                ProgressNumber.correct_no_sub = value;
                break;
            case "wrong_no_mul":
                ProgressNumber.wrong_no_mul = value;
                break;
            case "correct_no_mul":
                ProgressNumber.correct_no_mul = value;
                break;
            case "wrong_no_div":
                ProgressNumber.wrong_no_div = value;
                break;
            case "correct_no_div":
                ProgressNumber.correct_no_div = value;
                break;
            default:
                System.err.println("Unknown variable name: " + variableName);
        }
    }
    public static void saveProgressNumbersToFile() {
    String fileName = "progress_numbers.txt";

    try (FileWriter fileWriter = new FileWriter(fileName);
         BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

        bufferedWriter.write("wrong_no_add=" + ProgressNumber.wrong_no_add + "\n");
        bufferedWriter.write("correct_no_add=" + ProgressNumber.correct_no_add + "\n");
        bufferedWriter.write("wrong_no_sub=" + ProgressNumber.wrong_no_sub + "\n");
        bufferedWriter.write("correct_no_sub=" + ProgressNumber.correct_no_sub + "\n");
        bufferedWriter.write("wrong_no_mul=" + ProgressNumber.wrong_no_mul + "\n");
        bufferedWriter.write("correct_no_mul=" + ProgressNumber.correct_no_mul + "\n");
        bufferedWriter.write("wrong_no_div=" + ProgressNumber.wrong_no_div + "\n");
        bufferedWriter.write("correct_no_div=" + ProgressNumber.correct_no_div + "\n");

        System.out.println("Numbers saved successfully to " + fileName);
    } catch (IOException e) {
        System.err.println("Error saving numbers to file: " + e.getMessage());
    }
    }
}
