import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  String temp = "";
	  Integer[] result = new Integer[8];
	  
	  for(int i = 0; i < 8; i++)
	  {
		  result[i] = 0;
	  }
	  
	  for(Text value : values)
	    {
		  temp = value.toString();
		  for(int i = 0; i < 8; i++)
		  {
			  if(temp.charAt(i) == '1')
			  {
				  result[i]++;
			  }
		  } 
	    }
          int total = 0;
          for (int i = 0; i < 8; i++ ) {
              total += result[i];
          }
          Double[] percent = new Double[8];
           
          for (int i = 0; i < 8; i++ ) {
              
	      percent[i] = ((double)result[i]/(double)total)*100;
          }
	  
          String fres = Double.toString(percent[0]) + "," + Double.toString(percent[1]) + "," +Double.toString(percent[2]) + "," + Double.toString(percent[3]) + "," + Double.toString(percent[4]) + "," + Double.toString(percent[5]) + "," + Double.toString(percent[6]) + "," + Double.toString(percent[7]);
	  String key_toSend = "";
      key_toSend = key.toString() + ",";
    context.write(new Text(key_toSend),  new Text(fres));
  }
}
