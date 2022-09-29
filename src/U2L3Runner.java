public class U2L3Runner {
    public static void main(String[] args) {
        Game game = new Game();
        game.addPlayer(9);
        game.increaseScore(10293);
        System.out.println("Number of Players: " + game.getPlayers());
        System.out.println("Score: " + game.getScore());
        System.out.println("Avg score per player: " + game.averageScorePerPlayer());


    }
}
