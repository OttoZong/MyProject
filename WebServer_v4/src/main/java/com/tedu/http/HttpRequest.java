package com.tedu.http;

import java.io.InputStream;
import java.util.Arrays;

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

	/**
	 * �c�y��k,�q�L���w����J�yŪ���Ȥ�ݵo�e�L�Ӫ�HTTP�ШD���e.
	 */
	public HttpRequest(InputStream in) {
		/*
		 * �ѪR�����T�B. 1.�ѪR�ШD��. 2.�ѪR�����Y. 3.�ѪR��������.
		 */
		parseRquestLine(in);
	}

	/**
	 * �ѪR�ШD��
	 */
	private void parseRquestLine(InputStream in) {
		/*
		 * �ѪR�ШD�檺�j�P�B�J: 1.�q�L��J�yŪ���@��r�Ŧ�. �HCRLF����. CR:�^��,ASC�s�X������13. LF:����,ASC�s�X������10.
		 * 2.�NŪ�����ШD�椺�e���ӪŮ���. 3.�N��Ӫ��T�ӳ���,���O�������]�m���ݩ�method,uri,protocol�W.
		 * 
		 * localhost:8080/index.html.
		 */
		try {
			StringBuilder builder = new StringBuilder();
			int d = -1;
			char c1 = 0, c2 = 0; // c1��ܤW��Ū�쪺�r�`
			while ((d = in.read()) != -1) {
				c2 = (char) d;
				if (c1 == 13 && c2 == 10) {
					break;
				}
				builder.append(c2);
				c1 = c2;
			}
			String line = builder.toString().trim();
			
			String[] data = line.split("\\s");
			System.out.println("data:"+data[0]);
			System.out.println(data.length);
			System.out.println(Arrays.toString(data));
			
			this.method = data[0];
			this.uri = data[1];
			this.protocol = data[2];
			
		} catch (Exception e) {
			e.printStackTrace();
		}
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
