package stringEncoding;



public class CypherEncoding {
	
private int shift;
	
	private CypherEncoding(int shift) {
		int modShift = shift % 26;
		this.shift = modShift;
	}


	/**
	 * Encodes a message by replacing each letter with the letter that is shift letters down the alphabet.
	 *
	 * @param message The message to be encoded.
	 * @return The encoded message.
	 */
	
	public String encode(String message) {
		String messageLowercase = message.toLowerCase();
		char[] result = messageLowercase.toCharArray();
		
		for(int i = 0; i<result.length;i++) {
			if(result[i]<=122 & result[i]>=97) {
			if(result[i]+shift>122) {
				result[i] = (char) (96 + (result[i]+shift-122));	
			}else {
				result[i] = (char) (result[i]+shift);			
			}
			}else {result[i] = result[i];}
		}

		String newMessage = new String(result);
		

		return newMessage;
	}

	/**
	 * Decodes a message by replacing each letter with the letter that is shift letters down the alphabet.
	 *
	 * @param message The message to be decoded.
	 * @return The decoded message.
	 */
	
	public String decode(String message) {
		char[] result = message.toCharArray();
		
		for(int i = 0; i<result.length;i++) {
			if(result[i]<=122 & result[i]>=97) {
			if(result[i]-shift<97) {
				result[i] = (char) (123 - (97 - result[i]+shift));	
			}else {
				result[i] = (char) (result[i]-shift);			
			}
			} else {result[i] = result[i];}
		
		}

		String newMessage = new String(result);
		

		return newMessage;
	}

}
