package com.cache.infini.controller;

import com.cache.infini.service.CacheService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("cache")
public class CacheController {

  @GetMapping
  public Map<String, String> getCache(){
    CacheService cacheService = new CacheService();
    return cacheService.getCache();
  }

  @PutMapping
  public void putCache(String key, String value){
    CacheService cacheService = new CacheService();
    cacheService.putCache(key, value);
  }

}
