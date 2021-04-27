/**
 * Copyright 2019 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.thierrysquirrel.core.factory.execution;


import com.github.thierrysquirrel.annotation.RocketMessage;
import com.github.thierrysquirrel.core.strategy.ProducerStrategy;
import com.github.thierrysquirrel.error.RocketException;
import com.github.thierrysquirrel.thread.AbstractSendMessageThread;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;

import java.util.Map;


/**
 * ClassName: SendMessageFactoryExecution
 * Description:
 * date: 2019/4/28 21:31
 *
 * @author ThierrySquirrel
 * @since JDK 1.8
 */
@Slf4j
public class SendMessageFactoryExecution extends AbstractSendMessageThread {


	public SendMessageFactoryExecution(Long startDeliverTime, Map<String, Object> consumerContainer, RocketMessage rocketMessage, Object message, byte[] bytes, ApplicationContext applicationContext) {
		super(startDeliverTime,consumerContainer, rocketMessage, message, bytes, applicationContext);
	}

	/**
	 * 开始发送消息
	 * @param startDeliverTime   startDeliverTime
	 * @param consumerContainer  consumerContainer
	 * @param rocketMessage      rocketMessage
	 * @param message            message
	 * @param bytes              bytes
	 * @param applicationContext applicationContext
	 */
	@Override
	protected void statsSendMessage(Long startDeliverTime,Map<String, Object> consumerContainer, RocketMessage rocketMessage, Object message, byte[] bytes, ApplicationContext applicationContext) {
		try {
			ProducerStrategy.statsSendMessage(startDeliverTime,consumerContainer, rocketMessage, message, bytes, applicationContext);
		} catch (RocketException e) {
			log.error("statsSendMessage Error", e);
		}
	}
}

