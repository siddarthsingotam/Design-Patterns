public class NoviceState extends State {
    final int INTERMEDIATE_LEVEL = 3;
    final int NOVICE_LEVEL = 1;

    public NoviceState(GameCharacter gameCharacter) {
        super(gameCharacter);
        this.getGameCharacter().clearStats();
    }

    @Override
    void action() {
        System.out.println("\nYou are LEVEL" + this.getGameCharacter().getLevel() + "in the Novice state. You can only Train. Press 1 to train.");
        String[] options = {"Train"};
        switch (this.getGameCharacter().readUserChoice(options)){
            case 1:
                System.out.println("You have gained increment of level " + NOVICE_LEVEL + "!");
                this.getGameCharacter().addLevel(NOVICE_LEVEL);
                break;

        }
        this.getGameCharacter().getStats();

        if (this.getGameCharacter().getLevel() == INTERMEDIATE_LEVEL) {
            this.getGameCharacter().setState(new IntermediateState(this.getGameCharacter()));
        }
    }
}
