package com.atomikos.util;

import junit.framework.TestCase;

public class UniqueIdMgrTestJUnit extends TestCase {

	private UniqueIdMgr idmgr;
	
	protected void setUp() throws Exception {
		super.setUp();
		idmgr = new UniqueIdMgr ( "./testserver" );
	}
	
	
	public void testGetReturnsUniqueId() {
		assertFalse(idmgr.get().equals(idmgr.get()));
	}

}