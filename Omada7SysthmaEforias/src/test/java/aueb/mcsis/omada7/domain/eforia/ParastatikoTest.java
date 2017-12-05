package aueb.mcsis.omada7.domain.eforia;
import org.junit.Test;

import org.junit.*;

public class ParastatikoTest {

	@Test
	public void pareToPosoTest(){
		Parastatiko p = new Parastatiko();
		p.setEidossinallaghs(true);
		p.setPoso(1);
		Assert.assertTrue(p.isEidossinallaghs() && p.getPoso() > 0);
	}
	
	@Test
	public void pareToPosoArnitikoTest(){
		Parastatiko p = new Parastatiko();
		Assert.assertFalse(p.isEidossinallaghs() && p.getPoso() < 0);
	}
	
}
