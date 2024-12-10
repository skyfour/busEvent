package com.zjp.busevent.event;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * @author skyfour
 * @date 12/9/24
 * @email skyzhang@easemob.com
 */

public class TestRemoteEvent extends RemoteApplicationEvent {

	public TestRemoteEvent() {

	}

	public TestRemoteEvent(String message, String originService, String destinationService) {
		super(message,originService, destinationService);
	}
}
