import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private int age;
    private String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [age=" + age + ", name=" + name + "]";
    }
}

class Base {
    public static void main(String[] args) {
        ArrayList<Student> people = new ArrayList<>();

        people.add(new Student(15, "Praveen"));
        people.add(new Student(27, "Surya"));
        people.add(new Student(18, "Sani"));
        people.add(new Student(8, "Ester"));

        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student p1, Student p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };

        Collections.sort(people, com);

        for (Student student : people) {
            System.out.println(student);
        }
    }
}
