package Pack;

import java.io.*;
import java.util.*;
import java.lang.*;


class PathDic2{

    String filePathDiction2 = "src" + File.separator + "Pack" + File.separator + "diction2.txt";
    File file = new File(filePathDiction2);
}

public class Diction2
{


    public static void main() throws IOException {

        while(true) {
            PathDic2 pathDic = new PathDic2();


            Properties properties = new Properties();
            properties.load(new FileReader(pathDic.file));
            HashMap<String, String> map = new HashMap(properties);


            System.out.println("Данный словарь состоит из " + map.size() + " слов(а)");

            System.out.println("Меню: ");
            System.out.println("<1> - Key");
            System.out.println("<2> - Value");
            System.out.println("<3> - Завершение программы ");
            System.out.println("<4> - Переход в A словарь ");

            Scanner lng = new Scanner(System.in);
            String language = lng.nextLine();


            System.out.println("Меню: ");
            System.out.println("<1> - Вывод всех слов ");
            System.out.println("<2> - Поиск перевода ");
            System.out.println("<3> - Удаление слова ");
            System.out.println("<4> - Добавение слова ");

            Scanner search = new Scanner(System.in);
            String Srch = search.nextLine();



                switch (language) {
                    case "1":

                        switch (Srch) {
                            case "1":
                                System.out.println(map.entrySet());

                                Diction2 dict2 = new Diction2();
                                dict2.main();

                                break;

                            case "2":

                                System.out.println("Введите ваше слово с заглавной буквы: ");
                                String Srch2 = search.nextLine();

                               if (map.containsKey(Srch2)) {
                                    System.out.println("Слово " + Srch2 + " переводится как: " + map.get(Srch2));
                                    Diction2.main();}

                                if (Srch2.length() > 4)
                                {System.out.println(Srch2 + " превышает 5 символов");
                                    Diction2.main();
                                }else {
                                    if (Srch2.length() < 4) {
                                        System.out.println(Srch2 + " не содержит 5 символов");
                                        Diction2.main();}
                                }




                            break;
                            case "3":


                                try {
                                    File inputFile = new File( "src" + File.separator + "Pack" + File.separator + "diction2.txt");
                                    File tempFile = new File("src" + File.separator + "Pack" + File.separator + "file2.txt");



                                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                                    BufferedWriter tempWriter = new BufferedWriter(new FileWriter(tempFile));



                                    System.out.println("Введите пару слов <Key = Value>: ");
                                    String Srch3 = search.nextLine();
                                    String current;
                                    while ((current = reader.readLine()) != null) {
                                        if (current.equals(Srch3))
                                            continue;
                                        tempWriter.write(current + "\n");

                                    }

                                    reader.close();
                                    tempWriter.close();


                                    inputFile.delete();


                                    if(tempFile.renameTo(inputFile))
                                    {System.out.println("Успешно удалено!!!");}
                                    else
                                    {System.out.println("Ошибка! Не удалено");}



                                }catch (IOException e){
                                    e.printStackTrace();
                                }
                                break;
                            case "4":

                                try(FileWriter writer = new FileWriter(pathDic.filePathDiction2,true);) {
                                    System.out.println("Введите слово");
                                    String Srch4 = search.nextLine();
                                    System.out.println("Введите перевод");
                                    String Srch5 = search.nextLine();

                                    if (Srch4.length() > 4)
                                    {System.out.println(Srch4 + " превышает 5 символов");
                                        Diction2.main();
                                    }else {
                                        if (Srch4.length() < 4) {
                                            System.out.println(Srch4 + " не содержит 5 символов");
                                            Diction2.main();}
                                    }


                                    if (Srch5.length() > 5) {
                                        System.out.println(Srch5 + " превышает 5 символов");
                                        Diction2.main();
                                    } else {
                                        if (Srch5.length() < 5) {
                                            System.out.println(Srch5 + " не содержит 5 символов");
                                            Diction2.main();}
                                    }

                                    writer.write(Srch4);
                                    writer.write(" = ");
                                    writer.write(Srch5);
                                    writer.write("\n");


                                }catch(IOException ex){

                                    System.out.println(ex.getMessage());
                                }
                                Diction2 dict21 = new Diction2();
                                dict21.main();
                                break;


                        }


                    case "2":
                        switch (Srch) {
                            case "1":
                                System.out.println(map.entrySet());

                                Diction2 dict2 = new Diction2();
                                dict2.main();
                                break;

                            case "2": {
                                System.out.println("Ввод для value: ");
                                String Srch2 = search.nextLine();

                                if (Srch2.length() > 5) {
                                    System.out.println(Srch2 + " превышает 5 символов");
                                    Diction2.main();
                                } else {
                                    if (Srch2.length() < 5) {
                                        System.out.println(Srch2 + " не содержит 5 символов");
                                        Diction2.main();}
                                }



                                for (Map.Entry<String, String> entry : map.entrySet()) {
                                    String key = entry.getKey();
                                    String value = entry.getValue();
                                    if (value.equals(Srch2))
                                        System.out.println(key);}



                            }

                            break;

                            case "3":
                                System.out.println("Введите ваше слово с заглавной буквы: ");
                                try {

                                    File inputFile = new File( "src" + File.separator + "Pack" + File.separator + "diction2.txt");
                                    File tempFile = new File("src" + File.separator + "Pack" + File.separator + "file2.txt");


                                    BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                                    BufferedWriter tempWriter = new BufferedWriter(new FileWriter(tempFile));



                                    String Srch3 = search.nextLine();
                                    String current;
                                    while ((current = reader.readLine()) != null) {
                                        if (current.equals(Srch3))
                                            continue;
                                        tempWriter.write(current + "\n");

                                    }


                                    tempWriter.close();
                                    reader.close();

                                    inputFile.delete();

                                    if(tempFile.renameTo(inputFile))
                                    {System.out.println("Успешно удалено!!!");}
                                    else
                                    {System.out.println("Ошибка! Не удалено");}

                                }catch (IOException e){
                                    e.printStackTrace();
                                }

                                break;
                            case "4":

                                try(FileWriter writer = new FileWriter(pathDic.filePathDiction2,true);) {
                                    System.out.println("Введите слово");
                                    String Srch5 = search.nextLine();
                                    System.out.println("Введите перевод");
                                    String Srch4 = search.nextLine();

                                        if (Srch4.length() > 4)
                                        {System.out.println(Srch4 + " превышает 5 символов");
                                        Diction2.main();
                                        }else {
                                        if (Srch4.length() < 4) {
                                        System.out.println(Srch4 + " не содержит 5 символов");
                                        Diction2.main();}
                                        }


                                        if (Srch5.length() > 5) {
                                            System.out.println(Srch5 + " превышает 5 символов");
                                            Diction2.main();
                                        } else {
                                            if (Srch5.length() < 5) {
                                                System.out.println(Srch5 + " не содержит 5 символов");
                                                Diction2.main();}
                                        }


                                        writer.write(Srch4);
                                        writer.write(" = ");


                                        writer.write(Srch5);
                                        writer.write("\n");

                                        System.out.println(Srch4 + " = " + Srch5 + " успешно добавлено");


                                    }catch(IOException ex){

                                    System.out.println(ex.getMessage());}
                                break;

                        }
                        break;


                    case "3":
                        System.out.println("Программа завершена");
                        System.exit(0);
                        break;

                    case "4":
                        Diction1 dict1 = new Diction1();
                        dict1.main();
                        break;
                }

            }
        }

}