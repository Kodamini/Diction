package Pack;

import java.io.*;
import java.util.*;
import java.lang.*;

public  class Diction1
{
    public static void main() throws IOException {

        while (true) {

            String filePathDiction1 = "C:\\Project\\Diction\\src\\diction1.txt";
            File file = new File(filePathDiction1);

            Properties properties = new Properties();
            properties.load(new FileReader(file));
            HashMap<String, String> map = new HashMap(properties);


            try(BufferedReader BR = new BufferedReader(new FileReader(filePathDiction1)))
            {

                String read;
                while((read = BR.readLine()) != null)
                {

                }
            
            }catch(IOException io)
            {
                io.printStackTrace();
            }

            System.out.println("Данный словарь состоит из " + map.size() + " слов(а)");

            System.out.println("Меню: ");
            System.out.println("<1> - Вывод всех слов ");
            System.out.println("<2> - Поиск перевода ");
            System.out.println("<3> - Удаление слова ");
            System.out.println("<4> - Добавение слова ");
            System.out.println("<5> - Завершение программы ");
            System.out.println("<6> - Переход в Б словарь ");

            Scanner search = new Scanner(System.in);
            String Srch = search.nextLine();



            switch (Srch) {
                case "1":
                    System.out.println(map.entrySet());
                    Diction1.main();
                    break;

                case "2":


                    System.out.println("Введите ваше слово с заглавной буквы: ");
                    String Srch2 = search.nextLine();

                    if (map.containsKey(Srch2)) {
                        System.out.println("Слово " + Srch2 + " переводится как: " + map.get(Srch2));
                    }


                    break;

                case "3":

                    System.out.println("Введите ваше слово с заглавной буквы: ");
                    String Srch3 = search.nextLine();

                    try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePathDiction1));
                            BufferedReader BR = new BufferedReader(new FileReader(filePathDiction1))) {


                    /*
                    if (map.containsKey(Srch3)) {
                        map.remove(Srch3);
                        System.out.println("Слово " + Srch3 + " удалено ");

                        System.out.println(map.entrySet());
                    }
                    */
                        }
                    break;

                case "4":
            try(FileWriter writer = new FileWriter(filePathDiction1,true);) {
            System.out.println("Введите словоо");
            String Srch4 = search.nextLine();
            System.out.println("Введите перевод");
            String Srch5 = search.nextLine();
            writer.write(Srch4);
            writer.write(" = ");
            writer.write(Srch5);
            writer.write("\n");
            }catch(IOException ex){

             System.out.println(ex.getMessage());}

                    break;

                case "5":
                    System.out.println("Программа завершена");
                    System.exit(0);

                case "6":
                    Diction2 dict2 = new Diction2();
                    dict2.main();
                    break;

            }
        }
    }
}
