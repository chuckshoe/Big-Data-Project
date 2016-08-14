import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.io.FileReader;

public class StubMapper 
	extends Mapper<LongWritable, Text, Text, Text> {
	
	public int SNo = 1;
	private static HashMap<Double, Integer> map1 = new HashMap<Double, Integer>();
	private static HashMap<Integer, Double> map2 = new HashMap<Integer, Double>();
	private static HashMap<Double, Integer> map3 = new HashMap<Double, Integer>();
	private static HashMap<Integer, Double> map4 = new HashMap<Integer, Double>();
	
	private static HashMap<Integer, Double> map5 = new HashMap<Integer, Double>();
	

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException
  {    
		String path1 = "/home/cloudera/Desktop/train.csv";
		
		BufferedReader reader1 = new BufferedReader(new FileReader(path1));
		
		
		String line = "";
		
		while((line = reader1.readLine()) != null)
		{
			String[] data = line.split(",");
			
			
			map1.put(Double.parseDouble(data[1]), Integer.parseInt((data[0])));
			map3.put(Double.parseDouble(data[2]), Integer.parseInt((data[0])));	
		}
		
		  line = value.toString();
		  String[] data = line.split(",");
		  
		  String longitude = data[1];
		  String latitude = data[2];
		  String pincode = "";
		  
		  Iterator it = map1.entrySet().iterator();
		    while (it.hasNext()) 
		    {
		        Map.Entry pair = (Map.Entry)it.next();
		        double difference = Math.abs(Double.parseDouble(pair.getKey().toString()) - Double.parseDouble(latitude));
		        
		        map2.put(Integer.parseInt(pair.getValue().toString()), difference);
		    }
		    
		    
		    Iterator it1 = map3.entrySet().iterator();
		    while (it1.hasNext()) 
		    {
		        Map.Entry pair = (Map.Entry)it1.next();
		        double difference = Math.abs(Double.parseDouble(pair.getKey().toString()) - Double.parseDouble(longitude));
		        
		        map4.put(Integer.parseInt(pair.getValue().toString()), difference);
		    }
		    
		    
		    Iterator it2 = map2.entrySet().iterator();
		    while (it2.hasNext()) 
		    {
		        Map.Entry pair = (Map.Entry)it2.next();
		        double val1 = Double.parseDouble(pair.getValue().toString());
		        
		        double val2  = map4.get(pair.getKey());
		        map5.put(Integer.parseInt(pair.getKey().toString()), Math.sqrt((Math.pow(val1, 2) + Math.pow(val2, 2))));
		    }
		    
		    Double min = Collections.min(map5.values());
		    
		    Iterator it3 = map5.entrySet().iterator();
		    while (it3.hasNext()) 
		    {
		        Map.Entry pair = (Map.Entry)it3.next();
		        if(pair.getValue() == min)
		        {
		        	pincode = pair.getKey().toString();
		        	break;
		        }
		    }
		    
	      Pincode_to_Area obj = new Pincode_to_Area();
	      obj.initialize();
	      String area = "";
	      //System.out.println("PINCODE = " + pincode);
	      
	      if(pincode != "")
	    	  area = obj.getArea(pincode);
	      
	      if(area != "" || area != null)
	      {
	    	  String clean_data = data[0] + "," + area + "," + data[3] + "," + data[4] + "," + data[5] + "," + data[6];
	    	  context.write(new Text(Integer.toString(SNo)), new Text(clean_data));
	    	  
	    	  SNo++;
	      }	
 }
}
