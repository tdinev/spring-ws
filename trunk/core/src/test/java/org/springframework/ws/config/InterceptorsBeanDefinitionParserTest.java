/*
 * Copyright 2005-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.config;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ws.server.endpoint.interceptor.DelegatingSmartEndpointInterceptor;
import org.springframework.ws.server.endpoint.interceptor.PayloadRootSmartEndpointInterceptor;
import org.springframework.ws.soap.server.endpoint.interceptor.SoapActionSmartEndpointInterceptor;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InterceptorsBeanDefinitionParserTest {

    private ApplicationContext applicationContext;

    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("interceptorsBeanDefinitionParserTest.xml", getClass());
    }

    @Test
    public void namespace() throws Exception {
        Map<String, ?> result = applicationContext.getBeansOfType(DelegatingSmartEndpointInterceptor.class);
        assertEquals("no smart interceptors found", 5, result.size());

        result = applicationContext.getBeansOfType(PayloadRootSmartEndpointInterceptor.class);
        assertEquals("no interceptors found", 2, result.size());

        result = applicationContext.getBeansOfType(SoapActionSmartEndpointInterceptor.class);
        assertEquals("no interceptors found", 2, result.size());
    }

}
