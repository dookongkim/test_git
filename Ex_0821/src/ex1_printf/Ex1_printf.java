package ex1_printf;

public class Ex1_printf {
		public static void main(String[] args) {
			
			int age=30;
			System.out.printf("제 나이는 %d살 입니다.\n",age);
			System.out.printf("회사에서 집까지 %d km입니다.\n",20);
			
			//저는 25세이고 키가 160 입니다
			System.out.printf("저는 %d세이고 키가 %d 입니다 \n",25,160);
			
			//2024-08-21
			System.out.printf("%d-%02d-%02d \n",2024,8,8);
			
			//저의 성은 김씨 입니다
			char last_name='김';
			System.out.printf("저의 성은 %c씨 입니다 \n",last_name);
			
			//저는 A형 이고,키는 170.5입니다
			char blood_type='A';
			float height=170.5f;
			System.out.printf("저는 %c형 이고, 키는%f입니다 \n",blood_type,height);
			
			//오늘 기온은 32.7도 입니다
			float temp=32.7f;
			System.out.printf("오늘 기온은 %.1f도 입니다 \n",temp);
			
			String region="서울";
			System.out.printf("제 고향은 %s입니다 \n",region);
			
			//제 나이는 20이고, 사는곳은 경북 입니다.
			System.out.printf("제 나이는 %d이고, 사는곳은 %s입니다 \n",20,"경북");
			
			//저는 상위 15% 입니다
			System.out.printf("저는 상위 %d%% 입니다\n",15);
			
			
			
			//formatter 의 종류
			//%d : 정수
			//%c : 문자
			//%f : 실수
			//%s : 문자열
			//%% : %
			
			
		}
}
