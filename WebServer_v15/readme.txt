���cHttpRequest��,�K�[��Post�ШD�Φ�����form���ƾڪ��ѪR�\��.

���form��洣��,����ؤ�k,get,post.

�Ҧp:
<form action="xxx" method="get">...</form>
<form action="xxx" method="post">...</form>

get�ШD�|�Nform��椤�Ҧ���J�ؤ��e��{�b�a�}�椤.
post�ШD�|�Nform��椤�����e��b�ШD�����������峡��.
�æb�����Y���K�[�������Y�H��,�i���A�Ⱥݳo�O�t��form��檺post�ШD.
�q�`�V���U,�n���o�˪��\��|�]�t�Τ����p�H�����ШD,
form���O�ϥ�post�ШD������ƾڪ�.



��s�W�@�ӥ\���,�ڭ̻ݭn���H�U�ާ@:
1.�w��\��K�[�@�ӭ���,
     ��p:
  webapps/web/web/register.html.
     �K�[form���,���waction������ШD���|.
2.�K�[�@�ӷs��Servlet���ӳB�z�o�ӽШD,
     ��p:
  com.tedu.servlets.WebRegServlet.
3.�b�M�g��󤤲K�[�ШD�����Servlet�����Y,
     �ק�ServletMapping.xml���,�K�[�@�ӷs���l����.
     �Ҧp:
  	<mapping uri="/web/web/reg" classname="com.tedu.servlets.WebRegServlet"/>
4.��{��Servlet��service��k,�������U�\��.  	
  	
  	