/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-11-08 02:48:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class member_005fWithdrawal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("	<meta charset=\"utf-8\">\r\n");
      out.write("	<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\r\n");
      out.write("	<title>::몬트라움:: 프리미엄 펫용품 전문쇼핑몰</title>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("	httpUrl = \"/common/all_site/member/member_out.asp\"\r\n");
      out.write("	httpUrl2 = \"www.montraum.com\"\r\n");
      out.write("\r\n");
      out.write("	function loginCheck() {\r\n");
      out.write("		location.href=\"/common/all_site/member/login.asp?refer_page=%2Fcommon%2Fall%5Fsite%2Fmember%2Fmember%5Fout%2Easp\"\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\" src=\"../resources/js/top.js\"></script>\r\n");
      out.write("<!--Content영역시작-->\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("	<div id=\"page-member-withdraw\" class=\"section-member pc-width\">\r\n");
      out.write("					<div id=\"navigation-bar\"><script>document.write(navistr)</script></div>\r\n");
      out.write("					<h2 class=\"page-title\"><script>document.write(siteTitle)</script></h2>\r\n");
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
      out.write("			\r\n");
      out.write("			</div>\r\n");
      out.write("		</li>\r\n");
      out.write("		<li><a href=\"member_Modify.jsp\">개인정보수정</a></li>\r\n");
      out.write("\r\n");
      out.write("		<li class=\"hide-mobile\"><a href=\"qna.jsp\">1:1문의</a></li>\r\n");
      out.write("		<li><a href=\"myreview_view.jsp\">나의후기</a></li>\r\n");
      out.write("		<li class=\"active\"><a href=\"member_Withdrawal.jsp\">회원탈퇴</a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		<!-- mypage 상단 끝 -->\r\n");
      out.write("		<div class=\"contents-wrapper\">\r\n");
      out.write("			<h2 class=\"page-sub-title kr\">회원탈퇴</h2>\r\n");
      out.write("			<div class=\"page-content-desc\">\r\n");
      out.write("				불편하셨던 점이나 불만사항을 남겨주시면 적극 반영하여 고객님의 불편함을 해결하도록 노력하겠습니다.\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<form name=\"frmReg\" action=\"/common/all_site/member/member_out_DB.asp\" method=\"post\">\r\n");
      out.write("				<table class=\"item-table type1 review-write\">\r\n");
      out.write("					<tr style=\"display:none;\">\r\n");
      out.write("						<th>비밀번호</th>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"password\" name=\"pwd1\" class=\"input1\" />\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>탈퇴사유</th>\r\n");
      out.write("						<td class=\"td-reasons\">\r\n");
      out.write("							<label><input type=\"radio\" name=\"OutReason\" value=\"배송서비스 불만\" /> 배송서비스 불만</label>\r\n");
      out.write("							<label><input type=\"radio\" name=\"OutReason\" value=\"제품가격/품질 불만\" /> 제품가격/품질 불만</label>\r\n");
      out.write("							<label><input type=\"radio\" name=\"OutReason\" value=\"고객응대 불친절 및 지연\" /> 고객응대 불친절 및 지연</label>\r\n");
      out.write("							<label><input type=\"radio\" name=\"OutReason\" value=\"제품 주문 과정의 어려움\" /> 제품 주문 과정의 어려움</label>\r\n");
      out.write("							<label><input type=\"radio\" name=\"OutReason\" value=\"개인정보유출 우려\" /> 개인정보유출 우려</label>\r\n");
      out.write("							<label><input type=\"radio\" name=\"OutReason\" value=\"시스템 에러\" /> 시스템 에러</label>\r\n");
      out.write("							<label><input type=\"radio\" name=\"OutReason\" value=\"\" /> 기타 (상세한 사유를 입력해주세요)\r\n");
      out.write("								<input name=\"OutReason_text\" type=\"text\" class=\"input1 reason\" />\r\n");
      out.write("							</label>\r\n");
      out.write("							\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td colspan=\"2\">\r\n");
      out.write("							<div class=\"block-row\">\r\n");
      out.write("								<div class=\"block-cell title\">남기는 말</div>\r\n");
      out.write("								<div class=\"block-cell textarea-wrapper\">\r\n");
      out.write("									<textarea name=\"OutReason_etc\" class=\"input1 body\"></textarea>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("				<div>\r\n");
      out.write("					<label class=\"agree-withdraw\">\r\n");
      out.write("						<input type=\"checkbox\" name=\"agree\" class=\"type1\" />\r\n");
      out.write("						회원탈퇴 안내를 모두 확인하였으며 탈퇴에 동의합니다.\r\n");
      out.write("					</label>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<div class=\"action-buttons\">\r\n");
      out.write("					<span class=\"cancel type1\" onClick=\"history.go(-1);\" style=\"cursor:pointer;\">취소</span>\r\n");
      out.write("					<span class=\"ok type2\" onClick=\"WriteCheck2();\" style=\"cursor:pointer;\">탈퇴</span>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"notice-wrapper clearfix\">\r\n");
      out.write("				<h3>확인해주세요</h3>\r\n");
      out.write("				<ul class=\"notice-list\">\r\n");
      out.write("					<li>회원탈퇴시 고객님의 정보는 상품 반품 및 A/S를 위해 전자상거래 등에서의 소비자 보호에 관한 법률에 의거한 본 사이트 고객정보 보호 정책에 따라 관리됩니다.</li>\r\n");
      out.write("					<li>탈퇴시 고객님께서 보유하셨던 예치금은 모두 소진되며, 한번 탈퇴한 아이디는 다시 사용 불가합니다.</li>	\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!--Content영역종료-->\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/footer.jsp", out, false);
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
