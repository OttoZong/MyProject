package web;
/**
 * 製作圖片驗證碼
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class CheckcodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, 
					IOException {
		
		System.out.println("CheckcodeServlet's servlet()");
		
		/*
		 * 繪圖.
		 */
		//step1.創建內存映像對象(畫布).
		BufferedImage image = 
				new BufferedImage(80,30,
						BufferedImage.TYPE_INT_RGB);
		//step2.獲得畫筆.
		Graphics g = image.getGraphics();
		//step3.給筆設置顏色.
		g.setColor(new Color(255,255,255));
		//step4.給畫布設置背景顏色.
		g.fillRect(0, 0, 80, 30);
		//step5.重新給筆設置顏色(跟畫布顏色要不一樣).
		Random r = new Random();
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		//設置字體(類型,風格,大小)
		g.setFont(new Font(null,Font.BOLD,24));
		
		//step6.生成驗證碼.
//		String number = r.nextInt(99999) + "";
		String number = getNumber(5);
		
		//將number綁訂到session對象上,
		//以便進行後面的驗證(與用戶提交的驗證碼進行比較)
		HttpSession session = 
				request.getSession();
		session.setAttribute("number", number);
		
		//step7.將驗證碼畫到圖片上.
		g.drawString(number, 5, 25);
		
		//step8.加一些干擾線.
		for(int i = 0;i < 20; i++){
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.drawLine(r.nextInt(80),r.nextInt(30),r.nextInt(80),r.nextInt(30));
		}
		
		
		/*
		 * 壓縮圖片並輸出.
		 * .jpg
		 */
		//告訴瀏覽器,服務器返回的數據類型(圖片).
		response.setContentType("image/jpeg");
		//因為輸出的是字節數據,所以要用字節輸出流.
		OutputStream os = response.getOutputStream();
		//write方法會將原始圖片按照指定的格式壓縮,然後輸出.
		javax.imageio.ImageIO.write(image, "jpeg", os);
		os.close();
		
	}
	
	/**
	 * 長度為size個字節,並隨機從"A-Z,0-9"中選取字節構成的驗證碼
	 */
	private String getNumber(int size){
		String number = "";
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
				+ "0123456789";
		Random r = new Random();
		for(int i = 0;i<size;i++){
			number += chars.charAt(
					r.nextInt(chars.length()));
		}
		
		return number;
	}

}