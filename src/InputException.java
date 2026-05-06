public class InputException extends Exception {
    public InputException(String message) {
        super(message);
    }

    public static InputException stringInput() {
        return new InputException("Invalid input, enter a String\n");
    }

    public static InputException intInput() {
        return new InputException("Invalid input, enter an Integer\n");
    }

    public static InputException doubleInput() {
        return new InputException("Invalid input, enter a Double\n");
    }
}
