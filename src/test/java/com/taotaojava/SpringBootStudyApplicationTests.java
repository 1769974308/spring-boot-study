package com.taotaojava;

import com.taotaojava.mapper.StudentsMapper;
import com.taotaojava.pojo.Students;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootStudyApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(SpringBootStudyApplicationTests.class);

	@Autowired
	private StudentsMapper studentsMapper;


	@Test
	public void mybatisTest() {

		List<Students> studentsList = studentsMapper.findByNO("007");
		 log.info("注解方式：");
		log.info(studentsList.get(0).toString());

		List<Students> studentsList1 = studentsMapper.findByNO2("008");
		log.info("xml方式：");
		log.info(studentsList1.get(0).toString());

	}

}
