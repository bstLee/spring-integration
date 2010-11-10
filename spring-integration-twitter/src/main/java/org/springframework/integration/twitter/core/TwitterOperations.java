/*
 * Copyright 2002-2010 the original author or authors
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 */
package org.springframework.integration.twitter.core;

import java.util.List;

import twitter4j.Twitter;

/**
 * @author Oleg Zhurakousky
 * @since 2.0
 *
 */
public interface TwitterOperations {

	String getProfileId();
	
	List<Tweet> getDirectMessages();
	
	List<Tweet> getDirectMessages(long sinceId);
	
	List<Tweet> getMentions();
	
	List<Tweet> getMentions(long sinceId);
	
	List<Tweet> getFriendsTimeline();
	
	List<Tweet> getFriendsTimeline(long sinceId);
	
	void sendDirectMessage(String userName, String text);
	
	void sendDirectMessage(int userId, String text);
	
	void updateStatus(Tweet status);
	
	Twitter getUnderlyingTwitter();
}