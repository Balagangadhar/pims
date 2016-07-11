package com.comakeit.pims.service;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comakeit.pims.data.entity.RoomEntity;
import com.comakeit.pims.data.repository.RoomRepository;
import com.comakeit.pims.data.repository.base.AbstractBaseRepository;
import com.comakeit.pims.data.vo.RoomVO;
import com.comakeit.pims.service.base.AbstractBaseService;

@Service
public class RoomService extends AbstractBaseService<RoomVO, RoomEntity> {

	protected RoomService() {
		super(RoomVO.class, RoomEntity.class);
	}

	private final static Logger LOGGER = LoggerFactory.getLogger(RoomService.class);

	@Autowired
	private RoomRepository roomRepository;

	@Override
	protected AbstractBaseRepository<RoomEntity> getRepository() {
		return roomRepository;
	}

}
