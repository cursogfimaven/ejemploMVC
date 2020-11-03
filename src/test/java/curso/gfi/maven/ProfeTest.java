package curso.gfi.maven;

import static org.junit.Assert.assertEquals;

import java.util.Locale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.ConcurrentModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml")
public class ProfeTest {
	
	@Autowired
	private HomeController controller;
	
	@Test
	public void profe() {
		assertEquals(getController().profe(), "profe");
	}

	public HomeController getController() {
		return controller;
	}

	public void setController(HomeController controller) {
		this.controller = controller;
	}

}
