package gmail.aryanj1010.spritesmp.files;

import gmail.aryanj1010.spritesmp.SpriteSMP;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class AbstractFile {

    protected SpriteSMP main;
    private File file;
    protected FileConfiguration config;

    public AbstractFile(SpriteSMP main, String fileName) {
        this.main = main;
        this.file = new File(main.getDataFolder(), fileName);
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        this.config = YamlConfiguration.loadConfiguration(file);
    }
    public void save() {
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
