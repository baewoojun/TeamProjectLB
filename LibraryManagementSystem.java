import Myclass.*;
import DataBase.*;
import java.util.*;
import java.io.*;
import java.lang.*;
/**
 * 여기에 LibraryManagementSystem 설명을 작성하십시오.
 * 
 * @author (2022320035_배우준) 
 * @version (25.10.17)
 */
public class LibraryManagementSystem
{
    // 요구 사항#4
    LibDB<Book> bookDB;
    HashMap<User, Book> loanDB;
    LibDB<User> userDB;
    
    public LibraryManagementSystem(){
        
    }
    
    
    
    public void borrowBook(String userID, String bookID){
    
    
    }
    
    // 데이터베이스의 모든 요소를 출력하는 제네릭 메소드
    public <T extends DB_Element> void printDB(LibDB<T> db){
        db.printAllElements();
    }
    
    // 대출 데이터에 저장된 요소를 바탕으로 대출 현황 출력
    public void printLoanList(Map<User, Book> LoadDB){
         
         
     }
    
    
    public LibDB<Book> setBookDB(String bookfile){
         
        return null;
     }
     
    
    public LibDB<User> setUserDB(String userfile){
         return null;
     }

}

