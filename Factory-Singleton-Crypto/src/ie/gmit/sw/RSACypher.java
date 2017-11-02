package ie.gmit.sw;

import java.security.*;
import javax.crypto.*;

public class RSACypher extends AbstractCypher {
	private KeyPair keyRing;
	
	public RSACypher() throws Exception {
		KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA"); // Singleton
		keyGen.initialize(1024);
		keyRing = keyGen.generateKeyPair();
		setCypher(Cipher.getInstance("RSA/ECB/PKCS1Padding")); // Singleton
	}
	
	@Override
	public byte[] encrypt(byte[] plainText) throws Throwable {
		return super.encrypt(plainText, keyRing.getPublic());
	}

	@Override
	public byte[] decrypt(byte[] cypherText) throws Throwable {
		return super.decrypt(cypherText, keyRing.getPrivate());
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.getClass().getName() + "=" + this);
	}

}
