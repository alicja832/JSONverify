package org.example;
import java.io.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Verification {

    /**
     * Static method
     * @param Filepath - Path to the JSON data file
     * @return Returns false if the JSON file contains
     * a single asterisk in the 'resource' field,
     * and true otherwise
     */
    public static boolean verify(String Filepath)
    {

        JSONParser parser = new JSONParser();

        try {

            InputStreamReader in = new InputStreamReader(new FileInputStream( Filepath ));
            Object obj = parser.parse(in);
            if(obj == null) return true;

            JSONObject jsonObject =  (JSONObject) obj;

            JSONObject jsonObject1 = (JSONObject) jsonObject.get("PolicyDocument");
            if(jsonObject1 == null) return true;

            JSONArray jsonArray = (JSONArray) jsonObject1.get("Statement");
            if(jsonArray == null) return true;

            for(Object i:jsonArray)
            {
                String resource = (String) ((JSONObject)i).get("Resource");
                if(resource != null && resource.equals("*"))
                    return false;
            }
            in.close();


        } catch (FileNotFoundException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        } catch (ParseException e)
        {
            e.printStackTrace();
        }
        return true;
    }
}

