public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 18;
        if (age >= 18) {
            System.out.println("Если возвраст человека равен " + age + " ,то он совершеннолетний");
        } else {
            System.out.println("Если возвраст человека равен " + age + " ,то он не достиг совершеннолетия,нужно немного подождать");
        }
        System.out.println("Задача 2");
        int airTemperature = 10;
        if (airTemperature < 5) {
            System.out.println("На улице " + airTemperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + airTemperature + " градусов, можно идти без шапки");
        }
        System.out.println("Задача 3");
        int carSpeed = 61;
        if (carSpeed > 60) {
            System.out.println("Если скорость " + carSpeed + " , то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + carSpeed + " , то можно ездить спокойно");
        }
        System.out.println("Задача 4");
        int agePerson = 13;
        boolean goToKindergarten = agePerson >= 2 && agePerson <= 6;
        boolean goToSchool = agePerson >= 7 && agePerson <= 17;
        boolean goToUniversity = agePerson >= 18 && agePerson <= 24;
        boolean goToWork = agePerson > 24;
        if (goToKindergarten) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в детский сад");
        } else if (goToSchool) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в школу");
        } else if (goToUniversity) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить в университет");
        } else if (goToWork) {
            System.out.println("Если возраст человека равен " + agePerson + " , то ему нужно ходить на работу");
        }
        System.out.println("Задача 5");
        int childAge = 13;
        boolean prohibitedRidingOnRides = childAge < 5;
        boolean allowedRidingOnRidesWithAdults = childAge >= 5 && childAge < 14;
        if (prohibitedRidingOnRides) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему нельзя кататься на аттракционе");
        } else if (allowedRidingOnRidesWithAdults) {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + " , то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println("Задача 6");
        int passengersInCarriage = 13;
        int carriageCapacity = 102;
        int numberSeatsInCarriage = 60;
        boolean seatInCarriage = passengersInCarriage < numberSeatsInCarriage;
        boolean standingPlacesInCarriage = passengersInCarriage < carriageCapacity && passengersInCarriage >= numberSeatsInCarriage;
        if (seatInCarriage) {
            System.out.println("Если пассажиров в вагоне " + passengersInCarriage + " , то есть свободные сидячие и стоячие места");
        } else if (standingPlacesInCarriage) {
            System.out.println("Если пассажиров в вагоне " + passengersInCarriage + " , то есть свободные стоячие места");
        } else {
            System.out.println("Если пассажиров в вагоне " + passengersInCarriage + " , то свободных мест нет");
        }
        System.out.println("Задача 7");
        int one = 42;
        int two = 102;
        int three = 2;
        boolean oneIsTheMost = one > two && one > three;
        boolean twoIsTheMost = two > one && two > three;
        boolean threeIsTheMost = three > two || three > two;
        if (oneIsTheMost) {
            System.out.println("Из трех чисел: " + one + " , " + two + " , " + three + " самое большое число " + one);
        } else if (twoIsTheMost) {
            System.out.println("Из трех чисел: " + one + " , " + two + " , " + three + " самое большое число " + two);
        } else if (threeIsTheMost) {
            System.out.println("Из трех чисел: " + one + " , " + two + " , " + three + " самое большое число " + three);
        }


    }
}