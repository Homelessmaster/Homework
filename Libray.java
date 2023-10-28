package Third;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Libray {


    public static String[] ReadData(Scanner iScan) throws IllegalArgumentException{

        
        System.out.println("Введите свои данные в формате:");
        System.out.println("Фамилия Имя Отчество, датарождения(дд.мм.гггг), номер телефона(71234567890), пол(f/m)");

        String data = iScan.nextLine();
        
        String[] dataList = data.split(", ");

        if(dataList.length < 4) throw new IllegalArgumentException("123");
        if(dataList.length > 4) throw new IllegalArgumentException("124");

        return dataList;
    }

    public static void CheckName(String name) throws IllegalArgumentException{
        char[] chars = name.toCharArray();

        if(!name.contains(" ")) throw new IllegalArgumentException("125");

        if(name.split(" ").length < 3 || name.split(" ").length > 3) throw new IllegalArgumentException("126");


        for (char ch : chars) {
            // если хотябы один символ не буква, не дефис и не пробел
            if (!Character.isLetter(ch) &&  ch != '-' && ch != ' ') throw new IllegalArgumentException("126");
        }

    }

    public static void CheckDate(String date) throws IllegalArgumentException {
        
        if(date.equals("")) throw new IllegalArgumentException("115");
        date = ChangeDate(date);
    
        
        if(DateCheck.dateValidator(date) != true) throw new IllegalArgumentException("127");

        
    }

    public static String ChangeDate(String date){

        String[] temp = date.split("\\.");
        
        String res = temp[0];
        temp[0] = temp[1];
        temp[1] = res;
        date = "";

        for (int i = 0; i < temp.length; i++) {
            date += temp[i];
            if(i < temp.length - 1){
                date += ".";
            }
        }
        return date;
    }

    public static void CheckPhone(String phone) throws IllegalArgumentException{

        String PHONE_TEMPLATE = "7\\d{10}";
        if(phone.equals("")) throw new IllegalArgumentException("135");
        if (!phone.matches(PHONE_TEMPLATE)) throw new IllegalArgumentException("128");
    }

    public static void CheckGender(String gender) throws IllegalArgumentException{
        if(gender.equals("")) throw new IllegalArgumentException("145");
        if(!gender.equals("f") && !gender.equals("m") &&
           !gender.equals("F") && !gender.equals("M")) throw new IllegalArgumentException("129");
    }

    public static void Log(String[] data) throws IOException{

        String[] name = data[0].split(" ");


        try(FileWriter file = new FileWriter(name[0] + ".txt", true)){
            String temp = "<" + name[0] + ">" + "<" + name[1] + ">" + 
                          "<" + name[2] + ">" + "<" + data[1] + ">" + 
                          "<" + data[2] + ">" + "<" + data[3] + ">";
            file.write(temp + "\n");
        }
    }
}
