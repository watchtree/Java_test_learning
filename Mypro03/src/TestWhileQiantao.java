/**
 * 
 * @author tree
 *
 */
public class TestWhileQiantao {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(j + "\t");
			}
			System.out.println("");//打印并换行
		}
		
		System.out.println("############");
		
		for(int p=1;p<=9;p++){
			for(int q=1;q<=p;q++){
				System.out.print(p+"*"+q+"="+p*q+"\t");
			}
			System.out.println("");
		}
		System.out.println("############");
		
		int sum1=0;
		int sum2=0;
		int i=1;
		while(i<=100){
			if(i%2==1){
				sum1=sum1+i;
			}else{
				sum2=sum2+i;
			}
			i++;
		}
		System.out.println("奇数和"+sum1);
		System.out.println("偶数和"+sum2);
		
		System.out.println("#############");
		int j=1;
		while(j<=1000){
			if(j%5==0){
				System.out.print(j+"\t");
				if(j%25==0){
					System.out.println("");
				}
			}
			j++;
		}
		
		System.out.println("#############");
		int h=0;
		for(int k=1;k<=1000;k++){
			if(k%5==0){
				System.out.print(k+"\t");
				h++;
			}
			if(h==5){
				System.out.println("");
				h=0;
			}
		}
	}
}
