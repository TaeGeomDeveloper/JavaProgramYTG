package code.java.book;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/*
        Date 타입 참고
        private Date day = new Date();
        private SimpleDateFormat publishDate = new SimpleDateFormat("yyyy년 MM월 dd일");

 */

public class BookStore {
    ArrayList<BookData> list = new ArrayList<BookData>();

    public static void main(String[] args) {
        BookStore bs = new BookStore();
        bs.readyBooks();
        bs.displayBooks();
        bs.findBooks();
    }

    public void readyBooks(){
        list.add(new BookData("1.홍길동",5000,"의적", new SimpleDateFormat("2000년 2월 11일")));
        list.add(new BookData("2.김일성",10000,"625", new SimpleDateFormat("2012년 7월 11일")));
        list.add(new BookData("3.김정일",20000,"북한",new SimpleDateFormat("2021년 12월 11일")));
        list.add(new BookData("4. 번째",30000,"남한",new SimpleDateFormat("2011년 12월 11일")));
        list.add(new BookData("5. 번째",40000,"남한",new SimpleDateFormat("2012년 12월 11일")));
        list.add(new BookData("6. 번째",50000,"남한",new SimpleDateFormat("2013년 12월 11일")));
        list.add(new BookData("7. 번째",60000,"남한",new SimpleDateFormat("2014년 12월 11일")));
        list.add(new BookData("8. 번째",70000,"남한",new SimpleDateFormat("2015년 12월 11일")));
        list.add(new BookData("9. 번째",80000,"남한",new SimpleDateFormat("2016년 12월 11일")));
        list.add(new BookData("10. 번째",90000,"남한",new SimpleDateFormat("2018년 12월 11일")));
    }
    public void findBooks(){
        System.out.println("\n책 제목 : "+list.get(0).getTitle()+" 가격 : "+list.get(0).getPrice());
    }
    public void displayBooks(){
        for(int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i).toString());
        }
    }

}
