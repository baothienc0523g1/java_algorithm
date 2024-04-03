package demo;

interface Readable {
    void readBook();
    void setBookMark();
}

abstract class Book implements Readable {
    public void readBook() {}
}

class EBook extends Book {
    public void readBook() {}

    @Override
    public void setBookMark() {

    }
}
