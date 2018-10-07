package com.study.glass;


import com.study.pojo.Windowdata;
import com.study.util.CTypeHigh;
import com.study.util.WindowUtil;

public class LiEr88Glass {

	public static Double getAreas(Windowdata windowdata) {
		Double areas = 0.0;
		if (windowdata != null) {

			Integer inputheight = windowdata.getInputheight();
			Integer inputwidth = windowdata.getInputwidth();
			Integer inputnumber = windowdata.getInputnumber();

			if ("A1".equals(windowdata.getType())) {
				
				areas = (double) ((inputheight-175)*((inputwidth-10)/2-87)*(inputnumber*2)); 
				
			} else if ("A2".equals(windowdata.getType())) {
				
				Integer dH = WindowUtil.getBTypeHeight(inputheight);
				Integer tH = inputheight-WindowUtil.getBTypeHeight(inputheight);
				areas = (double) ((tH-65)*(inputwidth-65)*(inputnumber)+(dH-175)*((inputwidth-10)/2-87)*(inputnumber*2));
			
			} else if ("A3".equals(windowdata.getType())) {
				
				Integer dH = WindowUtil.getBTypeHeight(inputheight);
				Integer tH = inputheight-WindowUtil.getBTypeHeight(inputheight);
				areas = (double) ((tH-65)*((inputwidth-82)/2-5)*(inputnumber*2)+(dH-175)*((inputwidth-10)/2-87)*(inputnumber*2));
			
			} else if ("A4".equals(windowdata.getType())) {
			
				CTypeHigh cType = WindowUtil.getCType(inputheight);
				Integer dH = cType.getDownHigh();
				Integer mH = cType.getMidHigh();
				Integer tH = cType.getTopHigh();
				areas = (double) ((tH-65)*(inputwidth-65)*(inputnumber)+(dH-65)*(inputwidth-65)*(inputnumber)+(mH-175)*((inputwidth-10)/2-87)*(inputnumber*2));
				
			} else if ("A5".equals(windowdata.getType())) {

				CTypeHigh cType = WindowUtil.getCType(inputheight);
				Integer dH = cType.getDownHigh();
				Integer mH = cType.getMidHigh();
				Integer tH = cType.getTopHigh();
				areas = (double) ((tH-65)*((inputwidth-82)/2-5)*(inputnumber*2)+(dH-65)*((inputwidth-82)/2-5)*(inputnumber*2)+(mH-175)*((inputwidth-10)/2-87)*(inputnumber*2));
				
			}

		}
		return areas;
	}
}
