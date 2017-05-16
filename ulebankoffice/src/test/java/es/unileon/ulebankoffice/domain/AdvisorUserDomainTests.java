package es.unileon.ulebankoffice.domain;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class AdvisorUserDomainTests {
	
	private AdvisorUserDomain user;

	@Before
	public void setUp() throws Exception {
		user = new AdvisorUserDomain();
	}

	@Test
	public void testEmail() {
		assertNull(user.getEmail());
		user.setEmail("email");
		assertThat(user.getEmail(), is("email"));
	}



	@Test
	public void testRealizadoTest() {
		assertThat(user.isRealizadoTest(), is(false));
		user.setRealizadoTest(true);
		assertThat(user.isRealizadoTest(), is(true));
	}

	@Test
	public void testResultadoTest() {
		assertThat(user.getResultadoTest(), is(0.0));
		user.setResultadoTest(10.3);
		assertThat(user.getResultadoTest(), is(10.3));
	}


	@Test
	public void testGetSolicitudes() {
		assertNull(user.getSolicitudes());
		user.setSolicitudes(new ArrayList<SolicitudFinancialAdvisorDomain>());
		assertThat(user.getSolicitudes().size(), is(0));
	}

	@Test
	public void testGetId() {
		assertNull(user.getId());
	}

}
