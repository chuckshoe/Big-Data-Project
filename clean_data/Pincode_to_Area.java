import java.util.*;

public class Pincode_to_Area 
{
	private HashMap<String, String> map = new HashMap<String, String>();
	
	void initialize()
	{
		String[] array = {"Central Bronx","10453", "10457","10460"};
		
		for(int i = 1;i < array.length;i++)
		{
			map.put(array[i], array[0]);
		}
		
        String[] array1 = {"Bronx Park and Fordham","10458", "10467", "10468"};
		
		for(int i = 1;i < array1.length;i++)
		{
			map.put(array1[i], array1[0]);
		}
		
        String[] array2 = {"High Bridge and Morrisania","10451", "10452", "10456"};
		
		for(int i = 1;i < array2.length;i++)
		{
			map.put(array2[i], array2[0]);
		}
		
	    String[] array3 = {"Hunts Point and Mott Haven","10454", "10455", "10459", "10474"};
			
		for(int i = 1;i < array3.length;i++)
		{
			map.put(array3[i], array3[0]);
		}
		
		String[] array4 = {"Kingsbridge and Riverdale","10463", "10471"};
			
		for(int i = 1;i < array4.length;i++)
		{
			map.put(array4[i], array4[0]);
		}
		
		String[] array5 = {"Northeast Bronx","10466", "10469", "10470", "10475"};
		
		for(int i = 1;i < array5.length;i++)
		{
			map.put(array5[i], array5[0]);
		}
		
		String[] array6 = {"Southeast Bronx","10461", "10462","10464", "10465", "10472", "10473"};
		
		for(int i = 1;i < array6.length;i++)
		{
			map.put(array6[i], array6[0]);
		}
		
		String[] array7 = {"Central Brooklyn","11212", "11213", "11216", "11233", "11238"};
		
		for(int i = 1;i < array7.length;i++)
		{
			map.put(array7[i], array7[0]);
		}
		
		String[] array8 = {"Southwest Brooklyn","11209", "11214", "11228"};
		
		for(int i = 1;i < array8.length;i++)
		{
			map.put(array8[i], array8[0]);
		}
		
		String[] array9 = {"Borough Park","11204", "11218", "11219", "11230"};
		
		for(int i = 1;i < array9.length;i++)
		{
			map.put(array9[i], array9[0]);
		}
		
		String[] array10 = {"Canarsie and Flatlands","11234", "11236", "11239"};
		
		for(int i = 1;i < array10.length;i++)
		{
			map.put(array10[i], array10[0]);
		}		
				
		String[] array11 = {"Southern Brooklyn","11223", "11224", "11229", "11235"};
		
		for(int i = 1;i < array11.length;i++)
		{
			map.put(array11[i], array11[0]);
		}
		
		String[] array12 = {"Northwest Brooklyn","11201", "11205", "11215", "11217", "11231"};
		
		for(int i = 1;i < array12.length;i++)
		{
			map.put(array12[i], array12[0]);
		}	
		
		String[] array13 = {"Flatbush","11203", "11210", "11225", "11226"};
		
		for(int i = 1;i < array13.length;i++)
		{
			map.put(array13[i], array13[0]);
		}	
		
		String[] array14 = {"East New York and New Lots","11207", "11208"};
		
		for(int i = 1;i < array14.length;i++)
		{
			map.put(array14[i], array14[0]);
		}	
		
		String[] array15 = {"Greenpoint","11211", "11222"};
		
		for(int i = 1;i < array15.length;i++)
		{
			map.put(array15[i], array15[0]);
		}		
		
		String[] array16 = {"Sunset Park","11220", "11232"};
		
		for(int i = 1;i < array16.length;i++)
		{
			map.put(array16[i], array16[0]);
		}	
		
		String[] array17 = {"Bushwick and Williamsburg","11206", "11221", "11237"};
		
		for(int i = 1;i < array17.length;i++)
		{
			map.put(array17[i], array17[0]);
		}
		
		String[] array18 = {"Central Harlem","10026", "10027", "10030", "10037", "10039"};
		
		for(int i = 1;i < array18.length;i++)
		{
			map.put(array18[i], array18[0]);
		}
		
		String[] array19 = {"Chelsea and Clinton","10001", "10011", "10018", "10019", "10020", "10036"};
		
		for(int i = 1;i < array19.length;i++)
		{
			map.put(array19[i], array19[0]);
		}
		
		String[] array20 = {"East Harlem","10029", "10035"};
		
		for(int i = 1;i < array20.length;i++)
		{
			map.put(array20[i], array20[0]);
		}
		
		
		
        String[] array22 = {"Gramercy Park and Murray Hill","10010", "10016", "10017", "10022"};
        
        for(int i = 1;i < array22.length;i++)
        {
            map.put(array22[i], array22[0]);
        }


    String[] array23 = {"Greenwich Village and Soho","10012", "10013", "10014" };
        
        for(int i = 1;i < array23.length;i++)
        {
            map.put(array23[i], array23[0]);
        }


    String[] array24 = {"Lower Manhattan","10004", "10005", "10006", "10007", "10038", "10280" };
        
        for(int i = 1;i < array24.length;i++)
        {
            map.put(array24[i], array24[0]);
        }


    String[] array25 = {"Lower East Side","10002", "10003", "10009" };
        
        for(int i = 1;i < array25.length;i++)
        {
            map.put(array25[i], array25[0]);
        }


    String[] array26 = {"Upper East Side","10021", "10028", "10044", "10065", "10075", "10128" };
        
        for(int i = 1;i < array26.length;i++)
        {
            map.put(array26[i], array26[0]);
        }


    String[] array27 = {"Upper West Side","10023", "10024", "10025" };
        
        for(int i = 1;i < array27.length;i++)
        {
            map.put(array27[i], array27[0]);
        }


    String[] array28 = {"Inwood and Washington Heights","10031", "10032", "10033", "10034", "10040" };
        
        for(int i = 1;i < array28.length;i++)
        {
            map.put(array28[i], array28[0]);
        }


    String[] array29 = {"Northeast Queens","11361", "11362", "11363", "11364" };
        
        for(int i = 1;i < array29.length;i++)
        {
            map.put(array29[i], array29[0]);
        }


    String[] array30 = {"North Queens","11354", "11355", "11356", "11357", "11358", "11359", "11360" };
        
        for(int i = 1;i < array30.length;i++)
        {
            map.put(array30[i], array30[0]);
        }


    String[] array31 = {"Central Queens","11365", "11366", "11367" };
        
        for(int i = 1;i < array31.length;i++)
        {
            map.put(array31[i], array31[0]);
        }


    String[] array32 = {"Jamaica","11412", "11423", "11432", "11433", "11434", "11435", "11436" };
        
        for(int i = 1;i < array32.length;i++)
        {
            map.put(array32[i], array32[0]);
        }


    String[] array33 = {"Northwest Queens","11101", "11102", "11103", "11104", "11105", "11106" };
        
        for(int i = 1;i < array33.length;i++)
        {
            map.put(array33[i], array33[0]);
        }


    String[] array34 = {"West Central Queens","11374", "11375", "11379", "11385" };
        
        for(int i = 1;i < array34.length;i++)
        {
            map.put(array34[i], array34[0]);
        }


    String[] array35 = {"Rockaways","11691", "11692", "11693", "11694", "11695", "11697" };
        
        for(int i = 1;i < array35.length;i++)
        {
            map.put(array35[i], array35[0]);
        }


    String[] array36 = {"Southeast Queens","11004", "11005", "11411", "11413", "11422", "11426", "11427", "11428", "11429" };
        
        for(int i = 1;i < array36.length;i++)
        {
            map.put(array36[i], array36[0]);
        }


    String[] array37 = {"Southwest Queens","11414", "11415", "11416", "11417", "11418", "11419", "11420", "11421" };
        
        for(int i = 1;i < array37.length;i++)
        {
            map.put(array37[i], array37[0]);
        }


    String[] array38 = {"West Queens","11368", "11369", "11370", "11372", "11373", "11377", "11378" };
        
        for(int i = 1;i < array38.length;i++)
        {
            map.put(array38[i], array38[0]);
        }


    String[] array39 = {"Port Richmond","10302", "10303", "10310" };
        
        for(int i = 1;i < array39.length;i++)
        {
            map.put(array39[i], array39[0]);
        }


    String[] array40 = {"South Shore","10306", "10307", "10308", "10309", "10312" };
        
        for(int i = 1;i < array40.length;i++)
        {
            map.put(array40[i], array40[0]);
        }


    String[] array41 = {"Stapleton and St. George","10301", "10304", "10305" };
        
        for(int i = 1;i < array41.length;i++)
        {
            map.put(array41[i], array41[0]);
        }


    String[] array42 = {"Mid-Island","10314"};
        
        for(int i = 1;i < array42.length;i++)
        {
            map.put(array42[i], array42[0]);
        }
		
	}
	
	String getArea(String pincode)
	{
		return map.get(pincode);
	}
}
