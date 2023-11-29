package data_access;

import entity.CommonUser;
import use_case.open_inbox.OpenInboxUserDataAccessInterface;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.io.*;

public class FileUserDataAccessObject implements OpenInboxUserDataAccessInterface {

    private File csvFile;

    private Map<String, Integer> headers = new LinkedHashMap<>();

    private final Map<String, CommonUser> accounts = new HashMap<>();

    // Add userfactory

    public FileUserDataAccessObject(String csvPath) throws IOException {

        //csvFile = new File(csvpath);
        headers.put("username", 0);
        headers.put("password", 1);
        headers.put("creation_time", 2);

        if (csvFile.length() == 0) {
            //save();
        }
    }


}
