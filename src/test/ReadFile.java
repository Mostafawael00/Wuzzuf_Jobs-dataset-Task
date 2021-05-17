/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mostafa Wael Abdel Aziz Hanafy
 *      Sec 4
 */


public class ReadFile {
    public static List<WuzzufJobDetails> ReadCsvFile(String file_name)
    {
        String filename=file_name;
        List<WuzzufJobDetails> Jobs=new ArrayList<WuzzufJobDetails>();
        String line = "";

        try
        {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while ((line = br.readLine()) != null)
            {
                String[] Phrase = line.split(",");
                if (Phrase[0].toLowerCase().equals("title")){
                    continue;
                }else {
                    WuzzufJobDetails JobDetails =new WuzzufJobDetails();
                    JobDetails.setTitle(Phrase[0]);
                    JobDetails.setCompany(Phrase[1]);
                    JobDetails.setLocation(Phrase[2]);
                    JobDetails.setType(Phrase[3]);
                    JobDetails.setLevel(Phrase[4]);
                    JobDetails.setYearsExp(Phrase[5]);
                    JobDetails.setCountry(Phrase[6]);
                    JobDetails.setSkills(Phrase[7]);

                    Jobs.add(JobDetails);
                }

            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return Jobs;
    }
    
}
