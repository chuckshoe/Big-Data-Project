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
	  String Date_Time = data[1];
	  
	  String[] data1 = Date_Time.split("\\s+");
	  
	  String time = data1[1].split(":")[0];
	  
	  int hour = Integer.parseInt(time);
	  
	  String interval = "00000000";
	  //Making 8 time intervals of 3 hours each.
	  
	  if(hour <= 2)
	  {
		  //Its in the time interval 00:00 - 02:59
		  interval = "10000000";
	  }
	  else if(hour <= 5)
	  {
		  //Its in the time interval 03:00 - 05:59
		  interval = "01000000";
	  }
	  
	  else if(hour <= 8)
	  {
		  //Its in the time interval 06:00 - 08:59
		  interval = "00100000";
	  }
	  
	  else if(hour <= 11)
	  {
		  //Its in the time interval 09:00 - 11:59
		  interval = "00010000";
	  }
	  else if(hour <= 14)
	  {
		  //Its in the time interval 12:00 - 14:59
		  interval = "00001000";
	  }
	  else if(hour <= 17)
	  {
		  //Its in the time interval 15:00 - 17:59
		  interval = "00000100";
	  }
	  else if(hour <= 20)
	  {
		  //Its in the time interval 18:00 - 20:59
		  interval = "00000010";
	  }
	  else if(hour <= 23)
	  {
		  //Its in the time interval 21:00 - 23:59
		  interval = "00000001";
	  }

      context.write(new Text(Pickup_Location), new Text(interval)); 
  }
}

