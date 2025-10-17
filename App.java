import java.util.*;
import java.io.*;
/**
 * 여기에 App 클래스 설명을 작성하십시오.
 * 
 * @author (2022320019 김승현) 
 * @version (25/10/17)
 */
public class App {
    private static List<User> userDB = new ArrayList<>();
    private static List<Book> bookDB = new ArrayList<>();
    private static List<Borrow> borrowList = new ArrayList<>();

    public static void main(String[] args) {
        borrow data = new borrow();
        data.printUserDB();
        data.printBookDB();
        data.printBorrowInfo();
    }
    
    public static void setUserDB(String filename) {
        try {
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] token = line.split("/");
                userDB.add(new User(token[0].trim(), token[1].trim()));
            }

            scan.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("사용자 파일 읽기 오류: " + e.getMessage());
        }
    }

    public static void setBookDB(String filename) {
        try {
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] token = line.split("/");
                bookDB.add(new Book(
                    token[0].trim(), token[1].trim(), token[2].trim(),
                    token[3].trim(), token[4].trim()
                ));
            }

            scan.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("도서 파일 읽기 오류: " + e.getMessage());
        }
    }

    public static void setBorrowDB(String filename) {
        try {
            FileReader fr = new FileReader(filename);
            Scanner scan = new Scanner(fr);

            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] token = line.split("/");
                borrowList.add(new Borrow(token[0].trim(), token[1].trim()));
            }

            scan.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("대출 파일 읽기 오류: " + e.getMessage());
        }
    }

    public static void printUserDB() {
        System.out.println("----- 이용자 목록 출력 -----");
        for (User u : userDB)
            System.out.println(u);
        System.out.println();
    }

    public static void printBookDB() {
        System.out.println("----- 책 목록 출력 -----");
        for (Book b : bookDB)
            System.out.println(b);
        System.out.println();
    }

    public static void printBorrowInfo() {
        System.out.println("----- 대출 현황 -----");
        for (Borrow b : borrowList) {
            String userName = getUserName(b.getUserID());
            Book book = getBookInfo(b.getBookID());
            if (userName != null && book != null) {
                System.out.println("[" + b.getUserID() + "] " + userName + " ==> " + book);
            }
        }
        System.out.println("----------------------------");
    }

    public static String getUserName(String userID) {
        for (User u : userDB)
            if (u.getUserID().equals(userID)) return u.getName();
        return null;
    }

    public static Book getBookInfo(String bookID) {
        for (Book b : bookDB)
            if (b.getBookID().equals(bookID)) return b;
        return null;
    }
}
