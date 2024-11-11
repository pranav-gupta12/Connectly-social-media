package com.connectly.service;

import java.util.List;

import com.connectly.models.Chat;
import com.connectly.models.User;

public interface ChatService {

	public Chat createChat(User reqUser, User user2);
	
	public Chat findChatById (Integer chatId) throws Exception;
	
	public List<Chat> findUsersChat(Integer userId);
	
	
}
