class Main{
	public static void main(String[]args){
		//we can nest for loops aswell
		for(int number=1;number<10;number++){
			for(int multiplier=1;multiplier<10;multiplier++){
				System.out.printf("%dX%d=%d\n",number,multiplier,number*multiplier);
			}
		}
	}
}