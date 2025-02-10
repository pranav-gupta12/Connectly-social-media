//package com.connectly.controller;
//
//import java.util.Iterator;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.messaging.handler.annotation.DestinationVariable;
//import org.springframework.messaging.handler.annotation.Header;
//import org.springframework.messaging.handler.annotation.MessageMapping;
//import org.springframework.messaging.handler.annotation.Payload;
//import org.springframework.messaging.handler.annotation.SendTo;
//import org.springframework.messaging.simp.SimpMessagingTemplate;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.connectly.exception.ChatException;
//import com.connectly.exception.UserException;
//import com.connectly.model.Chat;
//import com.connectly.model.Message;
//import com.connectly.model.User;
//import com.connectly.request.SendMessageRequest;
//import com.connectly.service.ChatService;
//import com.connectly.service.MessageService;
//import com.connectly.service.UserService;
//
//
//
//@RestController
//public class RealTimeChat {
//	
//    @Autowired
//    private SimpMessagingTemplate simpMessagingTemplate;
//    
//    @Autowired
//    private UserService userService;
//    
//    @Autowired
//    private MessageService messageService;
//    
//    @Autowired
//    private ChatService chatService;
//	  
//	@MessageMapping("/chat/{groupId}")
//	public Message sendToUser(
//		@Payload Message message, 
//		@DestinationVariable String groupId) 
//		throws UserException, ChatException {	
//
//		simpMessagingTemplate.convertAndSendToUser(
//			groupId, 
//			"/private", 
//			message
//		);
//		return message;
//	}
//	
//	public User reciver(Chat chat,User reqUser) {
//		Iterator<User> iterator = chat.getUsers().iterator();
//
//		User user1 = iterator.next(); // get the first user
//		User user2 = iterator.next();
//		
//		if(user1.getId().equals(reqUser.getId())){
//			return user2;
//		}
//		return user1;
//	}
//	
//
//	
//
//}