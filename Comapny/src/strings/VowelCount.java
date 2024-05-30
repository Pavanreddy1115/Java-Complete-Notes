package strings;

public class VowelCount {
	public static void main(String[] args) {
		String str = "wertyuiopjhgfdszxcvbn";
		int count =0;
		for(int i =0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='U'||c=='O'||c=='I') {
				count++;
			}
			
		}System.out.println(count);
	}

}
