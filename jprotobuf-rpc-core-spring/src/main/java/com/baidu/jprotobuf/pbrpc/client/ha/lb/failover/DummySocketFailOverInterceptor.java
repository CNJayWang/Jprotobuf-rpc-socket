/*
 * Copyright 2002-2014 the original author or authors.
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
package com.baidu.jprotobuf.pbrpc.client.ha.lb.failover;

/**
 * Dummy {@link FailOverInterceptor} instance to close fail over feature
 *
 * @author xiemalin
 * @since 3.1.3
 */
public class DummySocketFailOverInterceptor extends SocketFailOverInterceptor {

    /*
     * (non-Javadoc)
     * 
     * @see com.baidu.jprotobuf.pbrpc.client.ha.lb.failover.FailOverInterceptor#isDoFailover(java.lang.Throwable,
     * java.lang.String)
     */
    @Override
    public boolean isDoFailover(Throwable t, String beanKey) {
        return false;
    }

}
