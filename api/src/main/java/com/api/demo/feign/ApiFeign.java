package com.api.demo.feign;

import com.api.demo.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "api")
public interface ApiFeign {

    @RequestMapping(value ="/user/get/" )
    User select(@RequestParam("uId") Integer uId);
}
