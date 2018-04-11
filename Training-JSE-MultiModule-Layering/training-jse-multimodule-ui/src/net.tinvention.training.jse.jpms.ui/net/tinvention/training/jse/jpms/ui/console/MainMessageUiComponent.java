package net.tinvention.training.jse.jpms.ui.console;

import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import net.tinvention.training.jse.jpms.logic.MessageLogic;
import net.tinvention.training.jse.jpms.logic.model.MessageModel;;

public class MainMessageUiComponent {
	private MessageLogic messageLogic;

	private void run() {

		messageLogic = getInstances().iterator().next();
		System.out.println("Using the messageLogic type: " + messageLogic.getClass());

		// Send default messages
		messageLogic.sendMessage(new MessageModel("Hello Stefano ! "));
		messageLogic.sendMessage(new MessageModel("Hello Paolo ! "));
		messageLogic.sendMessage(new MessageModel("Hello Michelle ! "));

		// Show messages sent
		System.out.println(messageLogic.getMessages());
	}

	public static void main(String[] args) {
		MainMessageUiComponent mainMessageUiComponent = new MainMessageUiComponent();
		mainMessageUiComponent.run();
	}
	
	private static List<MessageLogic> getInstances() {
		ServiceLoader<MessageLogic> services = ServiceLoader.load(MessageLogic.class);
		List<MessageLogic> list = new ArrayList<>();
		services.iterator().forEachRemaining(list::add);
		return list;
	}

}
