package assignment;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r,sum=0,temp;
		int num=121;
		temp=num;
		while(num>0) {
			r=num%10;
		    sum=(sum*10)+r;
			num=num/10;
			
		}
			
		if(temp==sum)
		{
			System.out.println(temp);
		
		}


}
}



