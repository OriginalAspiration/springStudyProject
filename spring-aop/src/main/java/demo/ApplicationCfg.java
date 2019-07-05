package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

/**
 * 容器的配置类
 */
@Configuration
@ComponentScan(basePackages="demo")
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ApplicationCfg {
}
