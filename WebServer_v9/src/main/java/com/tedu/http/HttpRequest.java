package com.tedu.http;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.tedu.core.HttpContext;

/**
 * �������C�@�ӹ�ҥΩ��O�Ȥ�ݵo�e�L�Ӫ��@��HTTP�ШD���e.
 * 
 * �o�̥]�t:�ШD��H��,�����Y,��������
 * 
 * @author Otto
 *
 */
public class HttpRequest {
	/*
	 * �ШD�椤�����e
	 */
	// �ШD����k
	private String method;
	// �ШD���귽���|
	private String uri;
	// �ШD�ϥΪ�HTTP��ĳ����
	private String protocol;
	/*
	 * �����Y
	 */
	private Map<String,String> headers = new HashMap<String,String>();

	/**
	 * �c�y��k,�q�L���w����J�yŪ���Ȥ�ݵo�e�L�Ӫ�HTTP�ШD���e.
	 */
	public HttpRequest(InputStream in) {
		/*
		 * �ѪR�����T�B. 
		 * 1.�ѪR�ШD��. 
		 * 2.�ѪR�����Y. 
		 * 3.�ѪR��������.
		 */
		parseRquestLine(in);
		parseHeaders(in);
	}
	/**
	 * �ѪR�����Y
	 */
	private void parseHeaders(InputStream in){
		/*
		 * �ѩ󤧫e����k�w�g�q�y���N�ШD��Ū���F,
		 * �ҥH�q�o�Ӭy���~��Ū�����N���O�����Y���e�F.
		 * 
		 * Ū���Y�z�椺�e(CRLF������@��)
		 * �C�@�����":"��ⳡ��,
		 * �Ĥ@��������O�����Y���W�l,
		 * �ĤG��������������,�N�W�l�@��key,
		 * �ȧ@��value�s�J��header,�o��Map���O�d.
		 */
		// v9
		while(true){
			String line = readLine(in);
			//��WŪ����CRLF.
			if("".equals(line)){
				break;
			}
			//���C���Y�H����":"����m.
			int index = line.indexOf(":");
			String name = line.substring(0, index).trim();
			String value = line.substring(index+1).trim();
			this.headers.put(name, value);
		}
	}

	/**
	 * �ѪR�ШD��
	 */
	private void parseRquestLine(InputStream in) {
		/*
		 * �ѪR�ШD�檺�j�P�B�J: 
		 * 1.�q�L��J�yŪ���@��r�Ŧ�. �HCRLF����. 
		 * CR:�^��,ASC�s�X������13. 
		 * LF:����,ASC�s�X������10.
		 * 2.�NŪ�����ШD�椺�e���ӪŮ���. 
		 * 3.�N��Ӫ��T�ӳ���,���O�������]�m���ݩ�method,uri,protocol�W.
		 * 
		 * localhost:8080/index.html.
		 */
		try {
			String line = readLine(in);
			String[] data = line.split("\\s");
			System.out.println(data.length);
			System.out.println(Arrays.toString(data));
			
			this.method = data[0];
			this.uri = data[1];
//			parseUri();
			this.protocol = data[2];
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private String readLine(InputStream in){
		StringBuilder builder = new StringBuilder();
		try {
			int d = -1;
			char c1=0,c2=0;//c1��ܤW��Ū�쪺�r�`,c2��ܥ�Ū�쪺�r�`
			while((d = in.read())!=-1){
				c2 = (char)d;
				if(c1==HttpContext.CR&&
				   c2==HttpContext.LF){
					break;
				}
				builder.append(c2);
				c1 = c2;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return builder.toString().trim();
	}

	public String getMethod() {
		return method;
	}

	public String getUri() {
		return uri;
	}

	public String getProtocl() {
		return protocol;
	}

}
