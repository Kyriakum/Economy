package com.javacle.econ.managers;

import com.javacle.econ.Econ;

import java.io.File;
import java.io.IOException;

public class FileManager {

    private Econ econ;
    private File file;

    public FileManager(Econ econ) {
        this.econ = econ;
        file = new File(econ.getDataFolder(), "chips.yml");
        econ.getDataFolder().mkdir();
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {

            }

        }
    }

    public File getFile() { return file;}


}
