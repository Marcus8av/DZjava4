import java.util.Scanner;
import java.util.Stack;
public class dz3 {        // Добавляем в калькулятор возможность возврата последней операции.
    public static void main(String[] args) {
        String str_command = "";
        Scanner input = new Scanner(System.in);
        Stack<Float> stack = new Stack<>();

            System.out.printf("Калькулятор: %n");          
            System.out.printf("Введите первое число: ");
            float result = 0;
            float number1 = input.nextFloat();

        while (!str_command.equals("end")){
            stack.push(number1);
                
            System.out.printf("введите символ действия: (+,-,*,/) ");
            String choice = input.next();
    
            System.out.printf("Введите второе число: ");
            float number2 = input.nextFloat();

            switch (choice) {
            case ("+"):

                result = number1 + number2;
                break;

            case ("-"):
                result = number1 - number2;
                break;

            case ("*"):
                result = number1 * number2;
                break;

            case ("/"):
                result = number1 / number2;
                break;
        }

        System.out.printf("%f %s %f = %f \n",number1, choice, number2, result);
            number1 = result;

            System.out.println("Введите команду canc для возврата к предыдущему результату");
            System.out.println("Введите команду end для завершения работы");
            System.out.println("введите любой символ для продолжения работы");
            str_command = input.next();

            switch (str_command){
                case ("end"):
                    break;
                case ("canc"):
                    number1 = stack.pop();
                    System.out.printf("Возвращение к предыдущему результату \n");
                    System.out.printf("С этим результатом будем проводить операции: %f \n", number1 );
                    break;
                default:
                    System.out.printf("Результат: %f \n", number1 );
                    break;
            }          
        }
        input.close();
    }
}