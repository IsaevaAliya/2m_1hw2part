public class Main {

    public static Parent createObject(String className) {
        switch (className) {
            case "ChildOne":
                return new ChildOne(1, "ExampleName");
            case "ChildTwo":
                return new ChildTwo(2, 123.45);
            case "ChildThree":
                return new ChildThree(3, true);
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        // Создание объектов с помощью метода createObject
        Parent obj1 = createObject("ChildOne");
        Parent obj2 = createObject("ChildTwo");
        Parent obj3 = createObject("ChildThree");

        // Создание массива объектов
        Printable[] objects = { (Printable) obj1, (Printable) obj2, (Printable) obj3 };

        // Вызов метода print для каждого объекта
        for (Printable obj : objects) {
            obj.print();
        }
    }
}
