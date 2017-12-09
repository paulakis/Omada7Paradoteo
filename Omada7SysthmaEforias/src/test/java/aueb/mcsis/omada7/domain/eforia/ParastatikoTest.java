package aueb.mcsis.omada7.domain.eforia;
import org.junit.*;
import java.util.Date;


public class ParastatikoTest {

	
	@Test
	public void pareToPosoTest(){
		Parastatiko p = new Parastatiko();
		p.setEidossinallaghs(true);
		p.setPoso(1);
		p.setId(1);
		p.setAfmsimvalwmenoou("123456789");
		p.setArithmosparastatikou(1);
		 Date a= new Date();
p.setHmeromhniaparastatikou(a);
		Assert.assertTrue(p.isEidossinallaghs()&& p.getPoso() > 0 &&  p.PareToPoso(p) > 0);
	}
	
	@Test
	public void pareToPosoArnitikoTest(){
		Parastatiko p = new Parastatiko();
		p.setEidossinallaghs(false);
		p.setPoso(1);
		
		Assert.assertFalse(p.PareToPoso(p)<0 && (p.getPoso() < 0) && (p.isEidossinallaghs()));
	}
	
	@Test
	public void pareToPosoNullTest(){
		Parastatiko p = new Parastatiko();
		Assert.assertTrue(p.getPoso()==0 && p.PareToPoso(p)==0);
}
}

    
	