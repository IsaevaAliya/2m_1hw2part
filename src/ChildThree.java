public class ChildThree extends Parent implements Printable {
    private final boolean isActive;

    public ChildThree(int id, boolean isActive) {
        super(id);
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    @Override
    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "ChildThree{isActive=" + isActive + ", " + super.toString() + "}";
    }
}
