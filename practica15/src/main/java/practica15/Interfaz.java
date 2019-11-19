package practica15;

import java.util.stream.Stream;
import java.util.List;
import java.util.function.Supplier;
import java.util.Comparator;
 
public class Interfaz {
//3
    public static Stream<String> ordenadas (List<String> lista) {
        return lista.stream()
                    .sorted(Comparator.comparingInt(String::length));
    }
    
    public static Steam 
    public static Stream<String> piramide (String s) {
        return Stream.generate(new Supplier<String>(){
            int i = 0;
            public String get() {
                return s.repeat(i++);            
            }
        });
    }
}