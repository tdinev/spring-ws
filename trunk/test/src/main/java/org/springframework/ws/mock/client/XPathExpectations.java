/*
 * Copyright 2005-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.ws.mock.client;

/**
 * Allows for setting up expectations on XPath expressions.
 * <p/>
 * Implementations of this interface are returned by {@link WebServiceMock#xpath(String)} and {@link
 * WebServiceMock#xpath(String, java.util.Map)}, as part of the fluent API. As such, it is not typical to implement this
 * interface yourself.
 *
 * @author Lukas Krecan
 * @author Arjen Poutsma
 * @see WebServiceMock#xpath(String)
 * @see WebServiceMock#xpath(String, java.util.Map)
 * @since 2.0
 */
public interface XPathExpectations {

    /**
     * Expects the XPath expression to exist.
     *
     * @return the request matcher
     */
    RequestMatcher exists();

    /**
     * Expects the XPath expression to not exist.
     *
     * @return the request matcher
     */
    RequestMatcher doesNotExist();

    /**
     * Expects the XPath expression to evaluate to the given boolean.
     *
     * @param expectedValue the expected value
     * @return the request matcher
     */
    RequestMatcher evaluatesTo(final boolean expectedValue);

    /**
     * Expects the XPath expression to evaluate to the given integer.
     *
     * @param expectedValue the expected value
     * @return the request matcher
     */
    RequestMatcher evaluatesTo(int expectedValue);

    /**
     * Expects the XPath expression to evaluate to the given double.
     *
     * @param expectedValue the expected value
     * @return the request matcher
     */
    RequestMatcher evaluatesTo(double expectedValue);

    /**
     * Expects the XPath expression to evaluate to the given string.
     *
     * @param expectedValue the expected value
     * @return the request matcher
     */
    RequestMatcher evaluatesTo(String expectedValue);

}
