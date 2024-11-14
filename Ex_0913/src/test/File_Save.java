package test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class File_Save {

	public void fileSave(String fileName) {
		File f=new File(fileName);
		
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;

		try {
			fos=new FileOutputStream(f);
			oos=new ObjectOutputStream(fos);
			
			Food food=new Food("사과",20);
			
			oos.writeObject(food.toString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}try {
			if(oos!=null)
				oos.close();
			if(fos!=null)
				fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
