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

import com.aliyun.openservices.ons.api.PropertyKeyConst;
import com.github.thierrysquirrel.annotation.RocketMessage;
import com.github.thierrysquirrel.autoconfigure.RocketProperties;

import java.util.Properties;

/**
 * ClassName: ProducerPropertiesFactory
 * Description:
 * date: 2019/4/28 21:21
 *
 * @author ThierrySquirrel
 * @since JDK 1.8
 */
public class ProducerPropertiesFactory {
	private ProducerPropertiesFactory() {
	}

	public static Properties createProducerProperties(RocketMessage rockerMessage, RocketProperties rocketProperties) {
		Properties properties = PropertiesFactory.createProperties(rocketProperties);
		properties.put(PropertyKeyConst.SendMsgTimeoutMillis, rocketProperties.getSendMsgTimeoutMillis());
		properties.put(PropertyKeyConst.GROUP_ID, rockerMessage.groupID());
		return properties;
	}

}
