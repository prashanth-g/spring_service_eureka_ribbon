package com.prashanth.spring.ribbon;

import com.netflix.loadbalancer.BestAvailableRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbobRule() {
        return new BestAvailableRule();
    }

    @Bean
    public IPing ribbobPing() {
        return new PingUrl();
    }
}
