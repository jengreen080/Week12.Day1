public class Printer {
    private int numberOfSheetsLeft;
    private int tonerVolume;

    public Printer(int numberOfSheetsLeft, int tonerVolume){
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheetsLeft() {
        return this.numberOfSheetsLeft;
    }

    public int getTonerVolume() {
        return this.tonerVolume;
    }

    public void addPaper(int numberOfPages) {
        this.numberOfSheetsLeft += numberOfPages;
    }

    public void reducePaper(int numberOfPages) {
        this.numberOfSheetsLeft -= numberOfPages;
        this.tonerVolume -= numberOfPages;
    }

    public void print(int numberOfPagesToPrint) {
        if (numberOfPagesToPrint <= this.numberOfSheetsLeft) {
            reducePaper(numberOfPagesToPrint);
        }

    }
}
