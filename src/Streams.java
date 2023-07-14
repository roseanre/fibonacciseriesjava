import java.util.*;
import java.util.function.Predicate;
class Streams {
    public static void main(String[] args) {
        /*List<String> names=Arrays.asList("Anile","Ban","Chandu","Mani");
        Predicate<String> predi=(eachName) -> eachName.length()> 4;
        names.stream()
                .filter(predi)
                .forEach(name-> System.out.println(name));*/

        /*List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "Dave");

        names.stream()  //  stream source of the 
                .filter(eachName -> eachName.length() > 4)  // intermediate operation
                .forEach(name -> System.out.println(name));  // terminal operation */
        List<Integer> numbers=Arrays.asList(2,8,4,7,6);
        numbers.stream()
                .map(eachNumber ->eachNumber*2)
                .forEach(number -> System.out.println(number));
        

    }
}
