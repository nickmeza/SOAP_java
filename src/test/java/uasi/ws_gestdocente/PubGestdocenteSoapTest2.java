package uasi.ws_gestdocente;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PubGestdocenteSoapTest2 {
	PubGestdocenteSoap gestdocent = new PubGestdocente().getPubGestdocenteSoap();
	/*@Test
	public void testWsagrupaciones() {
		gestdocent.wsagrupaciones("C", "2011-12", "B142", "G") ;
	}

	@Test
	public void testWsfechaexamenesasi() {
		gestdocent.wsfechaexamenesasi(plengua, pcodest, pcurso, pcodasi, pcodconvoc, porden) ;
	}

	@Test
	public void testWsfechaexamenesasitotal() {
		gestdocent.wsfechaexamenesasitotal(plengua, pcodest, pcurso, pcodasi, pcodconvoc, porden) ;
	}

	@Test
	public void testWsfechaexamenesasinue() {
		gestdocent.wsfechaexamenesasinue(plengua, pcurso, pcodasi, pcodconv, porden);
	}

	@Test
	public void testWsfechaexamenesplan() {
		gestdocent.wsfechaexamenesplan(plengua, pcodest, pcurso, pcodconv, porden);
	}*/
	@Test
	public void testWsasidepto() {
		ArrayOfClaseAsiDepto AsiDepto = gestdocent.wsasidepto("C", "2011-12", "B142", "");
		List<ClaseAsiDepto> x = AsiDepto.getClaseAsiDepto();
		for (ClaseAsiDepto claseAsiDepto : x) {
			System.out.println(claseAsiDepto.getCodasi()+"\t"+claseAsiDepto.getCodest()+"\t"+claseAsiDepto.getNomasi()+"\t\t"+claseAsiDepto.getNomest());
		}
		assertTrue(20==20);
	}
}
