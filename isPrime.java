class isPrime
{
public static void main(String args[]){
int input1 = Integer.parseInt(args[0]);
boolean raja = true;
		for(int i = 2;i*i<=input1;i++){
			if(input1%3==0){
				raja = false;

			}
}
			if(raja){
				System.out.println("2");


			}
			else{
				System.out.println("1");

		}
}
}