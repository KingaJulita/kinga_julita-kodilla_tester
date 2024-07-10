public class User {

    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public static void main (String[] args) {

        User Ewelina = new User("Ewelina", 29);
        User Michal = new User("Michał", 27);
        User Barbara = new User("Barbara", 52);
        User Irena = new User("Irena", 80);
        User Konrad = new User("Konrad", 28);
        User Stefan = new User("Stefan", 8);

        User[] users = {Ewelina, Michal, Barbara, Irena, Konrad, Stefan};

        System.out.println("Osoby poniżej średniej wieku to" + User.checkUser(users));

    }
    public static double averAge (User[] users) {
        int ageSum = 0;
        for (int i = 0; i < users.length; i++) {
            ageSum = ageSum + users[i].age;
        }
        return (double) ageSum/users.length;
    }
    public static String checkUser (User[] users) {
        String youngestName = "";

        for (int i =0; i < users.length; i++){
            int usersAge = users[i].age;
            double averAge = User.averAge(users);
            if (usersAge < averAge) {
                youngestName = users[i].name;
            }
        }
        return youngestName;
    }
}