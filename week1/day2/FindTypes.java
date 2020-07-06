package week1.day2;

public class FindTypes {
	String test = "&& Welcome to 2nd Class of Automation $$ ";
	int letter=0, space=0, num=0, specialchar=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindTypes obj = new FindTypes();
		obj.findtypes();
	}
	void findtypes() {
		char [] ch = test.toCharArray();		
		for (int i=0; i<ch.length; i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			}else if(Character.isDigit(ch[i])){
				num++;
			}else if(Character.isSpaceChar(ch[i])) {
				space++;
			}else {
				specialchar++;
			}
		}
		if(letter>0) {
			System.out.println("Alphabet in given Character"+" "+letter+" "+"Characters");
			letter=0;
		}
		if (space>0) {
			System.out.println("Space in given Character"+" "+space+" "+"Characters");
			space=0;
		}
		if (num>0) {
			System.out.println("Numbers in given Character"+" "+num+" "+"Characters");
			num=0;
		}
		if (specialchar>0) {
			System.out.println("SpecialCharcater in given Character"+" "+specialchar+" "+"Characters");
			specialchar=0;
		}
	}
}
