package com.cache.infini.service;

import com.cache.infini.config.CacheConfiguration;
import org.infinispan.Cache;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CacheService {

  public CacheConfiguration getCacheConfiguration(){
    return new CacheConfiguration();
  }

  public Map<String, String> getCache() {
    Cache<String, String> cache = null;
    try {
      cache = getCacheConfiguration().embeddedCacheManager().getCache("Samples");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return cache;
  }

  public void putCache(String k, String v) {
    Cache<String, String> cache = null;
    try {
      cache = getCacheConfiguration().embeddedCacheManager().getCache("Samples");
      cache.put(k, v);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}
