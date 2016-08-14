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
	  
	  String Trip_Distance = data[1];
	  String Date_Time = data[0];
	  
	  String[] data1 = Date_Time.split("\\s+");
	  
	  String date = data1[0];
	  String[] data2 = date.split("/");
	  
	  int month = Integer.parseInt(data2[0]);
	  int day = Integer.parseInt(data2[1]);
	  
	  String interval = "00-00-00-00-00-00-00-00-00-00-00-00";
	  //Making 24 intervals of 15 days each (fortnightly).
	  
	  if(month == 1)
	  {
		  if(day <=15)
			  interval = "10-00-00-00-00-00-00-00-00-00-00-00";
		  else
			  interval = "01-00-00-00-00-00-00-00-00-00-00-00";
	  }  
	  else if(month == 2)
	  {
		  if(day <=15)
			  interval = "00-10-00-00-00-00-00-00-00-00-00-00";
		  else
			  interval = "00-01-00-00-00-00-00-00-00-00-00-00";
	  }
	  else if(month == 3)
	  {
		  if(day <=15)
			  interval = "00-00-10-00-00-00-00-00-00-00-00-00";
		  else
			  interval = "00-00-01-00-00-00-00-00-00-00-00-00";
	  }
	  else if(month == 4)
	  {
		  if(day <=15)
			  interval = "00-00-00-10-00-00-00-00-00-00-00-00";
		  else
			  interval = "00-00-00-01-00-00-00-00-00-00-00-00";
	  }
	  else if(month == 5)
	  {
		  if(day <=15)
			  interval = "00-00-00-00-10-00-00-00-00-00-00-00";
		  else
			  interval = "00-00-00-00-01-00-00-00-00-00-00-00";
	  }
	  else if(month == 6)
	  {
		  if(day <=15)
			  interval = "00-00-00-00-00-10-00-00-00-00-00-00";
		  else
			  interval = "00-00-00-00-00-01-00-00-00-00-00-00";
	  }
	  else if(month == 7)
	  {
		  if(day <=15)
			  interval = "00-00-00-00-00-00-10-00-00-00-00-00";
		  else
			  interval = "00-00-00-00-00-00-01-00-00-00-00-00";
	  }
	  else if(month == 8)
	  {
		  if(day <=15)
			  interval = "00-00-00-00-00-00-00-10-00-00-00-00";
		  else
			  interval = "00-00-00-00-00-00-00-01-00-00-00-00";
	  }
	  else if(month == 9)
	  {
		  if(day <=15)
			  interval = "00-00-00-00-00-00-00-00-10-00-00-00";
		  else
			  interval = "00-00-00-00-00-00-00-00-01-00-00-00";
	  }
	  else if(month == 10)
	  {
		  if(day <=15)
			  interval = "00-00-00-00-00-00-00-00-00-10-00-00";
		  else
			  interval = "00-00-00-00-00-00-00-00-00-01-00-00";
	  }
	  else if(month == 11)
	  {
		  if(day <=15)
			  interval = "00-00-00-00-00-00-00-00-00-00-10-00";
		  else
			  interval = "00-00-00-00-00-00-00-00-00-00-01-00";
	  }
	  else if(month == 12)
	  {
		  if(day <=15)
			  interval = "00-00-00-00-00-00-00-00-00-00-00-10";
		  else
			  interval = "00-00-00-00-00-00-00-00-00-00-00-01";
	  }
	  

      context.write(new Text(interval), new Text(Trip_Distance)); 
  }
}

