package hashequals;

public class MyClass {

    private Long id;
    private String name;

    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals is called: "+this+" : "+obj);
        MyClass other = (MyClass) obj; //приведем к типу
        return id.equals(other.id) && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode is called: "+this);
        return id.intValue(); //вернуть целое число
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
