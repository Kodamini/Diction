package Pack;

import java.io.*;
import java.util.*;
import java.lang.*;

class PathDic1{

    String filePathDiction1 = "src" + File.separator + "Pack" + File.separator + "diction1.txt";
    File file = new File(filePathDiction1);
}



public  class Diction1
{
    public static void main() throws IOException {

        while (true) {
            PathDic1 pathDic = new PathDic1();


            Properties properties = new Properties();
            properties.load(new FileReader(pathDic.file));
            HashMap<String, String> map = new HashMap(properties);



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
                    try {
                        File inputFile = new File("src" + File.separator + "Pack" + File.separator + "diction1.txt");
                        File tempFile = new File("src" + File.separator + "Pack" + File.separator + "file1.txt");



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
                    try(FileWriter writer = new FileWriter(pathDic.filePathDiction1,true);) {
                        System.out.println("Введите слово");
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
