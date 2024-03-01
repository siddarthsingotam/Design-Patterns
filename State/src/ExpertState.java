public class ExpertState extends State{
    final int MASTER_LEVEL = 13;
    final int EXPERT_LEVEL = 3;
    final double EXPERT_HEALTH = 2.0;
    final double EXPERT_POWER = 1.0;
    final double EXPERT_HEALTH_LOSS = 0.5;

    public ExpertState(GameCharacter gameCharacter) {
        super(gameCharacter);
    }

    @Override
    void action() {
        System.out.println("\nYou need LEVEL: " + MASTER_LEVEL + " for Master State. You can only Train and Meditate and fight now.");
        String[] options = {"Train", "Meditate", "Fight"};
        switch (this.getGameCharacter().readUserChoice(options)){
            case 1:
                System.out.println("You have gained increment of level " + EXPERT_LEVEL + "!");
                this.getGameCharacter().addLevel(EXPERT_LEVEL);
                break;

            case 2:
                System.out.println("You have gained HP " + EXPERT_HEALTH + "!");
                this.getGameCharacter().addHealth(EXPERT_HEALTH);

            case 3:
                System.out.println("You gained POWER:" + EXPERT_POWER + "and LEVEL:" + EXPERT_LEVEL + "and lost " + EXPERT_HEALTH_LOSS + "due to battle wounds.");
                this.getGameCharacter().addLevel(EXPERT_LEVEL);
                this.getGameCharacter().addPower(EXPERT_POWER);
                this.getGameCharacter().removeHealth(EXPERT_HEALTH_LOSS);
        }
        this.getGameCharacter().getStats();

        if (this.getGameCharacter().getLevel() == MASTER_LEVEL) {
            this.getGameCharacter().setState(new MasterState(this.getGameCharacter()));
        }
    }
}
