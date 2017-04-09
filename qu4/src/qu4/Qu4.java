/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qu4;

/**
 *
 * @author silentwraith
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
/**
 *
 * @author silentwraith
 */

public class Qu4 {

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
     writer.append(',');
     writer.append("type");
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
     writer.append("maintainancecost");
     writer.append(',');
     writer.append("intelligence");
     writer.append(',');
     writer.append("type");
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

  private static void generateCsvFileee(String fileName) {
    FileWriter writer = null;
    Random random = new Random();

 try {
     writer = new FileWriter(fileName);
     writer.append("name");
     writer.append(',');
     writer.append("type");   
     writer.append(',');
     writer.append("value");
     writer.append(',');
     writer.append("price");
     writer.append('\n');
     String s;
     for(int i=1;i<100;i++)
     {
         s="gift";
        writer.append(s+String.valueOf(i));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
        writer.append(Integer.toString(random.nextInt(100)));
        writer.append(',');
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
         String locationnn = "gifts.csv";
         generateCsvFilee(locationnn);
        Scanner in = new Scanner(System.in);
        int i=0;
        int countboy=0;
        int countgirl=0;
                couple co[] = new couple[200];
		boys b[] = new boys[2000];
		String mycsv = "non.csv";
                girls g[] = new girls[2000];
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
				b[i] = new boys(boy[0],Integer.parseInt(boy[1]),Integer.parseInt(boy[2]),Integer.parseInt(boy[3]),Integer.parseInt(boy[4]),Integer.parseInt(boy[5]));
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
				g[i] = new girls(girl[0],Integer.parseInt(girl[1]),Integer.parseInt(girl[2]),Integer.parseInt(girl[3]),Integer.parseInt(girl[4]));
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
            i=0;
            gifts gi[] = new gifts[200];
		String mycsvvv = "nongirll.csv";
		String spp = "";
		String splitt = ",";
		BufferedReader readerr = null;
		try{
			readerr=new BufferedReader(new FileReader(mycsvvv));
			while((spp=readerr.readLine())!=null)
                        {
                                if(i==0)
                                {
                                    i++;
                                    continue;
                                }
				String[] boy = spp.split(split);
				gi[i] = new gifts(boy[0],Integer.parseInt(boy[1]),Integer.parseInt(boy[2]),Integer.parseInt(boy[3]));
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
               int cy=0;
               Random rand = new Random();
               //System.out.println(countboy);
               //System.out.println(countgirl);
               /* for(int x=1;x<=countboy;x++)
                {
                   // System.out.println(x);
                    for(int j=1;j<=countgirl;j++)
                    {
                        System.out.println(j);
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
                            co[cy]=new couple(b[x].name, g[j].name, b[x].budget, g[j].maintainence_cost,b[x].type,g[j].type,0,0,0,b[x].attractiveness,g[j].attractiveness,b[x].intelligence_level,x,j);
                            cy++;
                            //if(cy<15)
                              // System.out.println(b[rand.nextInt(100)].name + " gave gift" + i + " to " +  b[rand.nextInt(100)].girlfriend );
                        }
                    }
                }*/
                int x=0;
                happyco happ[] = new happyco[200];
                compatibleco comp[] = new compatibleco[200];
                for(int j=0;j<cy;j++)
                {
                    
                    if(co[cy].boytype==0)
                    {
                        for(int k=99;k>=0;k--)
                        {
                            if(x+gi[k].price>co[cy].girlmaintaincost)
                                break;
                            x=x+gi[k].price;
                        }
                        co[cy].boyhap=co[cy].boybudget-x;
                    }
                    if(co[cy].boytype==1)
                    {
                        for(int k=99;k>=0;k--)
                        {
                            if(x+gi[k].price>co[cy].boybudget)
                                break;
                            x=x+gi[k].price+gi[k].value;
                        }
                        co[cy].boyhap=x;
                    }
                    if(co[cy].boytype==2)
                    {
                        int f=0;
                        for(int k=99;k>=0;k--)
                        {
                            if(x+gi[k].price>co[cy].girlmaintaincost)
                            {
                                if(f==1)
                                    break;
                                else if(gi[k].type==1)
                                {
                                    x=x+gi[k].price;
                                    break;
                                }
                            }
                            else
                                x=x+gi[k].price;
                        }
                        co[cy].boyhap=co[cy].girlintell;
                    }
                    if(co[cy].girltype==0)
                    {
                       co[cy].girlhap=(int)Math.log10(x);
                    }
                    if(co[cy].girltype==1)
                    {
                       co[cy].girlhap=co[cy].boyhap;
                    }
                    if(co[cy].girltype==2)
                    {
                        co[cy].girlhap=(int)Math.exp(x);
                    }
                    comp[i]=new compatibleco(co[cy].boyname,co[cy].girlname,Math.abs(co[cy].boybudget-co[cy].girlmaintaincost),Math.abs(co[cy].boyatt-co[cy].girlatt),Math.abs(co[cy].boyintell-co[cy].girlintell),Math.abs(co[cy].boybudget-co[cy].girlmaintaincost)+Math.abs(co[cy].boyatt-co[cy].girlatt)+Math.abs(co[cy].boyintell-co[cy].girlintell));
                    happ[i] = new happyco(co[cy].boyhap,co[cy].girlhap,co[cy].boyname,co[cy].girlname,co[cy].boyhap+co[cy].girlhap);
                }
                Arrays.sort(happ, new Comparator<happyco>() {
                    @Override
                    public int compare(happyco o1, happyco o2) {
                        return (o1.happsum - o2.happsum);
                    }
                });
                Arrays.sort(happ);
                Arrays.sort(comp, new Comparator<compatibleco>() {
                    @Override
                    public int compare(compatibleco o1, compatibleco o2) {
                        return (o1.sum - o2.sum);
                    }
                });
                Arrays.sort(comp);
                for(int j=0;j<5;j++)
                {
                    b[co[j].boyindex].status="Single";
                    for(int k=0;k<100;k++)
                    {
                        if(b[k].status.equals("Single")&&k!=co[j].boyindex)
                        {
                            co[cy]=new couple(b[k].name, g[j].name, b[k].budget, g[j].maintainence_cost,b[k].type,g[j].type,0,0,0,b[k].attractiveness,g[j].attractiveness,b[k].intelligence_level,k,j);
                        }
                    }
                }
                //System.out.println("5 most happiest couples");
                /*for(int j=99;j>=95;j--)
                {
                    System.out.println(happ[j].boyname + " " + happ[j].girlname);
                }
                System.out.println("5 most compatible couples");
                for(int j=99;j>=95;j--)
                {
                    System.out.println(comp[j].boyname + " " + comp[j].girlname);
                }*/
                
    }
    
}

