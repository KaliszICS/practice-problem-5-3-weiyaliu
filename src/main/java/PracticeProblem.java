
public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String[] addString (String[] arr, String str, int pos) {

		String[] newArr = new String[arr.length + 1];
		int index = 0;

		for (int i = 0; i < newArr.length; i++) {
			if (i != pos){
				newArr[i] = arr[index];
				index++;
		}else {
			newArr[i] = str;
		}
	}

	return newArr;

	}

	public static char[] removeChars (char[] arr, char ch) {
		
		int count = 0;

		for (int i= 0; i< arr.length;i++) {
			if (arr[i] == ch) {
				count++;
			}
		}

		char[] arr2 = new char[arr.length - count];

		int index2 = 0;

		for (int i= 0; i< arr.length;i++) {
			if (arr[i] !=ch) {
				arr2[index2] = arr[i];
        		index2++;
			}
		}
		return arr2;

	}
}
