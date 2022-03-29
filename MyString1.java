import java.util.Arrays;
public class MyString1 {
	private char[] ch;
	private String tempString;
	
	public MyString1(char[] chars) {
		this.ch = chars;
		this.tempString = "";
		for (int i = 0; i < ch.length; i++) {
			tempString += ch[i];
		}
	}
	
	public char charAt(int index) throws IndexOutOfBoundsException{
		if (index < 0 || index >= ch.length) {
			throw new IndexOutOfBoundsException();
		}
		return ch[index];
	}
	public int length() {
		return ch.length;
	}
	public MyString1 substring(int begin, int end) throws IndexOutOfBoundsException{
		if (begin < 0 || end < 0 || begin > ch.length || end > ch.length || begin > end) {
			throw new IndexOutOfBoundsException();
		}
		int lenOfSubstring = end-begin;
		char[] chars = new char[lenOfSubstring];
		int j = 0;
		for (int i = begin; i < end; i++) {
			chars[j] = ch[i];
			j += 1;
		}
		MyString1 finalString = new MyString1(chars);
		return finalString;
	}
	
	public MyString1 toLowercase() {
		char[] chars = new char[ch.length];
		for (int i = 0; i < ch.length; i++) {
			chars[i] = Character.toLowerCase(ch[i]);
		}
		MyString1 finalString = new MyString1(chars);
		return finalString;
		}
	public boolean equals(MyString1 s) {
		boolean isEqual = true; 
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != s.charAt(i)) {
				isEqual = false;
			}
		}
		return isEqual;
	}
	
	public static MyString1 valueOf(int i) {
		int lenOfNum = 0;
		for (int x = 1; Math.abs(x/i) > 0; x *= 10) {
			lenOfNum += 1;
		}
		char[] chars;
		if (i == 0) {
			chars = new char[1];
			chars[0] = '0';
		}
		if (i > 0) {
			chars = new char[lenOfNum];
			for (int x = lenOfNum-1; x >= 0; x--) {
				chars[i] = (char)('0' + i % 10);
				i /= 10;
			}
		}
		else {
			i = Math.abs(i);
			chars = new char[lenOfNum+1];
			for(int x = lenOfNum; x > 0; x--) {
				chars[x] = (char)('0' + i % 10);
				i /= 10;
			}
		chars[0] = '-';
		}
		return new MyString1(chars);
	}
	
	public MyString1[] split(String s) {
		int length = 1;
		for (int i = 0; i <= this.length() - s.length(); i++) {
			 if (this.substring(i,  i+s.length()).equals(s)) {
				 length++;
			 }
		}
		MyString1[] finalStrings = new MyString1[length];
		int x = 0;
		int y = 0;
		for (int i = 0; i <= this.length() - s.length(); i++) {
			if (this.substring(i, i+s.length()).equals(s)) {
				x += 1;
				y = i + s.length();
			}
		}
		finalStrings[length-1] = this.substring(y, this.length());
		return finalStrings;
	}
	public static void main(String[] args) {
		char[] string = new char[] {'M', 'y', ' ', 'N', 'a', 'm', 'e'};
		MyString1 string1 = new MyString1(string);
		System.out.println("String1 charAt test at index 1: " + string1.charAt(1));
		System.out.println("String1 length test: " + string1.length());
		MyString1 substringTest = string1.substring(3, 6);
		System.out.print("String1 substring test from index 3 to 6: ");
		for (int i = 0; i < substringTest.length(); i++) {
			System.out.print(substringTest.charAt(i));
		}
		System.out.println();
		MyString1 toLowercaseTest = string1.toLowercase();
		
		System.out.print("String1 toLowercase test; ");
		for (int i = 0; i < toLowercaseTest.length(); i++) {
			System.out.print(toLowercaseTest.charAt(i));
		}
		System.out.println();
		System.out.println("String1 equals test: " + string1.equals(new MyString1(new char[] {'M', 'y', ' ', 'N', 'a', 'm', 'e'})));
		MyString1 valueOfTest = MyString1.valueOf(69);
		System.out.println("String1 valueOf test: " + valueOfTest);
		MyString1[] splitTest = string1.split(" ");
		System.out.print("String1 split test: ");
		for (int i = 0; i < splitTest.length; i++) {
			System.out.print(splitTest[i] + ", ");
		}
		
		

	}

}
