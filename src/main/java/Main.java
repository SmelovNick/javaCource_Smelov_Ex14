import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<House> house = getHouse();

        System.out.println("Вывод коллекции, отсортированной в прямом порядке");

        house.stream()
                .sorted(Comparator.comparing(House::getAddress)
                .thenComparing(House::getYear)
                .thenComparing(House::getApartmentsCount)
                .thenComparing(House::getEntranceCount)).forEach(System.out::println);

        System.out.println("\nВывод коллекции, отсортированной в обратном порядке");

        house.stream()
                .sorted(Comparator.comparing(House::getAddress)
                        .thenComparing(House::getYear)
                        .thenComparing(House::getApartmentsCount)
                        .thenComparing(House::getEntranceCount).reversed()).forEach(System.out::println);

        System.out.println("\nВывод списка домов, построенных до 2000 года");

        house.stream().filter(p -> p.getYear() <2000).forEach(System.out::println);

        System.out.println("\nВывод домов, сгруппированных по архитектурным стилям");

        Map<String, List<House>> houseMap = house.stream()
                .sorted(Comparator.comparing(House::getStyle)
                        .thenComparing(House::getAddress)
                        .thenComparing(House::getYear)
                        .thenComparing(House::getApartmentsCount)
                        .thenComparing(House::getEntranceCount))
                .collect(Collectors.groupingBy(House::getStyle));
        houseMap.forEach((s, h) -> {
            System.out.println(s);

            h.forEach(System.out::println);
        });

        System.out.println("\nВывод дома с максимальным количеством этажей");

        house.stream().max(Comparator.comparing(House::getFloorCount)).ifPresent(System.out::println);

        System.out.println("\nВывод дома с минимальным количеством этажей");

        house.stream().min(Comparator.comparing(House::getFloorCount)).ifPresent(System.out::println);

        System.out.println("\nВсе дома в коллекции построены в стиле ампир: " + house.stream().allMatch(p -> p.getStyle().equals("ампир")));
        System.out.println("В коллекции есть дома с одним подъездом: " + house.stream().anyMatch(p -> p.getEntranceCount() == 1));
        System.out.println("В коллекции нет домов старше 1965 года: " + house.stream().noneMatch(p -> p.getYear()<1965));
    }


    public static List<House> getHouse(){
        return Arrays.asList(new House("Ленина ул., д.35", 1979, 3, 110, 8, 2.7, "ампир"),
                new House("Чапаева ул., д.36",1980, 2, 99, 16, 2.7, "конструктивизм"),
                new House("Мира пр., д.121",2000, 5, 180, 8, 3.0, "ампир"),
                new House("Матросова ул., д.1",2021, 1, 180, 25, 3.0, "конструктивизм"),
                new House("Переверткина ул., д.15",2021, 4, 320, 10, 2.7, "модерн")
        );
    }
}
