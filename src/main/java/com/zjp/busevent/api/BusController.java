package com.zjp.busevent.api;

import com.zjp.busevent.event.TestRemoteEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.bus.BusProperties;
import org.springframework.cloud.bus.event.RefreshRemoteApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author skyfour
 * @date 12/9/24
 * @email skyzhang@easemob.com
 */
@RestController
public class BusController {


	@Autowired
	private ApplicationEventPublisher eventPublisher;

	@Autowired
	private BusProperties busProperties;

	@GetMapping("/publish/event")
	public boolean publishEvent() {

		/**
		 * 注意 originService字段一定要填写,只有是自己服务的事件才会被bridge发送出去
		 *
		 */
		TestRemoteEvent event = new TestRemoteEvent("test", busProperties.getId(), null);

		eventPublisher.publishEvent(event);

//		eventPublisher.publishEvent(new RefreshRemoteApplicationEvent());

		return true;
	}
}
