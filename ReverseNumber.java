import java.util.*;
class rev{
	int y=0,r;
	public void disp(int num) {
		
		 while(num!=0) {
		        r=num%10;
		        y=y*10+r;
		        num=num/10;
		         }
	}
	
	public int getFunc(){
		return y;
	}
}

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		rev v=new rev();
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
        System.out.println("Before the reverse::"+num);
        v.disp(num);
        int d=v.getFunc();
        System.out.println("After the reverse::"+d);
        sc.close();
        
	}

}
