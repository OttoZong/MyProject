package com.tedu.http;

import java.io.InputStream;

/**
 * �������C�@�ӹ�ҥΩ��O�Ȥ�ݵo�e�L�Ӫ��@��HTTP�ШD���e.
 * 
 * �o�̥]�t:�ШD��H��,�����Y,��������
 * @author Otto
 *
 */
public class HttpRequest {
	/*
	 * �ШD�椤�����e
	 */
	//�ШD����k
	private String method;
	//�ШD���귽���|
	private String uri;
	//�ШD�ϥΪ�HTTP��ĳ����
	private String protocl;
	
	
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
	}
	/**
	 * �ѪR�ШD��
	 */
	private void parseRquestLine(InputStream in) {
		/*
		 * �ѪR�ШD�檺�j�P�B�J:
		 * 1.�q�L��J�yŪ���@��r�Ŧ�.
		 * 		�HCRLF����.
		 * 		CR:�^��,ASC�s�X������13.
		 * 		LF:����,ASC�s�X������10.
		 * 2.�NŪ�����ШD�椺�e���ӪŮ���.
		 * 3.�N��Ӫ��T�ӳ���,���O�������]�m���ݩ�method,uri,protocol�W.
		 * 
		 */
	}
	
	
	public String getMethod() {
		return method;
	}
	public String getUri() {
		return uri;
	}
	public String getProtocl() {
		return protocl;
	}
	
}
