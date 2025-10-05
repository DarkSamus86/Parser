package org.darksamus86;

import java.util.Scanner;
import org.darksamus86.service.ParseHtml;

public class Parser {
    public static void main(String[] args) {
        System.out.println("Input what would you like to parse (html or json) \n if you would to exit program write 'exit': ");

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ParseHtml html = new ParseHtml();


        while (true) {
            if ("html".equalsIgnoreCase(input)) {
                System.out.print("Enter URL: ");
                String url = sc.nextLine();
                String res = html.parseHtml(url);

                System.out.println("HTML page: " + res);
            }

            if ("exit".equalsIgnoreCase(input)) {
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
}