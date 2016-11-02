/**
 * Created by vig on 10/28/16.
 */
public class Numb {
    private double n;
    private int n1;
    private int n2;
    private int n3;
    private int n4;
    private int n5;
    private int n6;
    private int n7;
    private int n8;
    public void Numb() {
        double numb = n * 100000;
        numb = Math.round(numb);
        n1 = (int) numb % 10;
        numb = (int) numb / 10;
        n2 = (int) numb % 10;
        numb = (int) numb / 10;
        n3 = (int) numb % 10;
        numb = (int) numb / 10;
        n4 = (int) numb % 10;
        numb = (int) numb / 10;
        n5 = (int) numb % 10;
        numb = (int) numb / 10;
        n6 = (int) numb % 10;
        numb = (int) numb / 10;
        n7 = (int) numb % 10;
        numb = (int) numb / 10;
        n8 = (int) numb % 10;
        int res = n8 + n7 - n6 + n5 - n4 + n3 - n2 + n1;
        System.out.println("Сумма всех чисел: " + res);
    }


    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }



}
