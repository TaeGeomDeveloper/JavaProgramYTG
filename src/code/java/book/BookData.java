package code.java.book;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class BookData {
    //ArrayList<BookData> list = new ArrayList<BookData>();
    private String author = "";
    private int price = 0;
    private String title = "";
    private Date day = new Date();
    private SimpleDateFormat publishDate = new SimpleDateFormat("yyyy년 MM월 dd일");

    public String getTitle(){
        return this.title;
    }
    public int getPrice(){
        return this.price;
    }

    public BookData(){}
    public BookData(String author, int price, String title, SimpleDateFormat date){
        this.author = author;
        this.price = price;
        this.title = title;
        this.publishDate = date;
    }

    @Override
    public String toString() {
        String spublishDate = publishDate.format(day);
        return "책 저자 : "+this.author+" / 책 제목 : "+this.title+" / 책 가격 : "+this.price+" / 출판일 : "+spublishDate;
    }
}
