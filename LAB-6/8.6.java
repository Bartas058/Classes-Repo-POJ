class SafeArray {
    private int[] array;

    public SafeArray(int[] array) {
        this.array = array;
    }

    public int getElement(int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Index outside the scope of the array");
        }
        return array[index];
    }
}