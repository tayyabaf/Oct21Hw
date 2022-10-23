package genericmethods;


public class Main {

    public static <T> void getItemAndPrint(T item){
        System.out.println(item );
    }

    public static <T, S> void getTwoItemsAndPrint(T item1, S item2){
        System.out.println(item1 +" "+  item2);
    }

    public static void main(String[] args) {
        getItemAndPrint(3);
        getTwoItemsAndPrint("Eggos", 48);
    }
}
