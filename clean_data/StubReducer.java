import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  public int SNo = 0;
  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  //String temp = "";
	  for(Text value : values)
	    {
		  //temp = value.toString();
                  String send = "," + value.toString();
                  SNo ++;  
                  //context.write(new Text(Integer.toString(SNo)), value);
                  context.write(new Text(Integer.toString(SNo)), new Text(send));
	    }
	  //String key_toSend = "";
      //key_toSend = key.toString() + ",";
    //context.write(new Text(key_toSend),  new Text(temp));
  }
}
