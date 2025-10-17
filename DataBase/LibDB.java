package DataBase;
import Myclass.DB_Element;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * 여기에 LibDB 클래스 설명을 작성하십시오.
 * 
 * @author (2022320035_배우준) 
 * @version (25.10.17)
 */
public class LibDB<T extends DB_Element>
{
    // ArrayList를 참조한 private 변수 db 정의
    private ArrayList<T> db;
    
    // 컨스트럭터 생성 
    public LibDB(){
        this.db = new ArrayList<T>();
    }
    
    //
    public void addElement(T element){
        db.add(element);
    }
    
    // findElement (String 반환을 보장하도록 수정)
    public String findElement(String s){
        Iterator<T> it = db.iterator();
        
        while(it.hasNext()){
            T element = it.next();
            // DB_Element의 getID() 메소드로 비교
            if(element.getID().equals(s)){  
                //toString을 이용한 element 리턴
                return element.toString();
            }
        }
        
        return "Element with ID " + s + " not found.";
    }
    
    public void printAllElements(){
        System.out.println("--- All Elements in Database ---");
        // for-each문 사용
        for(T element : db){
            // 각 요소의 toString() 메소드를 사용하여 출력
            System.out.println(element); 
        }
        System.out.println("--------------------------------");
    }
}

