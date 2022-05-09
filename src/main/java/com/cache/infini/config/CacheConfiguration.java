package com.cache.infini.config;

import org.infinispan.manager.DefaultCacheManager;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CacheConfiguration {

  @Primary
  @Bean
  public EmbeddedCacheManager embeddedCacheManager() throws Exception{
    System.setProperty("java.net.preferIPv4Stack" , "true");
    return new DefaultCacheManager("infinispan.xml");
  }

}