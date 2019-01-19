package com.example.demo;

import com.example.demo.service.ServiceA;
import com.example.demo.service.ServiceB;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	ServiceA serviceA;

	@Autowired
	ServiceB serviceB;

	@Test
	public void contextLoads() {
		serviceA.show(1,"2",false);
		serviceB.show(3,"4",true);
	}
}

