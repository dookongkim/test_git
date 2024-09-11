package ex7_work;

import java.awt.Frame;

public class GetCoin {
	public String GetCoin(String money,int n) {

		int[] coin= {500,100,50,10};
		String[] str=new String[coin.length];
		String result;

		Frame f=new Frame();




		int mymoney=Integer.parseInt(money);
		for(int i =0; i< coin.length;i++) {

			int res = mymoney/coin[i]; 

			if(res>=0) {
				System.out.println(coin[i]+ "원 : "+res);
				mymoney = mymoney %coin[i];
				str[i]=coin[i]+"원 - "+res;
			}

		}
		return str[n];

	}//GetCoin




}


