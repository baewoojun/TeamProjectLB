<<<<<<< HEAD
<<<<<<< HEAD
package Myclass;


/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Book
{
    // 인스턴스 변수 - 다음의 예제를 사용자에 맞게 바꾸십시오
    private int x;

    /**
     * Book 클래스의 객체 생성자
     */
    public Book()
    {
        // 인스턴스 변수의 초기화
        x = 0;
    }

    /**
     * 예제 메소드 - 이 주석을 사용자에 맞게 바꾸십시오
     * 
     * @param  y   메소드의 예제 매개변수
     * @return     x 더하기 y 
     */
    public int sampleMethod(int y)
    {
        // 여기에 코드를 작성하십시오.
        return x + y;
    }
}
=======
package Myclass;


/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (작성자 이름) 
 * @version (버전번호나 날짜)
 */
public class Book
{
    private String author();
    
    private String BookID();
    
    private String publisher();
    
    private String title();
    
    private int year();
    
}
>>>>>>> d06616792c3ec6993fa8157ddfacea853f94e15c
=======
package Myclass;

/**
 * 여기에 Book 클래스 설명을 작성하십시오.
 * 
 * @author (2022320035_배우준) 
 * @version (25.10.17)
 */
public class Book extends DB_Element
{   //Book 속성 5개
    private String author;
    private String BookID;
    private String publisher;
    private String title;
    private int year;
    
    //컨스트럭터 생성 (파라메터 5개)
    public Book(String BookID, String title, String author, String publisher,
    int year)
    {
        this.author = author;
        this.BookID = BookID;
        this.publisher = publisher;
        this.title = title;
        this.year = year;
    }

    //getID()에서 BookID 값 리턴
    public String getID()
    {
        return BookID;
    }

    //오버라이딩 과정 ()
    public String toString()
    {
        return"(" + BookID + ")"+ title+"," + author+","+publisher+","+ year;
    }
}
>>>>>>> 89700f327c8754c44bd7b095f2da2685a1316c57
