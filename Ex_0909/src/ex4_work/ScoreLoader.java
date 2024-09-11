package ex4_work;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ScoreLoader {
	
	private User user=new User();
	
	public User startLoad(String id) {
		
		user.setId(id);
		
		String path="c:/RspScore/"+id+"/userinfo.sav";
		File f=new File(path);
		
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		
		if(f.exists()) {
			try {
				fis=new FileInputStream(f);
				ois=new ObjectInputStream(fis);
				user=(User) ois.readObject();
				
			} catch (Exception e) {
				System.out.println("로드 실패");
				e.printStackTrace();
			}finally {
				try {
					if(ois!=null)
						ois.close();
					if(fis!=null)
						fis.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
					
			}
			
		}else {
			System.out.println("새로운 유저");
			
		}
		

		
		return user;
	}
	
}
