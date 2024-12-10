package com.zjp.busevent.listener;

import com.zjp.busevent.event.TestRemoteEvent;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;
import org.springframework.context.annotation.Configuration;

/**
 * @author skyfour
 * @date 12/9/24
 * @email skyzhang@easemob.com
 */
@Configuration
public class EventListener {


	@org.springframework.context.event.EventListener
	public void onCustomRemoteApplicationEvent(TestRemoteEvent event) {
		System.out.println("Received remote event: " + event);
	}
}
