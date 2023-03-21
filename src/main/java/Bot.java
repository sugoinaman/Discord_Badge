import commands.SlashCommands.Hello;
import io.github.cdimascio.dotenv.Dotenv;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Bot {

    private static Dotenv config = null;


    public static void main(String[] args) {
        config = Dotenv.configure().load();
        String token = config.get("TOKEN");
        String guildid = config.get("GUILD");
        JDA jda = JDABuilder.createLight(token, GatewayIntent.GUILD_MESSAGES, GatewayIntent.GUILD_MEMBERS, GatewayIntent.MESSAGE_CONTENT).
                setActivity(Activity.watching("you")).
                build();
        jda.addEventListener(new Hello());
        jda.upsertCommand("hello", "Easy badge").queue();


    }
}
