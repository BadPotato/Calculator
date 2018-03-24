/**
 * Created by Анна on 17.03.2018.
 */
public class Calculator {

    public static int calc(int num1, int num2, char operation){
        int result;

        switch (operation){
            case '+':
                result = 2+num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, Check.getOperation());
        }
        return result;
    }

}
