package OOPpart1;

public class InfoAboutMe {
    public static void main(String[] args) {
        Human Me = new Human("Vadim", "Zhdanov", 32);

        System.out.println(Me.Name + " " + Me.Surname);
        System.out.println(Me.age);
    }
}
