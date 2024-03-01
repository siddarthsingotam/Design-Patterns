public class MasterState extends State{

    public MasterState(GameCharacter gameCharacter) {
        super(gameCharacter);
    }

    @Override
    void action() {
        System.out.println("\nYou have become a Master now!");
        this.getGameCharacter().getStats();
        this.getGameCharacter().gameOver();
        this.getGameCharacter().clearStats();
        this.getGameCharacter().setState(null);

    }
//    Note the game ends here after the change of multiple states in character here.
}
