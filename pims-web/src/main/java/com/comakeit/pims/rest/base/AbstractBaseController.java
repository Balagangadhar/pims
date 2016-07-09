package com.comakeit.pims.rest.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.comakeit.pims.data.dto.base.AbstractBaseDTO;

public abstract class AbstractBaseController<T extends AbstractBaseDTO> extends AbstractBaseRestController {

	private final static Logger LOGGER = LoggerFactory.getLogger(AbstractBaseController.class);

	public AbstractBaseController() {
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String list() {
		return "It is working";
	}

}
