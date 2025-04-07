package com.lft.boot.starter;

import com.lft.imodel.aop.ControllerIntercept;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(ControllerIntercept.class)
@ConditionalOnWebApplication
public class AutoConfiguration {

}
