package priv.yzwbblan.pms.rest.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import priv.yzwbblan.pms.rest.auth.filter.AuthFilter;
import priv.yzwbblan.pms.rest.auth.security.DataSecurityAction;
import priv.yzwbblan.pms.rest.auth.security.impl.Base64SecurityAction;
import priv.yzwbblan.pms.rest.config.properties.RestProperties;

/**
 * web配置
 *
 * @author fengshuonan
 * @date 2017-08-23 15:48
 */
@Configuration
public class WebConfig {

    @Bean
    @ConditionalOnProperty(prefix = RestProperties.REST_PREFIX, name = "auth-open", havingValue = "true", matchIfMissing = true)
    public AuthFilter jwtAuthenticationTokenFilter() {
        return new AuthFilter();
    }

    @Bean
    public DataSecurityAction dataSecurityAction() {
        return new Base64SecurityAction();
    }
}
