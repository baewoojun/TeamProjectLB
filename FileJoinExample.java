import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class User {
    String name;
    int bookId; // 대출한 책 ID
    User(String name, int bookId) {
        this.name = name;
        this.bookId = bookId;
    }
}

class Book {
    int id;
    String title;
    String author;
    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }
}

public class FileJoinExample {
    public static void main(String[] args) {
        Map<Integer, Book> bookMap = new HashMap<>();
        List<User> users = new ArrayList<>();

        // BookData2025.txt 읽기 → bookMap에 저장
        try (FileReader frBook = new FileReader("BookData2025.txt");
             Scanner bookScanner = new Scanner(frBook)) {

            while (bookScanner.hasNextLine()) {
                String line = bookScanner.nextLine();
                String[] tokens = line.split("/");
                int id = Integer.parseInt(tokens[0]);
                String title = tokens[1];
                String author = tokens[2];
                bookMap.put(id, new Book(id, title, author));
            }

        } catch (IOException e) {
            System.out.println("책 데이터 파일 읽기 오류: " + e.getMessage());
        }

        // UserData2025.txt 읽기 → users 리스트에 저장
        try (FileReader frUser = new FileReader("UserData2025.txt");
             Scanner userScanner = new Scanner(frUser)) {

            while (userScanner.hasNextLine()) {
                String line = userScanner.nextLine();
                String[] tokens = line.split("/");
                String name = tokens[0];
                int bookId = Integer.parseInt(tokens[1]);
                users.add(new User(name, bookId));
            }

        } catch (IOException e) {
            System.out.println("사용자 데이터 파일 읽기 오류: " + e.getMessage());
        }

        // 두 데이터를 "bookId"로 연동해서 출력
        System.out.println("=== 이용자별 대출 도서 목록 ===");
        for (User u : users) {
            Book b = bookMap.get(u.bookId);
            if (b != null) {
                System.out.printf("%s → %s (%s)\n", u.name, b.title, b.author);
            } else {
                System.out.printf("%s → [책 정보 없음]\n", u.name);
            }
        }
    }
}
