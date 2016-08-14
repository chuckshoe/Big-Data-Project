import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.io.LongWritable;

public class StubMapper 
	extends Mapper<LongWritable, Text, Text, Text> {

  @Override
  public void map(LongWritable key, Text value, Context context)
      throws IOException, InterruptedException
  {
	  String line = value.toString();
	  String[] data = line.split(",");
	  
	  String Pickup_Location = data[0];
	  String total_amount = data[1];
	  
      context.write(new Text(Pickup_Location), new Text(total_amount));
  }
}

