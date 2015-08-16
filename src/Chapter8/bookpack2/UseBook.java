package Chapter8.bookpack2;

/**
 * Created by ZhuangFang on 2015/7/22.
 */
class UseBook {
    public static void main(String[] args) {
        Chapter8.bookpack.Book books[] = new Chapter8.bookpack.Book[5];

        books[0] = new Chapter8.bookpack.Book("Java: A Beginner's Guide",
                "Schildt2",2014);
        books[1] = new Chapter8.bookpack.Book("Java: The Complete Reference",
                "Schildt2",2014);
        books[2] = new Chapter8.bookpack.Book("The Art of Java",
                "Schildt2 and Holmes",2003);
        books[3] = new Chapter8.bookpack.Book("Red Storm Rising",
                "Clancy2",1986);
        books[4] = new Chapter8.bookpack.Book("On the Road",
                "Kerouac2",1955);

        for(int i=0; i<books.length;i++) books[i].show();
    }
}
