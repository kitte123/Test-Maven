import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class client {
    public static void main(String[] args) {
        List<Person> names = new ArrayList<Person>();
        Person       person1=new Person();
        person1.setName("aa");
        person1.setSex("男");
        Person       person2=new Person();
        person2.setName("aa");
        person2.setSex("男");
        Person       person3=new Person();
        person3.setName("cc");
        person3.setSex("男");
        names.add(person1);
       names.add(person2);
        names.add(person3);

        List<Person> personNames = names.stream().map(p->{
            Person a=new Person();
            a.setName("fff");
            return  a;
        }).collect(Collectors.toList());

        personNames.forEach(name-> System.out.println(name.getName()));



        Map<String, String> personMap = names.stream().collect(Collectors.toMap(Person::getName, Person::getSex));
        personMap.forEach((key,value)-> System.out.println(key+"|"+value));



    }
}

