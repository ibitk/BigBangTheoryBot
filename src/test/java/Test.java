public class Test {

    public static void main(String[] args) {
        Integer integer = Integer.valueOf("3");
        System.out.println(integer
                .getClass().isPrimitive());
    }

}
