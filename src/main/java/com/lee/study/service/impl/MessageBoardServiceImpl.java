package com.lee.study.service.impl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.lee.study.domain.Message;
import com.lee.study.service.MessageBoardService;

/**
 * @description 留言板服务类的实现
 * @author AlexLee
 * @createTime 2013-4-11 下午4:22:38
 * 
 * @TypeName com.lee.study.service.impl.MessageBoardServiceImpl
 */
@Service("messageBoardService")
public class MessageBoardServiceImpl implements MessageBoardService{

	private static Map<Long,Message> messages = new LinkedHashMap<Long,Message>();
	
	static{
		Message message = new Message();
		message.setAuthor("xuwei");
		message.setTitle("haoya");
		message.setBody("rencai");
		messages.put((long)1234, message);
	}
	
	@Override
	public List<Message> listMessages() {
		return new ArrayList<Message>(messages.values());
	}

	@Override
	public synchronized void postMessage(Message message) {
		message.setId(System.currentTimeMillis());
		messages.put(message.getId(), message);
	}

	@Override
	public synchronized void deleteMessage(Message message) {
		messages.remove(message);
	}

	@Override
	public Message findMessageById(Long messageId) {
		return messages.get(messageId);
	}

}
