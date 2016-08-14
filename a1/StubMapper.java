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
	  String tip_amount = data[1];
	  String total_amount = data[2];
	  
	  if(Double.parseDouble(total_amount) != 0)
	  {
		  double tip_percent = (Double.parseDouble(tip_amount) / Double.parseDouble(total_amount))*100;
		  String tip_p = Double.toString(tip_percent); 
	      context.write(new Text(Pickup_Location), new Text(tip_p)); 
	  }
  }
}

