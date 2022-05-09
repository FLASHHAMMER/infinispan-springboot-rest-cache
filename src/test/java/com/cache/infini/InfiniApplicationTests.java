package com.cache.infini;

import com.cache.infini.controller.CacheController;
import com.cache.infini.controller.TestHelloController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class InfiniApplicationTests {

    public CacheController getCacheController(){
        return new CacheController();
    }
    public TestHelloController getTestHelloController(){
        return new TestHelloController();
    }

    @Test
    void contextLoads() {
        assertThat(this.getCacheController()).isNotNull();
    }

    @Test
    void hello() {
        assertThat(this.getTestHelloController().hello().size()).isEqualTo(1);
    }

}
