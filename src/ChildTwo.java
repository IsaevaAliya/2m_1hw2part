
public class ChildTwo extends Parent implements Printable {
    private double value;

    public ChildTwo(int id, double value) {
        super(id);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ChildTwo{value=" + value + ", " + super.toString() + "}";
    }
}
