
public class ReverseInteger {
	public static void main(String[] args) {
        System.out.println(reverse(12345));
    }
    public static int reverse(int num) {
        String number = Integer.toString(num);
        String newNum = "";
        for(int i = number.length() - 1;i >=0; i--) {
            newNum += number.charAt(i);
        }
        return Integer.parseInt(newNum);
    }

}
