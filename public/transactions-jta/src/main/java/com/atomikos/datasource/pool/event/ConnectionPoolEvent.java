package com.atomikos.datasource.pool.event;

import com.atomikos.icatch.event.Event;

public abstract class ConnectionPoolEvent extends Event {

	private static final long serialVersionUID = 1L;
	
	public String uniqueResourceName;

	protected ConnectionPoolEvent(String uniqueResourceName) {
		this.uniqueResourceName = uniqueResourceName;
	}
}
