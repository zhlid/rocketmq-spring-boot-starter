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

package com.github.thierrysquirrel.core.factory;

import com.aliyun.openservices.ons.api.Message;
import com.github.thierrysquirrel.annotation.CommonMessage;
import com.github.thierrysquirrel.annotation.OrderMessage;
import com.github.thierrysquirrel.annotation.TransactionMessage;

/**
 * ClassName: MessageFactory
 * Description:
 * date: 2019/4/28 21:55
 *
 * @author ThierrySquirrel
 * @since JDK 1.8
 */
public class MessageFactory {
	private MessageFactory() {
	}

	public static Message createMessage(CommonMessage commonMessage, byte[] body) {
		return new Message(commonMessage.topic(),
				commonMessage.tag(),
				body);
	}

	public static Message createMessage(OrderMessage orderMessage, byte[] body) {
		return new Message(orderMessage.topic(),
				orderMessage.tag(),
				body);
	}

	public static Message createMessage(TransactionMessage transactionMessage, byte[] body) {
		return new Message(transactionMessage.topic(),
				transactionMessage.tag(),
				body);
	}
}
