package commands;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class InviteCommand extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        String[] message=e.getMessage().getContentRaw().split(" ");
        if(message[0].equals("!invite")){
            e.getChannel().sendMessage("Invite link: "+e.getAuthor().getName()+"    \n"+e.getChannel().asTextChannel().createInvite().complete().getUrl()).queue();

        }
    }
}
