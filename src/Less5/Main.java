package Less5;

public class Main {
    public static void checkValue(int x) {
        x = 15;
    }

    public static void checkReference (int[] x) {
        x[0] = 20;
    }

    public static void main(String[] args) {
        System.out.println("Test");

        Author melvel = new Author("Герман", "Мелвел");
        Author dostoevsky = new Author("Фёдор", "Достоевский");

        Book mobyDick = new Book("Моби Дик", melvel, 1850);
        Book CrimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1866);

        mobyDick.setPublicationYear(1851);

        int x = 0;
        int[] y = {0};
        System.out.println("\n Значение x до отработки функции " + x);
        System.out.println("\n Значение y[0] до отработки функции " + y[0]);

        checkValue(x);
        checkReference(y);

        System.out.println("\n Значение x после отработки функции " + x);
        System.out.println("\n Значение y[0] после отработки функции " + y[0]);
    }

}

