import java.io.IOException;

import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class StubReducer extends Reducer<Text, Text, Text, Text> {

  @Override
  public void reduce(Text key, Iterable<Text> values, Context context)
      throws IOException, InterruptedException 
  {
	  int temp;
	  long count = 0;
          long[] counter = new long[4];// one for each payment type:credit card, cash, no charge, dispute 
	  for(Text value : values)
	    {
		  temp = Integer.parseInt(value.toString());
                  ++counter[temp-1]; 
		  
		  count++;
	    }
	  
	  Double percent_credit_card = ((double)counter[0]/(double)count)*100;
	  Double percent_cash = ((double)counter[1]/(double)count)*100;
	  Double percent_no_charge = ((double)counter[2]/(double)count)*100;
	  Double percent_dispute = ((double)counter[2]/(double)count)*100;
          String f = Double.toString(percent_credit_card) + "," + Double.toString(percent_cash) + "," + Double.toString(percent_no_charge) + "," + Double.toString(percent_dispute);	  

          String key_toSend = "";
          key_toSend = key.toString() + ",";
          
          context.write(new Text(key_toSend),  new Text(f));
  }
}
