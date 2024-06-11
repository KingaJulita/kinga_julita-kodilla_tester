public class SimpleArray {
    public static void main(String[] args){
        String[] games = new String[5];
        games[0] = "Hogward Legacy";
        games[1] = "Assassin Creed: Ezio collection";
        games[2] = "Dark Souls III";
        games[3] = "Bloodborne";
        games[4] = "Uncharted";

        String game = games[3];

        int numberOfElements = games.length;{
            System.out.println(numberOfElements);
        }
    }
}
