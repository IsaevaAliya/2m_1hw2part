public class ChildOne extends Parent implements Printable {
    private String name;

    public ChildOne(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ChildOne{name='" + name + "', " + super.toString() + "}";
    }
}
