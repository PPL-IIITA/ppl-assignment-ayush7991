/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sampleppl;
import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author silentwraith
 */

public class Sampleppl {

    /**
     * @param args the command line arguments
     */
     private static void generateCsvFile(String fileName) {
    FileWriter writer = null;
    Random random = new Random();

 try {
     writer = new FileWriter(fileName);
     writer.append("name");
     writer.append(',');
     writer.append("attractive");   
     writer.append(',');
     writer.append("intelligence");
     writer.append(',');
     writer.append("budget");
     writer.append(',');
     writer.append("minattraction");
     writer.append('\n');
     String s;
     for(int i=1;i<100;i++)
     {
         s="boy";
        writer.append(s+String.valueOf(i));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append('\n');
     //   System.out.println("CSV file is created...");
        }
  } catch (IOException e) {
     e.printStackTrace();
  } finally {
        try {
      writer.flush();
      writer.close();
        } catch (IOException e) {
      e.printStackTrace();
}
}
     }
  private static void generateCsvFilee(String fileName) {
    FileWriter writer = null;
    Random random = new Random();

 try {
     writer = new FileWriter(fileName);
     writer.append("name");
     writer.append(',');
     writer.append("attractive");   
     writer.append(',');
     writer.append("intelligence");
     writer.append(',');
     writer.append("budget");
     writer.append('\n');
     String s;
     for(int i=1;i<20;i++)
     {
         s="girl";
        writer.append(s+String.valueOf(i));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append('\n');
     //   System.out.println("CSV file is created...");
        }
  } catch (IOException e) {
     e.printStackTrace();
  } finally {
        try {
      writer.flush();
      writer.close();
        } catch (IOException e) {
      e.printStackTrace();
}
}
     }


     static String name;
    static int attract,budget,intelligence;
    public static void main(String[] args) {
         String location = "non.csv";
         generateCsvFile(location);
         String locationn = "nongirll.csv";
         generateCsvFilee(locationn);
        Scanner in = new Scanner(System.in);
        int i=0;
        int countboy=0;
        int countgirl=0;
        
		boys b[] = new boys[200];
		String mycsv = "non.csv";
                girls g[] = new girls[200];
		String mycsvv = "nongirll.csv";
		String sp = "";
		String split = ",";
		BufferedReader reader = null;
		try{
			reader=new BufferedReader(new FileReader(mycsv));
			while((sp=reader.readLine())!=null)
                        {
                                if(i==0)
                                {
                                    i++;
                                    continue;
                                }
				String[] boy = sp.split(split);
				b[i] = new boys(boy[0],Integer.parseInt(boy[1]),Integer.parseInt(boy[2]),Integer.parseInt(boy[3]),Integer.parseInt(boy[4]));
	//			System.out.println(b[i].name);
				i++;
                                countboy++;
			}
		}
                catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
                i=0;
		try{
			reader=new BufferedReader(new FileReader(mycsvv));
			while((sp=reader.readLine())!=null)
                        {
                                if(i==0)
                                {
                                    i++;
                                    continue;
                                }
				String[] girl = sp.split(split);
                        //        System.out.println(boy[0]);
			//	System.out.println(boy[0] + boy[1] + boy[2] + boy [3]);
				g[i] = new girls(girl[0],Integer.parseInt(girl[1]),Integer.parseInt(girl[2]),Integer.parseInt(girl[3]));
	//			System.out.println(g[i].name);
				i++;
                                countgirl++;
			}
		}
                catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
                //System.out.println(countboy);
                //System.out.println(countgirl);
                //countboy=1;
                //countgirl=1;
            //    System.out.println(b[1].name);
            Logger logger = Logger.getLogger("MyLog");  
            FileHandler fh;  
               try {  

                    // This block configure the logger with handler and formatter  
                    fh = new FileHandler("nmn.txt");  
                    logger.addHandler(fh);
                    SimpleFormatter formatter = new SimpleFormatter();  
                    fh.setFormatter(formatter);  

                    // the following statement is used to log any messages  

                } catch (SecurityException e) {  
                    e.printStackTrace();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
                for(int x=1;x<=countboy;x++)
                {
                   // System.out.println(x);
                    for(int j=1;j<=countgirl;j++)
                    {
                 //       System.out.println(j);
                     //   System.out.println(b[x].min_attractionrequirement);
                        //  System.out.println(g[j].status);
                        if(b[x].status.equals("Single")&&g[j].status.equals("Single")&&b[x].budget>=g[j].maintainence_cost&&b[x].min_attractionrequirement<g[j].attractiveness)
                        {
                            b[x].status="committed";
                            g[j].status="committed";
                            b[x].girlfriend=g[j].name;
                            g[j].boyfriend=b[x].name;
                            logger.info(g[j].boyfriend + " got engaged with " + b[x].girlfriend);  
                     //       System.out.println(g[j].boyfriend + " " + " got engaged with " + " " +b[x].girlfriend);
                          //  System.out.println(b[x].girlfriend);
                            //System.out.println(g[j].boyfriend);
                        }
                    }
                }
    }
    
}
