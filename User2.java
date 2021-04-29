public class User2 {
    public String first_name;
    public String last_name;

    //El constructor:
    public User2(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    }
    public void fullname() {
        System.out.println(first_name + "" + last_name);
    }
}
public class Example {

    public static void main(String[] args) {

        User usuario_1 = new User("Dregan", "Ganon");
        User usuario_2 = new User("Elely", "Walsh");

        usuario_1.fullname();
        usuario_2.fullname();
    }
}
