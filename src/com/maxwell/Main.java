package com.maxwell;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            try (BufferedReader br = new BufferedReader(
                    new FileReader("C:\\Users\\thelo\\IdeaProjects\\Inventory\\Data"))) {

                String contentline;
                while ((contentline = br.readLine()) != null) {
                    System.out.println(contentline);
                }
                br.close();
            }
        } catch (Exception exception) {
            return;
        }
    }
}