/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-11-08 02:48:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myreview_005fview_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"utf-8\">\r\n");
      out.write("	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\r\n");
      out.write("	<title>리뷰</title>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<meta name=\"description\" content=\"\">\r\n");
      out.write("	<meta name=\"author\" content=\"\">\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("<div id=\"page-member-my-review\" class=\"section-member pc-width\">\r\n");
      out.write("	<div id=\"navigation-bar\"><script>document.write(navistr)</script></div>\r\n");
      out.write("	<h2 class=\"page-title\"><script>document.write(siteTitle)</script></h2>\r\n");
      out.write("		<!-- mypage 상단 시작 -->\r\n");
      out.write("		\r\n");
      out.write("	<div class=\"member-nav-wrapper\">\r\n");
      out.write("	<ul class=\"member-nav\"> <!-- 나의 쇼핑현황일 때 open-sub-menu class를 추가 -->\r\n");
      out.write("		<li>\r\n");
      out.write("			<a href=\"buy_list.jsp\">나의 쇼핑현황</a>\r\n");
      out.write("			<div class=\"member-sub-nav\">\r\n");
      out.write("				<a href=\"orderlist.jsp\">주문내역</a>\r\n");
      out.write("				<a href=\"shoppingbasket.jsp\">장바구니</a>\r\n");
      out.write("				<a href=\"wish.jsp\">위시리스트</a>\r\n");
      out.write("				<a href=\"mycoupon.jsp\">쿠폰</a>\r\n");
      out.write("				<a href=\"mypoint.jsp\">예치금</a>\r\n");
      out.write("			</div>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li><a href=\"member_Whitdrawal.jsp\">개인정보수정</a></li>\r\n");
      out.write("		<li><a href=\"baesong_addr.jsp\">주소록관리</a></li>\r\n");
      out.write("		<li class=\"hide-mobile active\"><a href=\"qna.jsp\">1:1문의</a></li>\r\n");
      out.write("		<li><a href=\"myreview_view.jsp\">나의후기</a></li>\r\n");
      out.write("		<li><a href=\"member_Withdrawal.jsp\">회원탈퇴</a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"contents-wrapper\">\r\n");
      out.write("		<h2 class=\"page-sub-title kr\">나의 후기</h2>\r\n");
      out.write("		<div class=\"page-content-desc\">\r\n");
      out.write("			<span class=\"only-pc\">회원님께서 등록하신 리뷰기 목록입니다. 작성하신 리뷰를 확인하세요.</span>\r\n");
      out.write("			<span class=\"only-mobile\">등록하신 리뷰기 목록입니다.</span>\r\n");
      out.write("			<span class=\"btn-write btn-up-right\"><a href=\"myreview_input.jsp\">리뷰작성</a></span>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<table class=\"item-table type1\">\r\n");
      out.write("			<tr>\r\n");
      out.write("				<th class=\"subject\">상품정보</th>\r\n");
      out.write("				<th class=\"rate\">만족도</th>\r\n");
      out.write("				<th class=\"regdate\">작성일</th>\r\n");
      out.write("			</tr>\r\n");
      out.write("			<!-- repeat item -->\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("				<td colspan=\"3\" class=\"empty\">작성하신 후기가 없습니다.</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<!--  -->\r\n");
      out.write("		</table>\r\n");
      out.write("\r\n");
      out.write("		<!-- PC 페이지 -->\r\n");
      out.write("		<div class=\"pagination1 only-pc\">\r\n");
      out.write("			<span class='btn-page prev'></span><span class='btn-page next'></span>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<form name=\"form1\" method=\"post\" action=\"myreview_insert_DB.asp\" enctype=\"multipart/form-data\">\r\n");
      out.write("<input type=\"hidden\" name=\"choice\">\r\n");
      out.write("<input type=\"hidden\" name=\"id\">\r\n");
      out.write("<input type=\"hidden\" name=\"pack_content_id\">\r\n");
      out.write("<input type=\"hidden\" name=\"givepoint\">\r\n");
      out.write("</form>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/footer.jsp", out, false);
      out.write('\r');
      out.write('\n');
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
