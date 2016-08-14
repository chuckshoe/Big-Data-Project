import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  String temp = "";
	  Double average_tip = 0.0;
	  Double Sum = 0.0;
	  int count = 0;
	  for(Text value : values)
	    {
		  temp = value.toString();
		  if(temp != "")
		  {
			  Sum = Sum + Double.parseDouble(temp);
			  count++;
		  }
	    }
	  
	  if(count != 0)
		  average_tip = Sum / count;
	  String key_toSend = "";
      key_toSend = key.toString() + ",";
    context.write(new Text(key_toSend),  new Text(average_tip.toString()));
  }
}