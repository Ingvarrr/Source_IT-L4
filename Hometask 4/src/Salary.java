/**
 * Created by vig on 10/28/16.
 */
import java.io.*;

public class Salary {
    private int sal;
    private int switchSal;
    public void Salary(){
        System.out.println("Введите размер вашей ЗП");
    if (sal>=0 && sal<=1000)
        System.out.println("Критически малый доход");
    else if (sal>1000 && sal<=5000)
        System.out.println("Средний доход");
    else if (sal>5000 && sal>=100000)
        System.out.println("Высокий доход");
    else if (sal>=100000)
        System.out.println("Миллионер");
    else System.out.println("Error: Incorrect insertion");
    }

    //switch implementation
    public void Salary2(){
        if (sal>=0 && sal<=1000) switchSal = 0;
        else if (sal>1000 && sal<=5000) switchSal = 1;
        else if (sal>5000 && sal>=100000) switchSal = 2;
        else if (sal>=100000) switchSal = 3;
        switch (switchSal){
            case 0:
                System.out.println("Критически малый доход");
                break;
            case 1:
                System.out.println("Средний доход");
                break;
            case 2:
                System.out.println("Высокий доход");
                break;
            case 3:
                System.out.println("Миллионер");
                break;
            default:
                System.out.println("Error: Incorrect insertion");
        }
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

}
