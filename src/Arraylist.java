import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Sam");
        names.add("Tom");
        System.out.println("After add :" + names);
        names.remove("Ram");
        System.out.println("After remove:"+names);
    }
}
