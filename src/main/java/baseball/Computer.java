package baseball;

public class Computer {

    private final int position;
    private final int number;

    public Computer(int position, int number) {
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
