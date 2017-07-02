package com.alibaba.dubbo.monitor.simple;

import java.io.Serializable;

public enum MonitorType implements Serializable {
	SUCCESS("zhizi_core_request_count"),
	REQUEST_CACHE_COUNT("zhizi_core_request_cache_count"),
	REQUEST_L1CACHE_COUNT("zhizi_core_request_L1cache_count"),
	REQUEST_NOCACHE_COUNT("zhizi_core_request_nocache_count"),
	FALLBACK_REQUEST_COUNT("zhizi_core_fallback_request_count"),
	CACHE_RESPONSE_TIME("zhizi_core_cache_response_time"),
	NO_CACHE_RESPONSE_TIME("zhizi_core_no_cache_response_time"),
	RESPONSE_TIME_GT_200("zhizi_core_response_time_gt_200");
	
	
	private String type;
	
	private MonitorType(String type)
	{
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
