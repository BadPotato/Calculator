
/**
 * Created by Анна on 17.03.2018.
 */
public class Program {

    public static void main(String[] args) {
        int num1 = Check.getInt();
        int num2 = Check.getInt();
        char operation = Check.getOperation();
        Calculator myclc = new Calculator();
        int result = myclc.calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }


}
