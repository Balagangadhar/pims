package com.comakeit.pims.data.dto.base;

import java.io.Serializable;

//@JsonInclude(Include.NON_EMPTY)
//@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractBaseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1084397824835113274L;

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
