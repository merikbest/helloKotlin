package jav;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class HelloWorld {
    private static String string;



    public static void main(String[] args) {
        String nameOfMonth = "Март";
        String season;

        switch (nameOfMonth) {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                season = "Зима";
                break;
            case "Март":
            case "Апрель":
            case "Май":
                season = "Весна";
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                season = "Лето";
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                season = "Осень";
                break;
            default:
                season = "Не найдено";
        }
        System.out.println(season);
    }
}
