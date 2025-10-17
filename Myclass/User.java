package Myclass;

/**
 * 여기에 User 클래스 설명을 작성하십시오.
 * 
 * @author (2022320035_배우준) 
 * @version (25.10.17)
 */
public class User extends DB_Element
{
    //속성 2개 생성
    private String name;
    private Integer stID;
    
    public User(String name, Integer stID){
        this.name = name;
        this.stID = stID;
    }
    
    //Integer stID를 toString으로 변형
    public String getID()
    {
        return stID.toString();
    }

    //오버라이딩 과정 ()
    public String toString()
    {
        return"(" + name + ") +  stID: +" ;
    }
}
