/**
 * Created by vig on 10/10/16.
 */
public class Main {
    public static void main(String[] args) {
        char c = '\u4654';
        /*String str = "abc";
        str += "def";

        String str2 = "abc"; //new String ("abc");
        new String("abc");

        StringBuilder sb = new StringBuilder();
        sb.append(true);
        sb.append(26L);
        sb.append('c');
        System.out.println(sb.toString());*/

        int i = 0;
        /*i += 1;
        i = i + 1; //getAccountById(i) + getAccountById(i += 1)
        int c = 0 + // i += 1 + i += 1;*/

        //         0    1
        //     r = ((0) + (1 + 0)); i = i + 1 = 1 +1;
        int r = i++ + ++i;
        System.out.println(r);
        System.out.println(i);

        //     r = ((0) + (1 + 0)); i = i + 1 = 1 +1;
        int r = i++ + ++i;
        System.out.println(r);
        System.out.println(i);

        /*i++; //Postfix
        ++i; //Prefix*/

        /*
        int sum = getAccountById(i) + getAccountById(++i)
        int sum = getAccountById(i++) + getAccountById(i)
        */

        int a = 7, b = 8, c = 9;

        boolean bool = Math.max(a, Math.max(b, c));

        // Part 2
        /*if(logical) {
            int i = 0;
            i++;
            }
        */
        int a = 9;
        int b = 10;
        if (a < b) {
            System.out.println(">");
        } else if (a == b) {
            System.out.println("=");
        } else {
            System.out.println("<");
        }
        int result;
        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        result = Math.max(a, Math.max(b, c));
        result = a > b ? a : b; // тернарный оператор(ternary operator)

        int i = 9;
        switch (i) {
            case 0:
                System.out.println("a");
                System.out.println("b");
                break;
            case 9:
                System.out.println("9");
                break;
            default:
                System.out.println("d");
                break;
        }
    }
}

