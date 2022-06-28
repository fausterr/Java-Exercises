package GeekForGeeksOrazInne.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Conversion {
    public static void main(String[] args) {
        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Poland", 40000000));
        countries.add(new Country("Italy", 60000000));
        countries.add(new Country("Germany", 83000000));
        countries.add(new Country("Japan", 125000000));

        //List to Map
        Map<String, Integer> mapCountries =  countries.stream()
                .collect(Collectors
                        .toMap(Country::getName, Country::getPopulation));
        mapCountries.forEach((x, y) -> System.out.println("Country: " + x + ", Population: " + y));

        //Map to List
//        List<String> keys = mapCountries.keySet().stream()
//                .collect(Collectors.toCollection(ArrayList::new));
//        List<Integer> values = mapCountries.values().stream()
//                .collect(Collectors.toCollection(ArrayList::new));

        List<String> keys = new ArrayList<>(mapCountries.keySet());
        List<Integer> values = new ArrayList<>(mapCountries.values());
        keys.forEach(System.out::println);
        values.forEach(System.out::println);

        String word = "abcdefgh";
        stringToCharList(word).stream().forEach(character -> System.out.print(character + " "));


    }

    static List<Character> stringToCharList(String string) {
        List<Character> chars = new ArrayList<>();
        for(char c: string.toCharArray()) {
            chars.add(c);
        }
        return chars;
    }
}

class Country {
    String name;
    int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }
}
