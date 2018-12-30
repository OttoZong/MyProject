package service;
/**
 * 模型:
 * 		負責封裝業務邏輯的處理.
 * @author Otto
 *
 *
 */
public class BmiService {
/**
 * 依據身高體重計算bmi指數，返回身體狀況.
 */
	public String bmi(double height,
			double weight){
		//計算bmi指數.
		double bmi = 
				weight / height / height;
		//依據bmi指數，判斷用戶身體狀態.
		String status = "正常";
		if(bmi <19 ){
			status = "過輕";
		}
		if(bmi> 25){
			status = "過重";
		}
		return status;
	}
}
