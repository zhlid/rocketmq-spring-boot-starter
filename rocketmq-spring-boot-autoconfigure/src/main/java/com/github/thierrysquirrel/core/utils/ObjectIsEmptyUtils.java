/**
 * Copyright 2020 the original author or authors.
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

package com.github.thierrysquirrel.core.utils;

import org.springframework.util.ObjectUtils;

/**
 * ClassName: ObjectIsEmptyUtils
 * Description:
 * date: 2020/1/29 19:19
 *
 * @author ThierrySquirrel
 * @since JDK 1.8
 */
public class ObjectIsEmptyUtils {
	private ObjectIsEmptyUtils() {
	}

	public static boolean isEmpty(Object obj) {
		return ObjectUtils.isEmpty(obj);
	}

	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}
}
