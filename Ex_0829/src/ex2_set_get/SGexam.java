package ex2_set_get;

public class SGexam {

	//getter는 private를 외부로 꺼내는 메서드, setter는 private에 값을 넣는 메서드이다. 

	 
		private String company="샘송";
		private String name;
		private int age;
		
		public void setName(String n) {
			name=n;
		}
		
		public String getName() {
			return name;
		}
		
		public void setAge(int a) {
			age=a;
		}
		
		public int getAge() {
			return age;
		}
		
		
		public void setCompany(String com) {
			company=com;
		}
		
		public String getCompany() {
			return company;
		}
		
		
		
		
}
