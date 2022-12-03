import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Objects;

public class Main {

        public static void main(String[] args) {
            Cat Boris = new Cat("Boris", "white", 2, 111);
            Cat Barsik = new Cat("Barsik", "Orange", 4, 222);
            Cat AktovianAugust = new Cat("AktovianAugust", "purple", 8,333);
            Cat Igor = new Cat("Igor", "black", 5,444);
            Cat Artyom = new Cat("Atryom", "black", 5,555);

            Set<String> Cat = new HashSet<>();
            Cat.add("Boris");
            Cat.add("Barsik");
            Cat.add("AktovianAugust");


            Set<String> Cat2 = new HashSet<>();
            Cat.add("Igor");
            Cat.add("Artyom");
            Cat.add("Boris");
            Cat.add("Barsik");
            Cat.add("Barsik");

            HashSet<String> union = new HashSet<>(Cat);
            union.addAll(Cat2);


            System.out.println(union);

            System.out.println(Cat.equals(Cat));

            System.out.println(Cat.hashCode());
            
        }
    }

