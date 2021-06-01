package DFA;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DFAConfigReader {

    private String configPath;

    public DFAConfigReader(String configPath) {
        this.configPath = configPath;
    }

    public DFAConfig readConfigJson() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(configPath))) {
            return new Gson().fromJson(reader, DFAConfig.class);
        }
    }
}
