package homeWork_2;

public enum SizeOfAviary {
    ULTRA_SMALL(10),
    SMALL(20),
    MEDIUM(40),
    LARGE(80);

    private int size;

    SizeOfAviary(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}