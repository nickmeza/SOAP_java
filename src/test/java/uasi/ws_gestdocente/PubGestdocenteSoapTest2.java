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
	}*/

	@Test
	public void testWshorarios() {
		System.out.println("\n\n\n\n\n");
		ArrayOfClaseHorarios Horarios = gestdocent.wshorarios("C", "2010-11", "9244", "T");
		List<ClaseHorarios> x = Horarios.getClaseHorarios();
		for (ClaseHorarios claseHorarios : x) {
			System.out.println(claseHorarios.getAula()+"\t"+claseHorarios.getAulasig()+"\t"+claseHorarios.getCapacidadgrupo()+"\t"+claseHorarios.getClaseActiv()+"\t"+claseHorarios.getCodgrp()+"\t"+claseHorarios.getDescactiv()+"\t"+claseHorarios.getDescaula()+"\t"+claseHorarios.getDescgrupo()+"\t"+claseHorarios.getDia()+"\t"+claseHorarios.getDiasemana()+"\t"+claseHorarios.getIdioma());
		}
		assertTrue(20==20);
	}

	@Test
	public void testWscalificaciones() {
		ArrayOfClaseCalificaciones Calificaciones = gestdocent.wscalificaciones("C", "9244");
		List<ClaseCalificaciones> x = Calificaciones.getClaseCalificaciones();
		for (ClaseCalificaciones claseCalificaciones : x) {
			System.out.println(claseCalificaciones.getCod()+"\t"+claseCalificaciones.getDescripcion()+"\t"+claseCalificaciones.getRanmax()+"\t"+claseCalificaciones.getRanmin());
		}
		assertTrue(20==20);
	}
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
