public class MyProgram {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(10, "hello", 1994);
        System.out.println(v.get_speed());
        System.out.println(v.get_owner());
        System.out.println(v.get_year());
    }
}


