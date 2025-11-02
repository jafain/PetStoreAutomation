package api.test;

/*public class Main {
    public static void main(String[] args) {
        // Hämta systemegenskapen för användarens hemkatalog
        String userHomePath = System.getProperty("user.home");

        // Skriv ut värdet av användarens hemkatalog
        System.out.println("User home directory: " + userHomePath);
    }
}
*/

public class Main {
    public static void main(String[] args) {
        // Hämta systemegenskapen för användarens arbetskatalog
        String userDirPath = System.getProperty("user.dir");

        // Skriv ut värdet av användarens arbetskatalog
        System.out.println("User working directory: " + userDirPath);
    }
}