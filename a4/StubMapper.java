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
	  
	  Double trip_distance = Double.parseDouble(data[0]);
	  
	  int payment_type = Integer.parseInt(data[1]);
          // trip interval, 0-2:0, 2-4:1, 4-6:2, 6-8:3, 8-:4
          String trip_interval= ""; 
	  
          if (trip_distance >= 0 && trip_distance < 2)
		trip_interval="0";
          else if (trip_distance >= 2 && trip_distance < 4)
		trip_interval="1";
          else if (trip_distance >= 4 && trip_distance < 6)
		trip_interval="2";
          else if (trip_distance >= 6 && trip_distance < 8)
		trip_interval="3";
          else if (trip_distance >= 8 )
		trip_interval="4";
	  
          if ( (payment_type == 1) || (payment_type == 2) || (payment_type == 3) || (payment_type == 4))
          context.write(new Text(trip_interval), new Text(Integer.toString(payment_type)));
  }
}

