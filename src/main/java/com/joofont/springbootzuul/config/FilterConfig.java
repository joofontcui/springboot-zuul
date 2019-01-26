package com.joofont.springbootzuul.config;

import com.joofont.springbootzuul.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cui jun on 2018/12/12.
 * @version 1.0
 */
@Configuration
public class FilterConfig {

    @Bean
    public TokenFilter tokenFilter() {
        return new TokenFilter();
    }

}
