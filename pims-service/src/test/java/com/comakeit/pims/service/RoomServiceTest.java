package com.comakeit.pims.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.comakeit.pims.data.vo.RoomVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-context-pims-data.xml",
		"classpath*:spring-context-pims-model.xml", "classpath*:spring-context-pims-configuration.xml",
		"classpath*:spring-context-pims-service.xml" })
@PrepareForTest(SecurityContextHolder.class)
public class RoomServiceTest {

	@Autowired
	private RoomService roomService;

	@Test
	public void getRooms() {
		roomService.getAll();
	}

	@Test
	public void createRoom() {

		RoomVO roomVo = new RoomVO();
		roomVo.setName("Room -1");
		roomService.create(roomVo);
	}

}
