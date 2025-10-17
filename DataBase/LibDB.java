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
    // 컨스트럭터 생성
    public LibDB(){
        this.db = new ArrayList<T>();
    }
    //ArrayList를 참조한 Pirvate 형태의 변수 db정의 
    private ArrayList<T> db;
    
    public void addElement(T element){
        db.add(element);//db요소에 element 파라메터 추가
    }
    
    public String findElement(String s){
        //이터레이터로 반복작업 써야함
        Iterator<T> it = db.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    
    public void printAllElements(){
        //for each문 사용하기
    }
}
