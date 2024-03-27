
public class Main {
    public static void main(String[] args) {

        // Задача 1

        int[] expenses = {15695, 4503, 2678, 10984, 5501};
        int totalExpenses = 0;

        for (int expense : expenses) {
            totalExpenses += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpenses + " рублей.");

        // Задача 2

        int maxExpenses = 0;
        int minExpenses = expenses[0];

        for (int expense : expenses) {
            if (expense > maxExpenses) {
                maxExpenses = expense;
            }
            if (minExpenses > expense) {
                minExpenses = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExpenses
                + " рублей. Максимальная сумма трат за неделю составила " + maxExpenses
                + " рублей.");

        // Задача 3

        totalExpenses = 0;

        for (int expense : expenses) {
            totalExpenses += expense;
        }
        System.out.println("Средняя сумма трат за месяц составила "
                + (double) (totalExpenses / expenses.length) + " рублей");

        // Задача 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}