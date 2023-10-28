package Third;

import java.io.IOException;
import java.util.Scanner;



public class Program {
    
   
    public static void main(String[] args) {
        Scanner iScan = new Scanner (System.in, "Cp866");
        try {
            String[] dataList = Libray.ReadData(iScan);          
            
            Libray.CheckName(dataList[0]);
            Libray.CheckDate(dataList[1]);
            Libray.CheckPhone(dataList[2]);
            Libray.CheckGender(dataList[3]);
    
            Libray.Log(dataList);
            
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
            if(e.getMessage().equals("123")){
                System.out.println("Вы ввели недостаточное количество данных");
            }
            if(e.getMessage().equals("124")){
                System.out.println("Вы ввели излишнее количество данных");
            }
            if(e.getMessage().equals("115")){
                System.out.println("В качестве даты вы ввели пустую строку");
            }
            if(e.getMessage().equals("125")){
                System.out.println("В качестве ФИО вы ввели пустую строку");
            }
            if(e.getMessage().equals("135")){
                System.out.println("В качестве телефона вы ввели пустую строку");
            }
            if(e.getMessage().equals("145")){
                System.out.println("В качестве пола вы ввели пустую строку");
            }
            if(e.getMessage().equals("126")){
                System.out.println("Неверный формат ФИО");
            }
            if(e.getMessage().equals("127")){
                System.out.println("Вы ввели неправильную дату!");
            }
            if(e.getMessage().equals("128")){
                System.out.println("Неверный формат телефона в строке ");
            }
            if(e.getMessage().equals("129")){
                System.out.println("Неверный формат пола");
            }
        } catch (IOException e) {

            System.out.println("ОШИБКА: не смогли сохранить файл");
            System.out.println(e.getLocalizedMessage());
        }
    }

}
