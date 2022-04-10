import Commands.*;
import ForCity.CityCollection;
import ForCity.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    public static void main (String[] args) throws IOException {
        /*char c;
        InputStreamReader sr = new InputStreamReader(new FileInputStream("D:\\test.txt"));
        c = (char)sr.read();
        while (c!='.'){
            System.out.println(c);
            c=(char)sr.read();
        }*/
        CityCollection cityCollection = new CityCollection();
        //Decoder.fillCollection(FileReader.readFromFile(FileReader.getFilePath()));
        Commands commands = new Commands();
        commands.regist(new Add(), new AveragePhoneCode(), new Clear(), new ExecuteScript(), new Exit(), new FillCollection(), new Help(),
                new Info(), new PrintAscendingPhone(), new Remove(), new Remove_at(), new Reorder(), new Save(), new Show(), new Shuffle(),
                new Update(), new PrintDescendingMeters());

        //commands.executeCommand("FillCollection");
        commands.getCommand("FillCollection").execute(args[0]);
        Scanner in = new Scanner(System.in);
        System.out.println("Приложение готово к работе,введите команду,для справки введите help.");
        while (true) {
            System.out.print("~ ");
            String commandName = in.nextLine();
            if (!commandName.equals(""))
                System.out.println( commands.executeCommand(commandName));
            System.out.println("Введите команду:");

        }
    }
}
