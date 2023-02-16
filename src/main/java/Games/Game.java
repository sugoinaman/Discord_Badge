package Games;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class Game extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        Message message=event.getMessage();
        String content=message.getContentRaw();
        if(message.equals("!play")&&!event.getAuthor().isBot()){
            event.getChannel().sendMessage("Game Started!").queue();
        }
    }
}
