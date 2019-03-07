package com.simon.app.userinteraction;

import com.simon.app.imagemanipulation.ImageManipulation;

import java.util.Scanner;

public class UserInteraction {

    public UserInteraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Path - Input: ");
        String pathIn = scanner.next();
        System.out.println("Path - Output: ");
        String pathOut = scanner.next();
        System.out.println("red(r), green(g), blue(b)");
        String color = scanner.next();
        System.out.println("Image Format");
        String format = scanner.next();

        ImageManipulation imageManipulation = new ImageManipulation(pathIn, pathOut, format, color);
        imageManipulation.read_image();
        imageManipulation.write_image();
    }
}
