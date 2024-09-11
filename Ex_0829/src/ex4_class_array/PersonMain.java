package ex4_class_array;

public class PersonMain {
	public static void main(String[] args) {
		
		Person[] p=new Person[2];
		//배열의 각 index별로 물리적 객체화(메모리 할당) 작업 반드시 해야함
		p[0]=new Person();
		p[1]=new Person();
		
		p[0].setName("홍길동");
		p[0].setAge(22);
		
		p[1].setName("김길동");
		p[1].setAge(30);
		
		//for문을 이용하여 p[]에 있는 모든 데이터 출력
		
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].getName()+" / "+p[i].getAge());	
		}
		
	}//main
}
