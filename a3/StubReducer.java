import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  String temp = "";
	  Double average_sum = 0.0;
	  Double sum = 0.0;
	  long count = 0;
	  for(Text value : values)
	    {
		  temp = value.toString();
		  sum = sum + Double.parseDouble(temp);
		  count++;
	    }
	  average_sum = sum / count;
	  String key_toSend = "";
      key_toSend = key.toString() + ",";
    context.write(new Text(key_toSend),  new Text(average_sum.toString()));
  }
}
