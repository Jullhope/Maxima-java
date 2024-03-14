import java.util.Scanner;

public class Main {
    /**
     * Объявите переменные типа int, byte, short, long, float, double, char, boolean.
     *
     * Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
     *
     * Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
     */
    public static void firstTask() {
        int myInteger = 0;
        byte myByte = 0;
        short myShort = 0;
        long myLong = 0l;
        float myFloat = 0.0f;
        double myDouble = 0.0;
        char myCharacter = 'A';
        boolean myBoolean = false;

        System.out.println("Значение переменной myInteger с типом int равно " + myInteger);
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);
        System.out.println("Значение переменной myShort с типом short равно " + myShort);
        System.out.println("Значение переменной myLong с типом long равно " + myLong);
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
        System.out.println("Значение переменной myCharacter с типом char равно " + myCharacter);
        System.out.println("Значение переменной myBoolean с типом boolean равно " + myBoolean);
    }

    /**
     * На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
     *
     * Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
     */
    public static void secondTask() {
        int totalCans = 120;
        int whitePerClass = 2;
        int brownPerClass = 4;

        int classes = totalCans / (whitePerClass + brownPerClass);

        int whiteCans = classes * whitePerClass;
        int brownCans = classes * brownPerClass;

        System.out.println("В школе, где " + classes + " классов, нужно " + whiteCans +
                " банок белой краски и " + brownCans + " банок коричневой краски.");
    }

    /**
     *  К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
     *
     * Маша получает 67 760 рублей в месяц.
     * Денис получает 83 690 рублей в месяц.
     * Кристина получает 76 230 рублей в месяц.
     * Каждому нужно увеличить зарплату на 10% от текущей месячной. Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
     *
     * Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
     */
    public static void thirdTask() {
        int mashasIncome = 67760;
        int danIncome = 83690;
        int cristyIncome = 76230;

        int mashaNewIncome = (int)(mashasIncome * 1.1);
        int danNewIncome = (int)(danIncome * 1.1);
        int crisNewIncome = (int)(cristyIncome * 1.1);

        System.out.println("Маша теперь получает " + mashaNewIncome + " рублей. Годовой доход вырос на " +
                (mashaNewIncome - mashasIncome) * 12 + " рублей.");
        System.out.println("Денис теперь получает " + danNewIncome + " рублей. Годовой доход вырос на " +
                (danNewIncome - danIncome) * 12 + " рублей.");
        System.out.println("Кристина теперь получает " + crisNewIncome + " рублей. Годовой доход вырос на " +
                (crisNewIncome - cristyIncome) * 12 + " рублей.");

    }

    /**
     *  Человек одевается в зависимости от температуры воздуха. Напишите программу, которая выводит сообщение:
     *
     * «На улице холодно, нужно надеть шапку» — если температура ниже 5 градусов.
     * «Сегодня тепло, можно идти без шапки» — если температура воздуха выше 5 градусов.
     * При выполнении каждого условия выведите в консоль: «На улице … градусов, (вывести в зависимости от результата) нужно надеть шапку / можно идти без шапки».
     */

    public static void forthTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Текущая температура");
        float temp = scanner.nextFloat();
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    /**
     *  (Switch) Напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит. Например, 1-й месяц (он же январь) принадлежит к сезону зима.
     *
     * Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
     * Пропишите условие, при котором программа не будет выполняться (номер месяца больше 12).
     */

    public static void fifthTask() {
        int monthNumber = 12;
        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = "в году 12 месяцев!";
        }

        System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону " + season + ".");
    }

    /**
     *  Выведите в консоль все четные числа от 0 до 17 с помощью цикла. (использовать в теле цикла вложенное условие if с проверкой, что остаток от деления на 2 равен нулю)
     */
    public static void sixthTask() {
        for (int i = 0; i < 18; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /**
     *   С помощью цикла for выведите в консоль все числа от 10 до 1.
     */
    public static void seventhTask() {
        for (int i = 10; i != 0; i--) {
            System.out.println(i);
        }
    }

    public static void eightTask() {
        int rublesInWallet = 0;
        int month = 0;
        while (rublesInWallet <  2459000) {
            ++month;
            rublesInWallet+=15000;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + rublesInWallet +" рублей");
    }

    public static void main(String[] args) {
        System.out.println("First Task:\n");
        firstTask();
        System.out.println("\n\n\nSecond Task:\n");
        secondTask();
        System.out.println("\n\n\nThird Task:\n");
        thirdTask();
        System.out.println("\n\n\nForth Task:\n");
        forthTask();
        System.out.println("\n\n\nFifth Task:\n");
        fifthTask();
        System.out.println("\n\n\nSixth Task:\n");
        sixthTask();
        System.out.println("\n\n\nSeventh Task:\n");
        seventhTask();
        System.out.println("\n\n\nEight Task:\n");
        eightTask();
    }
}