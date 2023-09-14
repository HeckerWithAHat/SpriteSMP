package gmail.aryanj1010.spritesmp.API;

import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.UUID;

public class AbilityWithCoolDown {

    public AbilityWithCoolDown(HashMap<UUID, Long> cdHM, Runnable ability, int cooldownLength, Player runner) {
        if (!cdHM.containsKey(runner.getUniqueId())) {
            ability.run();
            cdHM.put(runner.getUniqueId(), System.currentTimeMillis());
        } else {
            long timeElapsed = System.currentTimeMillis() - cdHM.get(runner.getUniqueId());
            if (timeElapsed >= cooldownLength * 1000L) {
                ability.run();
                cdHM.put(runner.getUniqueId(), System.currentTimeMillis());
            } else {
                runner.sendMessage(cooldownLength + " seconds hasn't passed! Please Wait " + Math.round((float) (((cooldownLength * 1000L) - timeElapsed) / 1000)) + " seconds");
            }
        }
    }
}
