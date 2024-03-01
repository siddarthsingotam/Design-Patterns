public abstract class State {
    private GameCharacter gameCharacter;

    public State(GameCharacter gameCharacter) {
        this.gameCharacter = gameCharacter;
    }

    public GameCharacter getGameCharacter() {
        return gameCharacter;
    }

    abstract void action();
}
