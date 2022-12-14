package com.javacle.econ.managers;

import com.javacle.econ.Econ;

import java.io.File;
import java.io.IOException;

public class FileManager {

    private Econ econ;

    public FileManager(Econ econ) {
        this.econ = econ;
    }


    public void setup(){
        File a = econ.getDataFolder();
        a.mkdir();
        File f = econ.getFile();
        if(!f.exists()){
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
