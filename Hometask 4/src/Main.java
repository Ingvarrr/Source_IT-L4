/**
 * Created by vig on 10/27/16.
 */
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String input;
        int nInput;
        String input2;
        double nInput2;
        String input3;
        int nInput3;

        Lines lines = new Lines();
        Salary salary = new Salary();
        Numb numb = new Numb();
        InputStream iS = System.in;
        Reader iSR = new InputStreamReader(iS);
        BufferedReader bR = new BufferedReader(iSR);

        System.out.println("Введите номер задания: " +
                "\n" +
                "1) Выведет три строки записанные в одной символьной строке метода println()" +
                "\n" +
                "2) Введите вещественное трехзначное число с 5 знаками после запятой" +
                "\n" +
                "Оно будет расчитано по следующей формуле:" +
                "цифра сотень + цифра 10-ов - цифра единиц + цифра десятых - цифра сотых + цифра тысячных - цифра 10-тыс +цифра 100-тыс" +
                "\n" +
                "3) Введите вашу зп в грн и программа скажет какой уровень достатка у Вас");
        while (true) {
            input = bR.readLine();
            try {
                nInput = Integer.parseInt(input);
            }
            catch (NumberFormatException e){
                System.out.println("Неверный ввод. Введите цифру номера задания");
                continue;
            }
            if (nInput == 1)
                System.out.println("Вы ввели номер задания 1, его результат: ");
            else if (nInput == 2)
                System.out.println("Вы ввели номер задания 2, введите число ");
            else if (nInput == 3)
                System.out.println("Вы ввели номер задания 3, введите размер Вашей ЗП ");
            else {
                System.out.println("Неправильный ввод номера задания, введите его еще раз (1,2,3)");
                continue;
            }
            break;
            }
        switch (nInput){
            case (1):
                lines.Lines();
                break;
            case (2):
                input2 = bR.readLine();
                nInput2 = Double.parseDouble(input2);
                numb.setN(nInput2);
                numb.Numb();
                break;
            case (3):
                input3 = bR.readLine();
                nInput3 = Integer.parseInt(input3);
                salary.setSal(nInput3);
                salary.Salary();
                break;
        }
    }
}
