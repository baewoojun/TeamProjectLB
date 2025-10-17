import java.util.*;
import java.io.*;
/**
 * 여기에 App 클래스 설명을 작성하십시오.
 * 
 * @author (2022320035_배우준) 
 * @version (25/10/17)
 */
public class App
{
    public static void main(String[] args){
        LibDB<User> userDB = new LibDB<User>();
        LibDB<Book> bookDB = new LibDB<Book>();
        HashMap<User, Book> loanDB = new HashMap<User, Book>();
    }
}
