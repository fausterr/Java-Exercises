package GeekForGeeksOrazInne;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadInputUser {
    public static void main(String[] args) throws IOException {
        //1
        Scanner scanner = new Scanner(System.in);
        String input2 = scanner.nextLine();
        System.out.println(input2);
        scanner.close();


        //2
        args = new String[2];
        args[0] = "Hello";
        args[1] = "World";
        if(args.length > 0) {
            for(var arg: args)
                System.out.print(arg + " ");
        } else {
            System.out.println("no found args");
        }


        //3
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        System.out.println(input);


        //4
        String input3 = System.console().readLine();
        System.out.println(input3);
    }
}
