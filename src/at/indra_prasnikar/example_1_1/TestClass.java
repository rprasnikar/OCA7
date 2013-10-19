/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package at.indra_prasnikar.example_1_1;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author robert
 */
public class TestClass {
    /**
     *
     * @param args
     */
    public static void main(String args[]) throws IOException {
        new File("logs").mkdir();
        DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
        Date now = new Date();
        String date = df.format(now);
        String LogFileName = "logs\\testlog" + date + ".log";
        FileHandler myFileHandler = new FileHandler(LogFileName);
        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);
        ocajLogger.log(Level.INFO, "Mitschreiben");
        myFileHandler.close();
    }
}
