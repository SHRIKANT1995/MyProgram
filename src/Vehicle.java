public class Vehicle {
    public Vehicle(int s, String o, int y) {
        speed = s;
        owner = o;
        year = y;
    }
    public void set_speed(int s) throws Exception { speed = s; }
    public int get_speed() { return speed; }
    public String get_owner() { return new String(owner); }
    public int get_year() { return year; }
    protected String owner;
    protected int speed;
    protected int year;
}
