package com.comakeit.pims.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comakeit.pims.data.entity.RoomEntity;
import com.comakeit.pims.data.repository.RoomRepository;
import com.comakeit.pims.data.repository.base.AbstractBaseRepository;
import com.comakeit.pims.data.vo.RoomVO;
import com.comakeit.pims.service.base.AbstractBaseService;

@Service
public class RoomService extends AbstractBaseService<RoomVO, RoomEntity> {

	@Autowired
	private RoomRepository roomRepository;

	@Override
	protected AbstractBaseRepository<RoomEntity> getRepository() {
		return roomRepository;
	}

}
