/////You make seperate three classes and create three seperate java files and execute...

/******Below is the main class***//
import java.util.*;
public class week1 {


      public static void main(String[] args) {


            Country[] listCntry= new Country[100];
            CountryBO coun=new CountryBO();

            int count=0;

          String ChoiceToContinue="YES";

          System.out.println("Menu:");

          System.out.println("Type any number between 1 and 6");

          System.out.println("1)Create a new country");

          System.out.println("2)Display details of a specific country");

          System.out.println("3)Display the details of all countries");

          System.out.println("4)Display the ISD codes of all countries");

          System.out.println("5)Update ISD code of a specific country");

          System.out.println("6)Exit");

          Scanner sc= new Scanner(System.in);

          while(ChoiceToContinue.equalsIgnoreCase("YES"))

          {

            System.out.println("Enter your choice" );

            int choice=sc.nextInt();

            switch(choice)

            {

            case 1:

             System.out.println("Enter Country Details" );

             String data=sc.next();

             listCntry[count++]=coun.createCountry(data);

             System.out.println("Do you want to continue? Type Yes / No");

             ChoiceToContinue=sc.next();

             break;

            case 2:

                  System.out.println("Enter the name of the country to be searched" );

                  String cntry=sc.next();

                  coun.displaySpecificCountryDetails(listCntry,cntry,count);

                  System.out.println("Do you want to continue? Type Yes / No");

                  ChoiceToContinue=sc.next();

                  break;

            case 3:

                  System.out.println("Details of all countries" );

                  coun.displayAllCountryDetails(listCntry,count);

                  System.out.println("Do you want to continue? Type Yes / No");

                  ChoiceToContinue=sc.next();

                  break;

            case 4:

                  System.out.println("ISD codes of all countries" );

                  coun.displayAllCountryNameAndIsdCode(listCntry,count);

                  System.out.println("Do you want to continue? Type Yes / No");

                   ChoiceToContinue=sc.next();

                   break;

            case 5:

                  System.out.println("Enter the name of the country for which the isd code needs to be updated" );

                  cntry=sc.next();

                  System.out.println("Enter the new ISD code" );

                  String isdcode=sc.next();

                  coun.updateIsdCodeOfSpecificCountry(listCntry,cntry,isdcode,count);

                  System.out.println("Do you want to continue? Type Yes / No");

                   ChoiceToContinue=sc.next();

                   break;

            case 6:

                  System.exit(0);
                  break;

            default:

                  System.exit(0);

                 

                 }

          }

          sc.close();

            }
      
 

      }




////***Below is the Country class *///

public class Country {


          String name;

          String isdCode;

          String countryCode;

          public String getName()

          {

                return name;
             
          }

         

          public void setName(String name)

          {

                this.name=name;

          }

         

          public String getcountryCode()

          {

          return countryCode;   

          }

         

          public void setCountryCode(String countryCode)

          {

                this.countryCode=countryCode;

          }

         

          public String getIsdCode()

          {

          return isdCode;

         

          }

         

          public void setIsdCode(String isdCode)

          {

          this.isdCode=isdCode;

          }

         

          @Override

          public String toString()

          {

          return "Country{name=" + name + ", countryCode=" + countryCode + ", isdCode=" + isdCode

          + "}";    

          }

         

         

          }



/////***Below is the CountryBO class*////

public class CountryBO 
{

    protected CountryBO()

    {
    super();   
    }

   

    Country createCountry(String data)

    {

    String[] temp=data.split(",");

    Country cntry=new Country();
    cntry.setName(temp[0]);
    cntry.setCountryCode(temp[1]);
    cntry.setIsdCode(temp[2]);

    return cntry;
    
    }

    void displaySpecificCountryDetails(Country[] countryList,String CountryName,int countryCount)

     {
          boolean check=true;

          if(countryCount>0)
          {

                for(int i=0;i<countryCount;i++)
                {
               
                     Country cntry=countryList[i];
                String temp=cntry.getName();
                 
 
                   if(temp.equalsIgnoreCase(CountryName))

                   {

                   check=false;

                   System.out.println(countryList[i].toString());

                    break;
 
                    }

                  }

              }

                 if(check)

                   { 

                     System.out.println("Country by name " + CountryName + " is not found");

                    }
                 
     }
    
    void displayAllCountryDetails(Country[] countryList,int countryCount)
    
    {
    
    for(int i=0;i<countryCount;i++)
    {
    System.out.println(countryList[i].toString());
    
    }
    
    
    }
    
    
    
     void displayAllCountryNameAndIsdCode(Country[] countryList,int countryCount)
     {
    for(int i=0;i<countryCount;i++)
    {
           System.out.println("{name=" +countryList[i].getName()+ ", isdCode=" +countryList[i].getIsdCode()+ "}");
    }
      }
     
     
     
 
     void updateIsdCodeOfSpecificCountry(Country[] countryList,String CountryName, String isdCode,int countryCount )
     { 
    for(int i=0;i<countryCount;i++)
    {
     
      if(countryList[i].getName().equalsIgnoreCase(CountryName))
      {
      countryList[i].setIsdCode(isdCode);
      
          }
    }
      
     }   
     
}

