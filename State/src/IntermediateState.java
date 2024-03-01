public class IntermediateState extends State{
    final  int EXPERT_LEVEL = 7;
    final int INTERMEDIATE_LEVEL = 2;
    final double INTERMEDIATE_HEALTH = 1.0;
    public IntermediateState(GameCharacter gameCharacter) {
        super(gameCharacter);
    }

    @Override
    void action() {
        System.out.println("\nYou are LEVEL" + this.getGameCharacter().getLevel() + " in the Intermediate state. You can only Train and Meditate.");
        String[] options = {"Train", "Meditate"};
        switch (this.getGameCharacter().readUserChoice(options)){
            case 1:
                System.out.println("You have gained increment of level " + INTERMEDIATE_LEVEL + "!");
                this.getGameCharacter().addLevel(INTERMEDIATE_LEVEL);
                break;

            case 2:
                System.out.println("You have gained HP " + INTERMEDIATE_HEALTH + "!");
                this.getGameCharacter().addHealth(INTERMEDIATE_HEALTH);
                break;
        }
        this.getGameCharacter().getStats();

        if (this.getGameCharacter().getLevel() == EXPERT_LEVEL) {
            this.getGameCharacter().setState(new ExpertState(this.getGameCharacter()));
        }
    }
}
