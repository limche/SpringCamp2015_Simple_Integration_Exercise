package com.springcamp.integration.exercise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.stereotype.Service;

/**
 * @author wglee21g@gmail.com
 */
@Service
public class MessageRouterServiceImpl implements MessageRouterService {
	@Autowired
	private JmsSender jmsSender;

	@Autowired
	private NodejsSender nodejsSender;

	@Override
	public void sendAtJms(String messageContent) {
		jmsSender.sendMessage(messageContent);
	}

	@Override
	public void sendAtNodejs(String messageContent) {
		nodejsSender.sendMessage(messageContent);
	}
}
