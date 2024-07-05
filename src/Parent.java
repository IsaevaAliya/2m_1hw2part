public class Parent {
    private int id;

    public Parent(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Parent{id=" + id + "}";
    }
}

