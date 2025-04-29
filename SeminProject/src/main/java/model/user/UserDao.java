package model.user;
import model.MybatisConnection;
import java.sql.Connection;
import org.apache.ibatis.session.SqlSession;
public class UserDao {
	public static void main(String[] args) {
		 SqlSession session = null;

	        try {
	            session = MybatisConnection.getConnection();
	            if (session != null) {
	                System.out.println("✅ MyBatis DB 연결 성공");

	            } else {
	                System.out.println("❌ MyBatis DB 연결 실패 (SqlSession이 null입니다)");
	            }
	        } catch (Exception e) {
	            System.out.println("❌ 예외 발생:");
	            e.printStackTrace();
	        } finally {
	            if (session != null) {
	                MybatisConnection.close(session);
	            }
	        }
	}
}
