package com.lee.study.web.controller;

import java.util.Collections;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lee.study.domain.Message;
import com.lee.study.service.MessageBoardService;

/**
 * @description 创建控制器和页面视图
 * @author AlexLee
 * @createTime 2013-4-11 下午4:51:22
 * 
 * @TypeName com.lee.study.web.controller.MessageListController
 */
@Controller
@RequestMapping("/messageList*")
public class MessageListController {

	@Autowired
	private MessageBoardService messageBoardService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String generateList(Model model){
		
		List<Message> messages = Collections.emptyList();
		
		messages = messageBoardService.listMessages();
		model.addAttribute("messages",messages);
		
		return "messageList";
	}
}
