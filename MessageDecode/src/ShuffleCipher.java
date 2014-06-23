
public class ShuffleCipher implements MessageDecoder{
	int n;
	public ShuffleCipher(int n){
		this.n=n;
	}
	public String decode(String plainText){
		String newString=plainText;
		for (int i=0;i<n;i++){
			newString=shuffler(newString);
		}
		return newString;
	}
	public String shuffler(String message){
		
		String message1="";
		String message2="";
		for (int i=0;i<message.length();i++){
			message1=message1+message.charAt(i);
			i++;
			message2=message2+message.charAt(i);
		}
		return message1+message2;
	}
}
