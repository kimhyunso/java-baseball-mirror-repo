package baseball;

public class Player {
    private final int position;
    private final int number;

    public Player(int position, int number) {
        this.position = position;
        this.number = number;
    }
    public int getPosition() {
        return position;
    }
    public int getNumber() {
        return number;
    }
}
