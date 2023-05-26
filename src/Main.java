public class Main {
    public static void main(String[] args) {
        // Задача № 1
        byte age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age +
                    " лет, возраст совершеннолетия достигнут, водить можно!");
        } else {
            System.out.println("Если возраст человека равен " + age +
                    " лет, возраста совершеннолетия нет, нужно немного подождать, водить нельзя!");
        }
        // Задача № 2
        byte temperatura = 25;
        if (temperatura < 10) {
            System.out.println("На улице " + temperatura + " градусов, нужно одеть шапку.");
        } else {
            if (temperatura >= 20) {
                System.out.println("На улице " + temperatura + " градуса/ов, можно идти без шапки.");
            }
        }
        // Задача № 3
        byte driver = 70;
        if (driver > 60) {
            System.out.println("Если скорость больше " + driver + " км/ч, то придется заплатить штраф.");
        } else if (driver <= 60) {
            System.out.println("Если скорость меньше или равно " + driver + " км/ч, то можно ехать спокойно.");
        }
        // Задача № 4
        byte ege2 = 5;
        if (ege2 < 2) {
            System.out.println("Если возраст человека равен " + ege2 + " год, то ему пора спать.");
        }
        if (ege2 > 2 && ege2 < 6) {
            System.out.println("Если возраст человека равен " + ege2 + " года/лет, то ему нужно ходитиь в детский сад.");
        }
        if (ege2 > 7 && ege2 < 18) {
            System.out.println("Если возраст человека равен " + ege2 + " года/лет, то ему нужно ходитиь в школу.");
        }
        if (ege2 > 18 && ege2 < 24) {
            System.out.println("Если возраст человека равен " + ege2 + " года/лет, то ему нужно ходитиь в университет.");
        }
        if (ege2 > 24 && ege2 < 60) {
            System.out.println("Если возраст человека равен " + ege2 + " года/лет, то ему пора ходить на работу.");
        }
        if (ege2 > 60) {
            System.out.println("Если возраст человека равен " + ege2 + " года/лет, то он может отдохнуть.");
        }
        // Задача № 5
        byte ege3 = 4;
        if (ege3 < 5) {
            System.out.println("Если возраст ребёнка равен " + ege3 +
                    " года/лет. Извини, друг, но тебе нелизя кататься на карусели.");
        }
        if (ege3 > 5 && ege3 < 14) {
            System.out.println("Если возраст ребёнка равен " + ege3 +
                    " лет, то он может кататься на карусели только в сопровождении взрослого.");
            System.out.println("Если нет взрослого, то кататься нельзя.");
        }
        if (ege3 > 14) {
            System.out.println("Ты самостоятельный человек и можешь кататься без сопровождения взрослого.");
        }
        // Считаю что при решении задач № 4 и 5 конструкция if else не требуется.
        // Задача № 6
        byte maxVagon = 102;
        int stMest = maxVagon - 60;
        byte szmestvVagone = 60;
        byte mestovVagonne = 42;
        if (mestovVagonne < stMest) {
            System.out.println("Стоячее место есть.");
        } else {
            System.out.println("Стоячих мест нет.");
        }
        byte mestovVagonne2 = 55;
        if (mestovVagonne2 < szmestvVagone) {
            System.out.println("Сидячее место есть.");
        } else {
            System.out.println("Сидячих мест нет.");
        }
        // Задача № 7
        byte a = 1 ;
        byte b = 2 ;
        byte c = 3 ;
        if (a < b && b < c) {
            System.out.println("c - самое большое число.");
        } else {
            if (a > b && a > c) {
                System.out.println("a - самое большое число.");
            } else {
                if (b > a && b > c) {
                    System.out.println("b - самое большое число.");
                }
            }
        }
        // Задача № 7 решена без учёта возможности равенства значений объявленных переменных.
    }
}
