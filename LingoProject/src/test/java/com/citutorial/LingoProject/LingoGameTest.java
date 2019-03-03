package com.citutorial.LingoProject;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.citutorial.classes.LingoGame;

public class LingoGameTest {

	ApplicationContext context;
	
	@Before
	public void setUp() throws Exception {
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
		LingoGame game=(LingoGame) context.getBean("myLingoGame");
		game.StartLingoGame();
	}

}
