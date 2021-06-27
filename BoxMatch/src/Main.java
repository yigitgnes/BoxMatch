public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Floyd Mayweather", 15, 120, 85,40);
        Fighter f2 = new Fighter("Conor McGregor", 20, 90, 85,30);

        Match match = new Match(f1, f2, 85,100);
        match.run();
    }
}
