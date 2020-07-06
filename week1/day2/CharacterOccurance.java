package week1.day2;

public class CharacterOccurance {
	String str = "welcome to chennai";
	int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterOccurance obj = new CharacterOccurance();
		obj.charoccurance();
		obj.charate();
	}
	void charoccurance() {
		char[] ch = str.toCharArray();		
		for (int i=0; i<ch.length; i++) {
			for (int j=i+1; j<ch.length; j++) {
				if (ch[i]==ch[j]) {
					count ++;
				}				
			}
			if (count>0) {
				System.out.println(ch[i]+":"+"Character Occurance"+" "+count+" "+"times");
				count=0;
			}
		}
	}
	void charate() {
		char [] che = str.toCharArray();
		int sh = che.length;
		int cout=0;
		System.out.println("*********************");
		System.out.println(che[1]);
		char temp = che[1];
		for (int i=0; i<sh; i++) {
			if(temp==che[i]) {
				cout++;
			}
		}			
		if(cout>0) {
			System.out.println(temp+":"+"Character Occurance"+" "+cout+" "+"times");
			cout=0;
		}
	}
}
