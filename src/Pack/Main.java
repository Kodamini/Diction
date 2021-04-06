package Pack;

import java.io.*;
import java.util.*;
import java.lang.*;


public class Main {


    public static void main(String[] args) throws IOException{



            System.out.println("");
            System.out.println("Выберите нужный вам словарь, либо завершите программу");
            System.out.println("<1> - А словарь");
            System.out.println("<2> - Б словарь");
            System.out.println("<3> - Завершение программы");



            Scanner Dictionary = new Scanner(System.in);
            String Dictionarys = Dictionary.nextLine();


            switch (Dictionarys)
            {
                case "1":
                    Diction1 dict1 = new Diction1();
                    dict1.main();
                    break;
                case "2":
                    Diction2 dict2 = new Diction2();
                    dict2.main();
                    break;
                case "3":
                    System.out.println("Программа завершена");
                    System.exit(0);
            }
    }


}
