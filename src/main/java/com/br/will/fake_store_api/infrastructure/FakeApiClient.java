package com.br.will.fake_store_api.infrastructure;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "fake-api", url = "${fake-api.url:#{null}}")
public interface FakeApiClient {

}
