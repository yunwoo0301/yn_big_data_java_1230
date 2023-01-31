package 프로퍼티;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;
// 키와 값이 모두 String 타입으로 제한된 Map 컬렉션이며, HashTable 에서 상속 받음.
// 주로 문자열로 이루어진 파일에서 정보를 읽을 때 사용함.
public class  PropertiesEx {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties(); // HashTable 에서 상속 받음(키와 값이 모두 문자열)
        String path = PropertiesEx.class.getResource("../회원정보종합예제/database.properties").getPath();
        // path 에서 한칸 올라가기 "./" 현재 위치, "../" 현 위치에서 한 단계 상위 위치로 이동
        path = URLDecoder.decode(path, "utf-8"); // 한글이 포함되는 이름 해석하기 위한 코드, encoding : 암호화 <->decoding : 해석
        properties.load(new FileReader(path));
        String driver = properties.getProperty("driver");
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        System.out.println("driver : " + driver);
        System.out.println("url : " + url);
        System.out.println("username : " + username);
        System.out.println("password : " + password);
    }
}
