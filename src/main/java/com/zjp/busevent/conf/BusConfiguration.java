package com.zjp.busevent.conf;

import com.zjp.busevent.event.TestRemoteEvent;

import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author skyfour
 * @date 12/9/24
 * @email skyzhang@easemob.com
 */
@Configuration
@RemoteApplicationEventScan(basePackageClasses = TestRemoteEvent.class)
public class BusConfiguration {

}
