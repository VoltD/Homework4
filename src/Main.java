public class Main {
    public static void main(String[] args) {
        // Task 1
        int age = 17;
        if (age > 0 && age < 18)
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        if (age >= 18)
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");

        // Task 2
        int temp = 5;
        if (temp < 5)
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        else
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");

        // Task 3
        int speed = 61;
        if (speed > 60)
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        else
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");

        // Task 4
        int ageOfMan = 25;
        if (ageOfMan >= 2 && ageOfMan <= 6)
            System.out.println("Если возраст человека равен " + ageOfMan + ", то ему нужно ходить в детский сад");
        else if (ageOfMan >= 7 && ageOfMan <= 17)
            System.out.println("Если возраст человека равен " + ageOfMan + ", то ему нужно ходить в школу");
        else if (ageOfMan >= 18 && ageOfMan <= 24)
            System.out.println("Если возраст человека равен " + ageOfMan + ", то ему нужно ходить в университет");
        else if (ageOfMan > 24)
            System.out.println("Если возраст человека равен " + ageOfMan + ", то ему нужно ходить на работу");

        // Task 5
        int ageOfChild = 15;
        if (ageOfChild > 0 && ageOfChild < 5)
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему нельзя кататься на аттракционе");
        else if (ageOfChild >= 5 && ageOfChild <= 14)
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе в сопровождении");
        else
            System.out.println("Если возраст ребенка равен " + ageOfChild + ", то ему можно кататься на аттракционе без сопровождения взрослого");

        // Task 6
        int numberOfPlace = 15;
        if (numberOfPlace > 0 && numberOfPlace <= 60)
            System.out.println("Номер места равен " + numberOfPlace + ". Это сидячее место.");
        else if (numberOfPlace > 60 && numberOfPlace <= 102)
            System.out.println("Номер места равен " + numberOfPlace + ". Это стоячее место.");
        else
            System.out.println("Номер места равен " + numberOfPlace + ". Вагон забит.");

        // Task 7
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two)
            if (one > three)
                System.out.println("Большее one: " + one);
            else
                System.out.println("Большее three: " + three);
        else if (two > three)
            System.out.println("Большее two: " + two);
        else
            System.out.println("Большее three: " + three);
    }
}