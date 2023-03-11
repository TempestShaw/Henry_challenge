package com.tempestshaw.henrychallenge;
import java.util.Scanner;
public class Program {
    private static void ping() {
        System.out.println("pong");
    }
    private static void say(String s) {
        String substring = s.substring(s.indexOf("say")+3);
        System.out.println(substring.replaceAll("\\s",""));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNextLine()) {
            String command = input.nextLine();
            if (command.startsWith("say")) {
                say(command);
            }else if (command.equals("ping")) {
                ping();
            }else if (command.equals("quit")) {
                System.exit(0);
            }else {
                System.out.println("Invalid command");
            }

            }


        }

    }
