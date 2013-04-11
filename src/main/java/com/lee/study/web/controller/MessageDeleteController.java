package com.lee.study.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lee.study.domain.Message;
import com.lee.study.service.MessageBoardService;

/**
 * @description 删除一个留言
 * 
 * @author lee
 * @createTime 2013-4-11 下午10:42:57 
 *
 * @Type com.lee.study.web.controller.MessageDeleteController
 */
@Controller
@RequestMapping("/messageDelete*")
public class MessageDeleteController {
	
	@Autowired
	private MessageBoardService messageBoardService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String messageDelete(@RequestParam(required = true,
			value="messageId") Long messageId,Model model){
		
		Message message  = messageBoardService.findMessageById(messageId);
		
		messageBoardService.deleteMessage(message);
		
		model.addAttribute("messages", messageBoardService.listMessages());
		
		return "redirect:messageList";
	}
	
}
