package com.atomikos.datasource.pool.event;

import com.atomikos.datasource.pool.XPooledConnection;

public class PooledConnectionCreatedEvent extends PooledConnectionEvent {

	private static final long serialVersionUID = 1L;
	
	public PooledConnectionCreatedEvent(String uniqueResourceName, XPooledConnection pc) {
		super(uniqueResourceName, pc);
	}

}
