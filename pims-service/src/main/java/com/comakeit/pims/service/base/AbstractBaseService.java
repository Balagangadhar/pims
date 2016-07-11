package com.comakeit.pims.service.base;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

import com.comakeit.pims.data.entity.base.AbstractBaseEntity;
import com.comakeit.pims.data.exception.InvalidObjectException;
import com.comakeit.pims.data.exception.ObjectAlreadyExistsException;
import com.comakeit.pims.data.repository.base.AbstractBaseRepository;
import com.comakeit.pims.data.vo.base.AbstractBaseVO;

public abstract class AbstractBaseService<T extends AbstractBaseVO, E extends AbstractBaseEntity> {

	private final static Logger LOGGER = LoggerFactory.getLogger(AbstractBaseService.class);

	protected Class<T> tClazz;

	protected Class<E> eClazz;

	@Autowired
	protected Mapper beanMapper;

	protected AbstractBaseService(Class<T> _tClazz, Class<E> _eClazz) {
		this.tClazz = _tClazz;
		this.eClazz = _eClazz;
	}

	protected abstract AbstractBaseRepository<E> getRepository();

	public T get(final String id) {
		T dto = null;
		return dto;
	}

	@Transactional
	public T create(T dto) {

		E entity = beanMapper.map(dto, this.eClazz);
		entity = this.preCreate(entity);

		try {
			entity = this.getRepository().saveAndFlush(entity);
		} catch (DataIntegrityViolationException ex) {
			throw new ObjectAlreadyExistsException();
		} catch (InvalidObjectException invalidObject) {
			throw new InvalidObjectException(invalidObject.getMessage());
		}
		entity = this.postCreate(entity);

		if (entity != null) {
			beanMapper.map(entity, dto);
		}
		return dto;
	}

	public List<T> getAll() {
		List<T> dtos = new ArrayList<>();
		// List<E> entities = this.getRepository().findAll();
		// if (entities != null && !entities.isEmpty()) {
		// for (E entity : entities) {
		// dtos.add(beanMapper.map(entity, this.tClazz));
		// }
		// }
		return dtos;
	}

	private E postCreate(E entity) {
		return entity;
	}

	private E preCreate(E entity) {
		return entity;
	}

	protected String buildSearchText(String searchText) {
		if (searchText != null && searchText.length() > 0) {
			searchText = searchText.toLowerCase();

			if (searchText.contains("*")) {
				searchText = searchText.replaceAll("\\*", "%");
			}

		} else {
			searchText = "%";
		}
		return searchText;
	}
}
