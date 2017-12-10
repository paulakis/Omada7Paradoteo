package aueb.mcsis.omada7.domain.eforia;
import org.junit.Test;

import aueb.mcsis.omada7.domain.eforia.AithmaElegxou;
import junit.framework.Assert;

public class AithmaElegxouTest {

	@Test
	public void aploTest(){
		AithmaElegxou aitEl = new AithmaElegxou(true, true, true);
		aitEl.setId(33);
		aitEl.setDinatothtatropo(false);
		aitEl.setEnhmerwsheforou(false);
		aitEl.setOloklhrwshelegxwn(false);
		Assert.assertFalse(aitEl.isDinatothtatropo());
		Assert.assertFalse(aitEl.isEnhmerwsheforou());
		Assert.assertFalse(aitEl.isOloklhrwshelegxwn());
		
	}
}
