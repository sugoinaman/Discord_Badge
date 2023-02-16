import Games.Game;
import commands.InviteCommand;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Bot {
    public static void main(String[] args) {
        JDA jda= JDABuilder.createLight("MTA3NTMzMzA1MzQ2MDc5MTQwOQ.G3krtT.fe0oZ-PKEGvToW8Hg_5tY0VpDO4DsvDQZYhMbk", GatewayIntent.GUILD_MESSAGES,GatewayIntent.GUILD_MEMBERS,GatewayIntent.MESSAGE_CONTENT).
                setActivity(Activity.watching("you")).
                build();
        jda.addEventListener(new InviteCommand());
        jda.addEventListener(new Game());

    }
}
