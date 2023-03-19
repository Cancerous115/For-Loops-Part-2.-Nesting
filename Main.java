class Main{
	public static void main(String[]args){
		//we can nest for loops aswell.if we cwant to add 10 we can just make "<" into "<=" for both for loops.
		for(int number=1;number<10;number++){
			for(int multiplier=1;multiplier<10;multiplier++){
				System.out.printf("%dX%d=%d\n",number,multiplier,number*multiplier);
			}
		}
	}
}