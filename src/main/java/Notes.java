class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

class Student{
    private int age;
    private double percentile;
    private char gender;
    private String name;

    public Student(int age, double percentile, char gender, String name) {
        this.age = age;
        this.percentile = percentile;
        this.gender = gender;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", percentile=" + percentile +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Notes {
    public static void main(String[] args) {
        Pair<String> stringPair = new Pair<>("Tayyaba", "Farooq");
        Pair <Double> doublePair = new Pair<>(23.5, 98.3);
        System.out.println(stringPair);
        System.out.println(doublePair);


        Pair<Student> students = new Pair<>(new Student(17, 65.5, 'F', "Susan"), new Student(19, 99.9, 'F', "Daphne"));
        System.out.println(students);



    }
}
