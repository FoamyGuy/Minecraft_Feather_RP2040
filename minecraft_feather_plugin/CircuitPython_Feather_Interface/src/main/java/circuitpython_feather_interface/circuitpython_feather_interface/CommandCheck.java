package circuitpython_feather_interface.circuitpython_feather_interface;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandCheck implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player){
            Player player  = (Player) sender;
            Location playerLoc = player.getLocation();
            Location loc = new Location(playerLoc.getWorld(),playerLoc.getBlockX(),playerLoc.getBlockY() - 1,playerLoc.getBlockZ());

            //System.out.println(loc.getBlock().getBlockData());
            System.out.println(player.getTargetBlockExact(5).getLocation());


        }

        return false;

    }
}
