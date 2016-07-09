package com.comakeit.pims.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.comakeit.pims.data.dto.RoomDTO;
import com.comakeit.pims.rest.base.AbstractBaseController;

@RestController
@RequestMapping(value = RoomController.BASE_URL)
public class RoomController extends AbstractBaseController<RoomDTO> {

	protected final static String BASE_URL = "/room";
}
