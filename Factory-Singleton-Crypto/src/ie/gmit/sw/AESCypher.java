package ie.gmit.sw;

import java.security.*;
import javax.crypto.*;

public class AESCypher extends AbstractCypher {
	private Key key = null;
	
	public AESCypher() throws Exception {
		KeyGenerator keyGen = KeyGenerator.getInstance("AES");
		keyGen.init(128);
		key = keyGen.generateKey();
		Cipher cypher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		super.setCypher(cypher);
	}

	public byte[] encrypt(byte[] plainText) throws Throwable {
		return super.encrypt(plainText, key);
	}

	public byte[] decrypt(byte[] cypherText) throws Throwable {
		return super.encrypt(cypherText, key);
	}

}
