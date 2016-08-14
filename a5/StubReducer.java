import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  double sum = 0;
	  for(Text value : values)
	    {
		  sum = sum + Double.parseDouble(value.toString());
	    }
	  String key_toSend = "";
      key_toSend = key.toString() + ",";
    context.write(new Text(key_toSend),  new Text(Double.toString(sum)));
  }
}
