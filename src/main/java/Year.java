public class Year {
    private final int value;

    public Year(int i) {
        this.value = i;
    }

    public boolean isLeap() {
        if (value % 400 == 0) {
            return true;
        }

        if (value % 100 == 0) {
            return false;
        }

        return value % 4 == 0;
    }
}
