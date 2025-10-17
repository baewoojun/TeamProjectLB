package DataBase;
import Myclass.*;
import java.util.*;
/**
 * 여기에 LibDB 클래스 설명을 작성하십시오.
 * 
 * @author (2022320035_배우준) 
 * @version (25.10.17)
 */
public class LibDB<T extends DB_Element>
{
    //ArrayList를 참조한 Pirvate 형태의 변수 db정의 
    private ArrayList<T> db;
    
    // 리턴값 없음, db 요소를 추가하는 파라메터 1개
    public void addElement(T element){
        
    }
    
    public String findElement(){
        //이터레이터로 반복작업 써야함
        return()
    }
    
    public void printAllElements(){
        //for each문 사용하기
    }
}
