package cn.hnust;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Random;

public class DBTest {

	public static void main(String[] args) {
		try {
			DBConnection b =new DBConnection();
			String sql = "insert into student(id,name,age,dept,address) values('1507','Tom',20,'计算机','湖南')";
			
			b.execute(sql);
			ResultSet rs = b.executeQuery("select * from question");
			
			ArrayList<Question> list = new ArrayList();
			while(rs.next()){
				String id = rs.getString(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String dept = rs.getString(4);
				String address = rs.getString(5);
				Question t = new Question(id, name, age, dept, address);
				list.add(t);
			}
			b.close();
			Random r = new Random();
			int j=0;
			int[] ques= {-1,-1,-1,-1};
			while(j<4) {
				int randnumber = r.nextInt(list.size());
				System.out.println(randnumber);
				//if not exist 
				ques[j] = randnumber;
				j++;
			}
			
			for(int k=0;k<4;k++) {
				Question s = list.get(k);
				System.out.println(s.getId());
				System.out.println(s.getName());
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
