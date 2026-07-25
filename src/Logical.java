public class Logical {
    public static void main(String[] args) {
        boolean isStudent=true;
        boolean hasId = false;
        System.out.println("And= " + (isStudent&& hasId));
        System.out.println("or= " + ( isStudent|| hasId));
        System.out.println("Logical not = " + !(isStudent));
        System.out.println("Logical not = " + !(hasId));
    }
}