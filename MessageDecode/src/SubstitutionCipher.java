
public class SubstitutionCipher {
	int shift;
	public SubstitutionCipher(int shift){
		this.shift=shift;
	}
	public String decode(String cipherText){
		String newString="";
		for (int i=0;i<cipherText.length();i++){
			newString=newString+shifter(cipherText.charAt(i));
		}
		return newString;
	}
	private char shifter(char letter){
		return (char)(letter-this.shift);
	}
}
