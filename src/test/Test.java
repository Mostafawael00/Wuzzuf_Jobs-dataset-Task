/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;

/**
 *
 * @author Mostafa Wael Abdel Aziz Hanafy
 *      Sec 4
 */



class Test {
    public static void test(){
        List<WuzzufJobDetails> Jobs=ReadFile.ReadCsvFile("Wuzzuf_Jobs.csv");
        
        
        WuzzufDataSet.JobsTitle(Jobs);
        WuzzufDataSet.JobsLevel(Jobs);
        WuzzufDataSet.JobsYearsExperiance(Jobs);
        WuzzufDataSet.JobsCountry(Jobs);
    }
    
}
