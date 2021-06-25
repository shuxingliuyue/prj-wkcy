package com.kaiwang.prjwkcy.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import xyz.erupt.core.annotation.EruptScan;

@Configuration
@ComponentScan({"xyz.erupt","com.kaiwang.prjwkcy"})
@EntityScan({"xyz.erupt","com.kaiwang.prjwkcy"})
@EruptScan({"xyz.erupt","com.kaiwang.prjwkcy"})
public class EruptConfig {
}
