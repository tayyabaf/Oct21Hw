package genericclasses;

class PairOneTypeParameter<T> {
    private T first;
    private T second;

    public PairOneTypeParameter(T first, T second) {
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

class PairTwoTypeParameters<T, S>{
    private T first;
    private S second;

    public PairTwoTypeParameters(T first, S second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "paramterizedclasses.PairTwoTypeParameters{" +
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
        return "paramterizedclasses.Student{" +
                "age=" + age +
                ", percentile=" + percentile +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Notes {
    public static void main(String[] args) {
        PairOneTypeParameter<String> stringPair = new PairOneTypeParameter<>("Tayyaba", "Farooq");
        PairOneTypeParameter<Double> doublePair = new PairOneTypeParameter<>(23.5, 98.3);
        System.out.println(stringPair);
        System.out.println(doublePair);
        PairOneTypeParameter<Student> students = new PairOneTypeParameter<>(new Student(17, 65.5, 'F', "Susan"), new Student(19, 99.9, 'F', "Daphne"));
        System.out.println(students);

        PairTwoTypeParameters<String, Integer> stringAndIntegerPair = new PairTwoTypeParameters<>("Hello", 98);
        System.out.println(stringAndIntegerPair);
        Student student1 = new Student(15, 45.6, 'M', "John");
        Student student2 = new Student(16, 67.6, 'F', "El");
        PairTwoTypeParameters<Student, Student> studentPairTwoTypeParameters = new PairTwoTypeParameters<>(student1, student2);
        System.out.println(studentPairTwoTypeParameters);


    }
}
