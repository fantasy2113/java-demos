package demos.java8.streams;

import java.util.List;
import java.util.stream.Stream;

import demos.java8.streams.model.Person;
import demos.java8.streams.model.PersonUtil;

public class TransformationDemo {

    public static void main(String[] args) {
        List<Person> persons = PersonUtil.getPersonList();

        // Mapping aller Personen auf ihrenen Vor- und Nachnamen
        persons.stream().map(p -> p.getFirstname() + " " + p.getName()).forEach(System.out::println);

        // Flattening der beiden Listen zu einem Stream
        Stream.of(PersonUtil.getPersonList(),
                PersonUtil.getOtherPersonList()
        ).flatMap(plist -> plist.stream()).forEach(System.out::println);

        // Flattening der vorher in eine Liste von Namen umgewandelten Streams
        Stream.of(PersonUtil.getPersonList(),
                PersonUtil.getOtherPersonList()
        ).flatMap(plist -> plist.stream().map(p -> p.getFirstname() + " " + p.getName())).forEach(System.out::println);


    }

}
