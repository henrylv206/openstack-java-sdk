package org.openstack.swift.api;

import javax.xml.ws.Response;

import org.openstack.base.client.OpenStackClient;
import org.openstack.base.client.OpenStackRequest;

public class DeleteObject extends OpenStackRequest {

	private String containerName;
	
	private String objectName;
	
	public DeleteObject(String containerName, String objectName) {
		this.containerName = containerName;
		this.objectName = objectName;
		//return target.path(containerName).path(objectName).request(MediaType.APPLICATION_JSON).delete();
	}

}
