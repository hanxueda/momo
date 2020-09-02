package com.momo.usercenter.feignclient;

import com.momo.usercenter.domain.dto.abc.AbcDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "content-center")
public interface ContentCenterFeignClient {

    @GetMapping("/abc/detail")
    AbcDto getAbc();
}
