import java.util.Arrays;

public class q2 {
	int findIndex(char currEle, char[] orderArray) {
		for(int i=0; i<orderArray.length; i++) {
			if(orderArray[i] == currEle) {
				return i;
			}
		}
		return -1;
	}
	int alienLanguage() {
		int n = 5, k = 4;
		String[] dict = {"caa", "aaa", "aab"};
		char[] orderArray = "abcd".toCharArray();
		char[] charArr = new char[dict.length];
		
		for(int i=0; i<dict.length; i++) {
			charArr[i] = dict[i].charAt(0);
		}
		
		for(int i=0; i<charArr.length-1; i++) {
			char currEle = charArr[i];
			char nextEle = charArr[i+1];
			
			if(!(findIndex(currEle, orderArray) <= findIndex(nextEle, orderArray)) ) return 0;
		}
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q2 ob = new q2();
		System.out.println(ob.alienLanguage());

	}

}
