package genericclasses.extendskeyword;
//Number is a built in class!!
class NumbersPair <T extends Number>{
    private T first;
    private T second;

    public NumbersPair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "NumbersPair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
public class Main {
    public static void main(String[] args) {
        //only allows child classes of Number to be used
        NumbersPair<Integer> integerNumbersPair = new NumbersPair<>(96,97);
        System.out.println(integerNumbersPair);

        NumbersPair<Double> doubleNumbersPair = new NumbersPair<>(44.5, 5.6);
        System.out.println(doubleNumbersPair);
    }
}
