package in.kkcoding.Challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap
{
    public static void main(String[] args)
    {
        Map<String, String> countryMap= new HashMap<>();

        countryMap.put("BHARAT", "NEW-DELHI");
        countryMap.put("SHRI LANKA", "COLOMBO");
        countryMap.put("PAKISTAN", "ISLAMABAD");
        countryMap.put("CHINA", "BEIJING");
        countryMap.put("BANGLADESH", "DHAKA");

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Country name: ");
        String str=sc.next();

        if(countryMap.containsKey(str))
        {
            System.out.printf("Capital of %s is %s.",str, countryMap.get(str));
        }else
        {
            System.out.println("Sorry, we don't know the capital.");
        }
    }
}
