package duke.tool;

/**
 * Represents emoji symbol class.
 */
public enum Emoji {

    CHICKEN(0x1F423),
    ERROR(0x1F616),
    SMILE(0x1F609);

    private final int code;

    /**
     * Constructs an emoji object.
     *
     * @param emoji unicode of the emoji.
     */
    Emoji(int emoji) {
        this.code = emoji;
    }

    /**
     * Gets the unicode of the emoji object.
     *
     * @return unicode of the emoji.
     */
    public int getCode() {
        return code;
    }

    @Override
    public String toString() {
        return new String(Character.toChars(this.code));
    }
}
