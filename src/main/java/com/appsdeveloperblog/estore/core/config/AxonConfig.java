package com.appsdeveloperblog.estore.core.config;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxonConfig {
    @Bean
    XStream xstream() {
        XStream xstream = new XStream();
        xstream.addPermission(AnyTypePermission.ANY);
//        xstream.allowTypesByWildcard(new String[]{
//                "com.appsdeveloperblog.estore.**",
//                "org.axonframework.**",
//                "java.**",
//                "com.thoughtworks.xstream.**"
//        });

        return xstream;
    }

//    @Bean
//    @Primary
//    public Serializer serializer(XStream xStream) {
//        return XStreamSerializer.builder().xStream(xStream).build();
//    }
}
