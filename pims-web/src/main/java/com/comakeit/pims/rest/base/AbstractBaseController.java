package com.comakeit.pims.rest.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.comakeit.pims.data.exception.GenericSystemException;
import com.comakeit.pims.data.exception.InvalidObjectException;
import com.comakeit.pims.data.exception.ObjectAlreadyExistsException;
import com.comakeit.pims.data.exception.ObjectCannotDeleteException;
import com.comakeit.pims.data.exception.ObjectCreationNotAllowedException;
import com.comakeit.pims.data.exception.ObjectUpdationNotAllowedException;
import com.comakeit.pims.data.vo.base.AbstractBaseVO;
import com.comakeit.pims.service.base.AbstractBaseService;

public abstract class AbstractBaseController<T extends AbstractBaseVO> {

	private final static Logger LOGGER = LoggerFactory.getLogger(AbstractBaseController.class);

	protected abstract AbstractBaseService<T, ?> getService();

	public AbstractBaseController() {
		super();
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String list() {
		return "It is working";
	}

	@ExceptionHandler(InvalidObjectException.class)
	public ResponseEntity<String> handleException(InvalidObjectException ex) {
		LOGGER.error("InvalidObjectException", ex);
		return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ObjectAlreadyExistsException.class)
	public ResponseEntity<String> handleException(ObjectAlreadyExistsException ex) {
		LOGGER.error("ObjectAlreadyExistsException", ex);
		return new ResponseEntity(" already exists", HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ObjectCreationNotAllowedException.class)
	public ResponseEntity<String> handleException(ObjectCreationNotAllowedException ex) {
		LOGGER.error("ObjectAlreadyExistsException", ex);
		return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ObjectUpdationNotAllowedException.class)
	public ResponseEntity<String> handleException(ObjectUpdationNotAllowedException ex) {
		LOGGER.error("ObjectAlreadyExistsException", ex);
		return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(ObjectCannotDeleteException.class)
	public ResponseEntity<String> ObjectCannotDeleteException(ObjectCannotDeleteException ex) {
		LOGGER.error("ObjectCannotDeleteException", ex);
		return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(GenericSystemException.class)
	public ResponseEntity<String> GenericSystemException(GenericSystemException ex) {
		LOGGER.error("GenericSystemException", ex);
		return new ResponseEntity(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
