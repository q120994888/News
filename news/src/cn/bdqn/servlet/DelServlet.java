package cn.bdqn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.service.NewsDetailService;
import cn.bdqn.service.impl.NewsDetailServiceImpl;

/**
   01.��ȡ��һ��ҳ�������
   02.����service����
   03.�õ���� ���ؽ���
 */
public class DelServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ�����е�id
		String id = request.getParameter("id");

		NewsDetailService service = new NewsDetailServiceImpl();

		int num = Integer.parseInt(id);
		num = service.DelByNewsDetailId(num);
		if (num > 0) {
			// �ض���main.jsp????listServlet���Ի�ȡ������Ϣ
			response.sendRedirect("listServlet");
		} else {
			System.out.print("ɾ��ʧ��");
		}

	}

}