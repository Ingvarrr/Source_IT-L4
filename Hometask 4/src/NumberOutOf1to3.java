/**
 * Created by vig on 12/10/16.
 */
public class NumberOutOf1to3 extends NumberFormatException{

    private int errorCode;

    public NumberOutOf1to3(){
    }

    public  NumberOutOf1to3(int errorCode, String message){
        super(message);

        this.errorCode = errorCode;
    }

    public  int getErrorCode(){
        return errorCode;
    }
    public void Message() {
        System.out.println("Неверный ввод. Введите цифру номера задания");
    }
    public NumberOutOf1to3(String var1) {
        super(var1);
    }

    static NumberOutOf1to3 forInputString(String var0) {
        return new NumberOutOf1to3("For input string: \"" + var0 + "\"");
    }
}
