/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-11-10 07:48:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class review_005finput_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>리뷰 작성</title>\r\n");
      out.write("</head>\r\n");
      out.write("<script type=\"text/javascript\" src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script> \r\n");
      out.write("<script type=\"text/javascript\" src=\"/SE2/js/HuskyEZCreator.js\" charset=\"utf-8\"></script>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/header.jsp", out, false);
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("	<section>\r\n");
      out.write("\r\n");
      out.write("		<div id=\"page-member-wish\" class=\"section-member pc-width\">\r\n");
      out.write("			<div id=\"navigation-bar\">\r\n");
      out.write("				<script>document.write(navistr)</script>\r\n");
      out.write("				<span onclick=\"location.href=&#39;/&#39;\" style=\"cursor: pointer\">Home</span><span\r\n");
      out.write("					onclick=\"location.href=&#39;/common/process/buy_list.asp&#39;\"\r\n");
      out.write("					style=\"cursor: pointer\">Mypage </span><span\r\n");
      out.write("					onclick=\"location.href=&#39;/common/process/wish_list.asp&#39;\"\r\n");
      out.write("					style=\"cursor: pointer\" class=\"current\">Wish List </span>\r\n");
      out.write("			</div>\r\n");
      out.write("			<h2 class=\"page-title\">\r\n");
      out.write("				<script>document.write(siteTitle)</script>\r\n");
      out.write("				Mypage\r\n");
      out.write("			</h2>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div class=\"member-nav-wrapper\">\r\n");
      out.write("				<ul class=\"member-nav open-sub-menu\">\r\n");
      out.write("					<!-- 나의 쇼핑현황일 때 open-sub-menu class를 추가 -->\r\n");
      out.write("					<li class=\"active\">\r\n");
      out.write("						<div class=\"member-sub-nav\">\r\n");
      out.write("							<a href=\"orderlist.jsp\">주문내역</a> \r\n");
      out.write("							<a href=\"shoppingbasket.jsp\">장바구니</a> \r\n");
      out.write("							<a href=\"wish.jsp\" class=\"active\">위시리스트</a>\r\n");
      out.write("							<a href=\"mycoupon.jsp\">쿠폰</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</li>\r\n");
      out.write("					<li><a href=\"member_Modify.jsp\">개인정보수정</a></li>\r\n");
      out.write("\r\n");
      out.write("					<li class=\"hide-mobile\"><a href=\"qua.jsp\">1:1문의</a></li>\r\n");
      out.write("					<li><a href=\"myreview_view.jsp\">나의후기</a></li>\r\n");
      out.write("					<li><a href=\"member_Withdrawal.jsp\">회원탈퇴</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<!-- mypage 상단 끝 -->\r\n");
      out.write("			<div class=\"contents-wrapper\">\r\n");
      out.write("				<h2 class=\"page-sub-title kr\">나의 후기</h2>\r\n");
      out.write("				<div class=\"page-content-desc\">\r\n");
      out.write("					<span class=\"only-pc\">회원님께서 등록하신 리뷰 목록입니다. 작성하신 리뷰를 확인하세요.</span> <span\r\n");
      out.write("						class=\"only-mobile\">등록하신 리뷰 목록입니다.</span>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<form name=\"form1\" method=\"post\" action=\"myreview_insert_DB.asp\"\r\n");
      out.write("					enctype=\"multipart/form-data\">\r\n");
      out.write("					<input type=\"hidden\" name=\"order_buy_ini_id\" />\r\n");
      out.write("					 <inputtype=\"hidden\" name=\"id\" /> \r\n");
      out.write("					 <input type=\"hidden\"name=\"pack_content_id\" />\r\n");
      out.write("					  <input type=\"hidden\" name=\"category_site_id\" /> \r\n");
      out.write("					  <input type=\"hidden\"name=\"category_name_id\" />\r\n");
      out.write("					   <input type=\"hidden\" name=\"choice\" value=\"insert\">\r\n");
      out.write("					   <input type=\"hidden\" name=\"inputReView\" value=\"review\">\r\n");
      out.write("					<table class=\"item-table type1 review-write\">\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th>제목</th>\r\n");
      out.write("							<td><input type=\"text\" class=\"input1 subject\" name=\"subject\"\r\n");
      out.write("								value=\"\" /></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th>상품 선택</th>\r\n");
      out.write("							<td>\r\n");
      out.write("								<!-- 상품 조회하여 작성 할 때--> <span\r\n");
      out.write("								class=\"btn-type1 search-button btn-open-search-item\"><span>최근\r\n");
      out.write("										구매상품 조회</span></span>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th>추천의사</th>\r\n");
      out.write("							<td><input type=\"radio\" class=\"type1\" name=\"jumsu\" value=\"5\" checked />\r\n");
      out.write("								<div class=\"rating\">\r\n");
      out.write("									<span class=\"rating-star blt-rating-5\">&nbsp;</span>\r\n");
      out.write("								</div> <input type=\"radio\" class=\"type1\" name=\"jumsu\" value=\"4\" />\r\n");
      out.write("								<div class=\"rating\">\r\n");
      out.write("									<span class=\"rating-star blt-rating-4\">&nbsp;</span>\r\n");
      out.write("								</div> <input type=\"radio\" class=\"type1\" name=\"jumsu\" value=\"3\" />\r\n");
      out.write("								<div class=\"rating\">\r\n");
      out.write("									<span class=\"rating-star blt-rating-3\">&nbsp;</span>\r\n");
      out.write("								</div> <input type=\"radio\" class=\"type1\" name=\"jumsu\" value=\"2\" />\r\n");
      out.write("								<div class=\"rating\">\r\n");
      out.write("									<span class=\"rating-star blt-rating-2\">&nbsp;</span>\r\n");
      out.write("								</div> <input type=\"radio\" class=\"type1\" name=\"jumsu\" value=\"1\" />\r\n");
      out.write("								<div class=\"rating\">\r\n");
      out.write("									<span class=\"rating-star blt-rating-1\">&nbsp;</span>\r\n");
      out.write("								</div></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</table>\r\n");
      out.write("	<textarea name=\"se\" id=\"sota\" rows=\"10\" cols=\"100\" style=\"width:766px; height:412px;\"> </textarea>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("					<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("					 var oEditors = [];\r\n");
      out.write("\r\n");
      out.write("					 nhn.husky.EZCreator.createInIFrame({\r\n");
      out.write("\r\n");
      out.write("					 oAppRef: oEditors,\r\n");
      out.write("\r\n");
      out.write("					 elPlaceHolder: \"sota\", //textarea에서 지정한 id와 일치해야 합니다.\r\n");
      out.write("\r\n");
      out.write("					 sSkinURI: \"SE2/SmartEditor2Skin.html\",\r\n");
      out.write("\r\n");
      out.write("					 fCreator: \"createSEditor2\"\r\n");
      out.write("\r\n");
      out.write("					 });\r\n");
      out.write("\r\n");
      out.write("				</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("					<div id=\"review-body-mobile\" class=\"input-wrapper\">\r\n");
      out.write("						<textarea class=\"review-input-body\" name=\"contentm\"></textarea>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"review-notice only-pc\">\r\n");
      out.write("						<p>\r\n");
      out.write("							상품문의 및 교환&반품 문의는 1:1 게시판 또는 고객센터 (1644-3955)를 통해 문의주세요.<br />\r\n");
      out.write("							게시판 성격과 맞지 않는 글은 게시판 이동 및 쿠폰 환원 될 수 있습니다.\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"review-notice only-mobile\">\r\n");
      out.write("						<p>\r\n");
      out.write("							상품문의 및 교환&반품 문의는 1:1 게시판 또는 고객센터<br /> (1644-3955)를 통해 문의주세요.<br />\r\n");
      out.write("							게시판 성격과 맞지 않는 글은<br /> 게시판 이동 및 쿠폰 환원 될 수 있습니다.\r\n");
      out.write("						</p>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"action-buttons\">\r\n");
      out.write("						<span class=\"cancel type1\"\r\n");
      out.write("							onclick=\"javascript:location.href='review.jsp';\">취소</span> <span\r\n");
      out.write("							class=\"submit type2\" onclick=\"javascript:this_submit();\">등록</span>\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/include/footer.jsp", out, false);
      out.write('\r');
      out.write('\n');
      out.write('	');
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
