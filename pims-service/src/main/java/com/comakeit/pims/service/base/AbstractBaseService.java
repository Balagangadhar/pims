package com.comakeit.pims.service.base;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;

import com.comakeit.pims.data.entity.base.AbstractBaseEntity;
import com.comakeit.pims.data.repository.base.AbstractBaseRepository;
import com.comakeit.pims.data.vo.base.AbstractBaseVO;

@Transactional(readOnly = true)
public abstract class AbstractBaseService<T extends AbstractBaseVO, E extends AbstractBaseEntity> {

	private final static Logger LOGGER = LoggerFactory.getLogger(AbstractBaseService.class);

	protected Class<T> tClazz;

	protected Class<E> eClazz;

	protected AbstractBaseService() {

	}

	protected AbstractBaseService(Class<T> _tClazz, Class<E> _eClazz) {
		this.tClazz = _tClazz;
		this.eClazz = _eClazz;
	}

	protected abstract AbstractBaseRepository<E> getRepository();

	public List<T> list(final String containerId, String searchText, final String sort) {
		List<T> dtos = new ArrayList<T>();
		return dtos;
	}

	public T get(final String containerId, final String id) {
		T dto = null;
		return dto;
	}

}
