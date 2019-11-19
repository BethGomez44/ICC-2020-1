package practica15;

import java.util.Arrays; 
import java.util.stream.Stream;
import java.util.List;
import java.util.function.Supplier;
import java.util.Comparator;

public class Prueba {

    public static void main(String[] args) {
        List<String> nueva = List.of("a", "abc", "", "ab");
        Interfaz.ordenada(nueva)
                .forEach(System.out::println);
    }
}