package com.comakeit.pims.data.vo.base;

import java.io.Serializable;

//@JsonInclude(Include.NON_EMPTY)
//@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class AbstractBaseVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1084397824835113274L;

	private String id;
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
