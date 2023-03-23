#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*
 * catxu.github.io Inc.
 * Copyright (c) 2023 All Rights Reserved
 */
package ${package};

import com.oak.boot.init.OakBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author catxu
 */
@OakBootApplication(sysName = "${rootArtifactId}")
public class Main extends SpringBootServletInitializer {

    public Main() {
        setRegisterErrorPageFilter(false);
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Main.class);
    }
}