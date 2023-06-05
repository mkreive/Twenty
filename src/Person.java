public class Person {
    private String name;
    static int id = 0;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        id++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
