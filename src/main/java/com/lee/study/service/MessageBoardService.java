package com.lee.study.service;

import java.util.List;

import com.lee.study.domain.Message;

/**
 * @description 留言板接口
 * @author AlexLee
 * @createTime 2013-4-11 下午4:18:29
 * 
 * @TypeName com.lee.study.domain.MessageBoardService
 */
public interface MessageBoardService {

	/**
	 * 显示所有的信息
	 * @return
	 */
	List<Message> listMessages();
	/**
	 * 保存一个Message
	 * @param message
	 */
	void postMessage(Message message);
	/**
	 * 删除一个留言
	 * @param message
	 */
	void deleteMessage(Message message);
	/**
	 * 通过ID查找到Message
	 * @param messageId
	 * @return
	 */
	Message findMessageById(Long messageId);
}
