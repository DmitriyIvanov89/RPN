package dfa;

import com.google.gson.Gson;
import java.io.*;

public class DFAConfigReader {

    private final String configPath;

    public DFAConfigReader(String configPath) {
        this.configPath = configPath;
    }

    public DFAConfig readConfigJson() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(configPath))) {
            return new Gson().fromJson(reader, DFAConfig.class);
        }
    }
}
