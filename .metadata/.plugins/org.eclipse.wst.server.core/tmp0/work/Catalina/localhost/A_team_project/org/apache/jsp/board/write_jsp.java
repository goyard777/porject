/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-11-08 02:41:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class write_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("	<title>1:1문의 작성</title>\r\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<meta name=\"description\" content=\"\">\r\n");
      out.write("	<meta name=\"author\" content=\"\">\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("	<!--link rel=\"stylesheet\" type=\"text/css\" href=\"//cloud.typography.com/7688574/788488/css/fonts.css\" /-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("	httpUrl = \"/common/process/qanda/write.asp\"\r\n");
      out.write("	httpUrl2 = \"www.montraum.com\"\r\n");
      out.write("\r\n");
      out.write("	function loginCheck() {\r\n");
      out.write("		location.href=\"/common/all_site/member/login.asp?refer_page=%2Fcommon%2Fprocess%2Fqanda%2Fwrite%2Easp\"\r\n");
      out.write("	}\r\n");
      out.write("</script>\r\n");
      out.write("<script language=\"javascript\" src=\"../resources/images/top.js\"></script>\r\n");
      out.write("<!--Content영역시작-->\r\n");
      out.write("<section>\r\n");
      out.write("	<div id=\"page-member-ask\" class=\"section-member pc-width\">\r\n");
      out.write("		<div id=\"navigation-bar\"><script>document.write(navistr)</script></div>\r\n");
      out.write("		<h2 class=\"page-title\"><script>document.write(siteTitle)</script></h2>\r\n");
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
      out.write("		<li><a href=\"member_Modify.jsp\">개인정보수정</a></li>\r\n");
      out.write("		<li><a href=\"baesong_addr.jsp\">주소록관리</a></li>\r\n");
      out.write("		<li class=\"hide-mobile active\"><a href=\"qna.jsp\">1:1문의</a></li>\r\n");
      out.write("		<li><a href=\"myreview_view.jsp\">나의후기</a></li>\r\n");
      out.write("		<li><a href=\"member_Withdrawal.jsp\">회원탈퇴</a></li>\r\n");
      out.write("	</ul>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("		<!-- mypage 상단 끝 -->\r\n");
      out.write("		<div class=\"contents-wrapper\">\r\n");
      out.write("			<h2 class=\"page-sub-title kr\">1:1 문의</h2>\r\n");
      out.write("			<div class=\"page-content-desc\">\r\n");
      out.write("				<span class=\"only-pc\">제품, 주문, 배송 등에 관한 문의사항을 남겨주세요. 빠르고 친절하게 안내해 드립니다.</span>\r\n");
      out.write("				<span class=\"only-mobile\">제품, 주문, 배송 등에 관한 문의사항을 남겨주세요.</span>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<form name=\"form1\" method=\"post\" action=\"insert_DB.asp\" enctype=\"multipart/form-data\">\r\n");
      out.write("				<input type=\"hidden\" name=\"choice\" value=\"insert\"/>\r\n");
      out.write("				<table class=\"item-table type1 ask-write\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>질문유형</th>\r\n");
      out.write("						<td>\r\n");
      out.write("							<select name=\"type\" class=\"type2 kind\" onChange=\"view_jumun(this.value);\">\r\n");
      out.write("								<option value=\"\">선택하세요.</option>\r\n");
      out.write("								<option value=\"1\">일반문의</option>\r\n");
      out.write("								<option value=\"2\">주문관련 문의</option>\r\n");
      out.write("							</select>\r\n");
      out.write("							<span id=\"jumun\" name=\"jumun\" style=\"display:none;\">\r\n");
      out.write("								<input type=\"text\" name =\"jumuncode\" class=\"input1\" readOnly>\r\n");
      out.write("								<input type=\"hidden\" name =\"id\">\r\n");
      out.write("								<span class=\"ok type2 btn-type1\" onClick=\"search_jumun();\" style=\"cursor:pointer;\">주문번호 찾기</span>\r\n");
      out.write("							</span>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>답변이메일</th>\r\n");
      out.write("						<td>\r\n");
      out.write("							\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th>제목</th>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" name=\"subject\" class=\"input2 subject\" />\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr id=\"qna-file-mobile\">\r\n");
      out.write("\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("				<div id=\"qna-body-pc\" class=\"input-wrapper\">\r\n");
      out.write("					<script type=\"text/javascript\" src=\"/_vir0001/easyEditor/easyEditor_euckrCustomer.js\" charset=\"euc-kr\"></script>\r\n");
      out.write("<textarea name=\"content\" id=\"content\" class=\"input1 ask-body\"></textarea>\r\n");
      out.write("<script type=\"text/javascript\" >\r\n");
      out.write("var ed = new easyEditor(\"content\");\r\n");
      out.write("ed.cfg.Btn = [\"font\",\"size\",\"bar\",\r\n");
      out.write("				\"left\",\"center\",\"right\",\"bar\",\r\n");
      out.write("				\"color\",\"hilite\",\"bar\",\r\n");
      out.write("				\"bold\",\"italic\",\"underline\",\"strike\",\"bar\",\r\n");
      out.write("				\"hr\",\"link\",\"bar\",\r\n");
      out.write("				\"image\",\"bar\",\"source\"];\r\n");
      out.write("ed.cfg.height='450px'\r\n");
      out.write("ed.init();\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<div id=\"qna-body-mobile\" class=\"input-wrapper\">\r\n");
      out.write("					<textarea class=\"input1 ask-body\" name=\"contentm\" rows=\"10\"></textarea>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"action-buttons\">\r\n");
      out.write("					<span class=\"cancel type1\" onclick=\"history.back();\" style=\"cursor:pointer;\">취소</span>\r\n");
      out.write("					<span class=\"ok type2\" onclick=\"this_submit();\" style=\"cursor:pointer;\">등록</span>\r\n");
      out.write("				</div>\r\n");
      out.write("			</form>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" async src=\"//cdn-aitg.widerplanet.com/js/wp_astg_4.0.js\"></script>\r\n");
      out.write("<!-- WIDERPLANET  SCRIPT START 2018.5.21 (공통)-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Enliple Common Tracker v3.6 [공용] start -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("<!--\r\n");
      out.write("function mobRf() {\r\n");
      out.write("    var rf = new EN();\r\n");
      out.write("    rf.setData(\"userid\", \"montraum\");\r\n");
      out.write("    rf.setSSL(true);\r\n");
      out.write("    rf.sendRf();\r\n");
      out.write("}\r\n");
      out.write("//-->\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("	form = document.form1;\r\n");
      out.write("\r\n");
      out.write("	function this_submit() {\r\n");
      out.write("		if (form.type.value == \"2\" && form.jumuncode.value == \"\" ) {\r\n");
      out.write("			alert(\"문의형태가 [주문관련 문의]인 경우 주문번호찾기를 통하여 주문번호를 입력하여 주십시오.\");\r\n");
      out.write("			form.jumuncode.focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		if (form.subject.value == \"\") {\r\n");
      out.write("			alert (\"제목을 작성해 주십시오\");\r\n");
      out.write("			form.subject.focus();\r\n");
      out.write("			return false;\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		if (!isMobile) {\r\n");
      out.write("			if (ed.getHtml() == \"\") {\r\n");
      out.write("				alert(\"내용을 작성해 주십시오\");\r\n");
      out.write("				return false;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("		else {\r\n");
      out.write("			if (form.contentm.value == \"\") {\r\n");
      out.write("				alert (\"내용을 작성해 주십시오\");\r\n");
      out.write("				return false;\r\n");
      out.write("			} else {\r\n");
      out.write("				form.content.value = form.contentm.value;\r\n");
      out.write("			}\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		form.submit();\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	function view_jumun(val){\r\n");
      out.write("		if (val == 2) {\r\n");
      out.write("			document.getElementsByName(\"jumun\")[0].style.display = \"\";\r\n");
      out.write("		} else {\r\n");
      out.write("			document.getElementsByName(\"jumun\")[0].style.display = \"none\";\r\n");
      out.write("			form.jumuncode.value = \"\";\r\n");
      out.write("			form.id.value = \"\";\r\n");
      out.write("		}\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	function search_jumun(){\r\n");
      out.write("		window.open(\"/common/process/qanda/search_jumuncode.asp\",\"jumunpop\",\"width=750,height=600,scrollbars=yes,resizable\");\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	$(function() {\r\n");
      out.write("		if (!isMobile) {\r\n");
      out.write("			 document.getElementById(\"qna-body-pc\").style.display = \"block\";\r\n");
      out.write("			 document.getElementById(\"qna-body-mobile\").style.display = \"none\";\r\n");
      out.write("			 document.getElementById(\"qna-file-mobile\").innerHTML = \"\";\r\n");
      out.write("		}\r\n");
      out.write("		else {\r\n");
      out.write("			document.getElementById(\"qna-body-pc\").style.display = \"none\";\r\n");
      out.write("			document.getElementById(\"qna-body-mobile\").style.display = \"block\";\r\n");
      out.write("			document.getElementById(\"qna-file-mobile\").innerHTML = \"<th>파일첨부</th><td><input type=\\\"file\\\" name=\\\"file\\\" /></td>\";\r\n");
      out.write("		}\r\n");
      out.write("	});\r\n");
      out.write("//-->\r\n");
      out.write("</SCRIPT>");
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