package uasi.ws_gestdocente;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PubGestdocenteSoapTest2 {
	PubGestdocenteSoap gestdocent = new PubGestdocente().getPubGestdocenteSoap();
	/*@Test
	public void testWsagrupaciones() {
		gestdocent.wsagrupaciones("", "", "", "G") ;
	}

	@Test
	public void testWsfechaexamenesasi() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsfechaexamenesasitotal() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsfechaexamenesasinue() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsfechaexamenesplan() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsasidepto() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsdatosasig() {
		fail("Not yet implemented");
	}

	@Test
	public void testWshorarioagrp() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testWshorarios() {
		gestdocent.wshorarios("C", "2012-11", "2", "T");
		
	}

	/*@Test
	public void testWstitulosuni() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsdatosplan() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsplanesasig() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsplanesdep() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsdptoasig() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsareasdpto() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsdptocen() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsasiplan() {
		fail("Not yet implemented");
	}

	@Test
	public void testWscalificaciones() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsconvocatorias() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsgruposasi() {
		fail("Not yet implemented");
	}

	@Test
	public void testWsconvemovilidad() {
		fail("Not yet implemented");
	}

	@Test
	public void testWstitulospropiosuni() {
		fail("Not yet implemented");
	}*/

}
