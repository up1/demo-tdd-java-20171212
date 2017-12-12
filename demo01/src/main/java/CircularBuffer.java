public class CircularBuffer {

    private String[] buffer = new String[5];
    private int writePointer;
    private int readPointer;

    public boolean isEmpty() {
        return readPointer == writePointer;
    }

    public void write(String input) {
        buffer[writePointer++] = input;
    }

    public String read() {
        return buffer[readPointer++];
    }
}
