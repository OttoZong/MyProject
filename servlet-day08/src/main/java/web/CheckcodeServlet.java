package web;
/**
 * �s�@�Ϥ����ҽX
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

public class CheckcodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(
			HttpServletRequest request, 
			HttpServletResponse response) 
					throws ServletException, 
					IOException {
		
		System.out.println("CheckcodeServlet's servlet()");
		
		/*
		 * ø��.
		 */
		//step1.�Ыؤ��s�M����H(�e��).
		BufferedImage image = 
				new BufferedImage(80,30,
						BufferedImage.TYPE_INT_RGB);
		//step2.��o�e��.
		Graphics g = image.getGraphics();
		//step3.�����]�m�C��.
		g.setColor(new Color(255,255,255));
		//step4.���e���]�m�I���C��.
		g.fillRect(0, 0, 80, 30);
		//step5.���s�����]�m�C��(��e���C��n���@��).
		Random r = new Random();
		g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
		//�]�m�r��(����,����,�j�p)
		g.setFont(new Font(null,Font.BOLD,24));
		
		//step6.�ͦ����ҽX.
		String number = r.nextInt(99999) + "";
		//step7.�N���ҽX�e��Ϥ��W.
		g.drawString(number, 5, 25);
		
		//step8.�[�@�Ǥz�Z�u.
		for(int i = 0;i < 20; i++){
			g.setColor(new Color(r.nextInt(255),r.nextInt(255),r.nextInt(255)));
			g.drawLine(r.nextInt(80),r.nextInt(30),r.nextInt(80),r.nextInt(30));
		}
		
		
		/*
		 * ���Y�Ϥ��ÿ�X.
		 * .jpg
		 */
		//�i�D�s����,�A�Ⱦ���^���ƾ�����(�Ϥ�).
		response.setContentType("image/jpeg");
		//�]����X���O�r�`�ƾ�,�ҥH�n�Φr�`��X�y.
		OutputStream os = response.getOutputStream();
		//write��k�|�N��l�Ϥ����ӫ��w���榡���Y,�M���X.
		javax.imageio.ImageIO.write(image, "jpeg", os);
		os.close();
		
	}

}
