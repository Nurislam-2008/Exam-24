//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant(new Emloyee[]{});
        salary(accountant);
            }
            public static void salary (Accountant accountant){
                Scanner scanner = new Scanner(System.in);
                int number = 100;
                while (number != 0){
                    System.out.println("""
                1. Добавить нового сотрудника
                2. Рассчитать зарплату для всех сотрудников
                3. Показать информацию о сотрудниках
                4. Калькулятор для дополнительных расчетов
                0. Выход
                """);
                    number = scanner.nextInt();
                    switch (number) {
                        case 1:
                            accountant.addEmployee();
                            break;
                        case 2:
                            accountant.displayInfo();
                            break;
                        case 3:
                            System.out.println();
                            break;
                        case 4:
                            System.out.println("Введите символ! + , - , *, / ");
                            String symbol = scanner.next();
                            System.out.println("Введите 1 число!");
                            int num1 = scanner.nextInt();
                            System.out.println("Введите 2 число!");
                            int num2 = scanner.nextInt();
                            switch (symbol){
                                case "+":
                                    System.out.println(num1 + num2);
                                    break;
                                case "-":
                                    System.out.println(num1 - num2);
                                    break;
                                case "*":
                                    System.out.println(num1 * num2);
                                    break;
                                case "/":
                                    System.out.println(num1 / num2);
                                    break;
                            }
                                case 0:
                                    if (number==0){
                                    break;                }
                    }
                }
            }
        }





