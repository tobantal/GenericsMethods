package GenericsMethods;

public class GenericsMethods {
    public <T> void getClassName(T object) {
        System.out.println(object.getClass().getName());
    }

    public static void main(String[] args) {
        GenericsMethods gm = new GenericsMethods();
        gm.getClassName("abc");
        gm.getClassName(1);
        gm.getClassName(1.0);
        gm.getClassName(1.0f);
        gm.getClassName('c');
        gm.getClassName(gm);
    }
}