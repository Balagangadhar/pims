package com.comakeit.pims.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comakeit.pims.data.vo.RoomVO;
import com.comakeit.pims.rest.base.AbstractBaseController;
import com.comakeit.pims.service.RoomService;
import com.comakeit.pims.service.base.AbstractBaseService;

@RestController
@RequestMapping(value = RoomController.BASE_URL)
public class RoomController extends AbstractBaseController<RoomVO> {
	protected final static String BASE_URL = "/room";

	@Autowired
	private RoomService roomService;

	@Override
	protected AbstractBaseService<RoomVO, ?> getService() {
		return roomService;
	}
}
