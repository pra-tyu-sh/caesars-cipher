package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCiphersTest {
	
	private CaesarsCipher caesarCipher = new CaesarsCipher();
	

	@Test
	void testCipheredMessageWithOffsetof12() {
		assertEquals("tai mdq kag pauzs fapmk", caesarCipher.cipher("how are you doing today", 12));
		
	}
	
	@Test
	void testEptyString() {
		assertEquals("tai mdq kag pauzs fapmk", caesarCipher.cipher("how are you doing today", 12));
	}

}
