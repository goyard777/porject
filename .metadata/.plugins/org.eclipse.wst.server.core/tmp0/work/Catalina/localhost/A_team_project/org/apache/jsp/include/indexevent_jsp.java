/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-11-07 02:51:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexevent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write("				.wide_twobanner06 {\r\n");
      out.write("					background-image: url(\"../resources/images/main_wide_banner_21_bg.jpg\");\r\n");
      out.write("					background-repeat: repeat;\r\n");
      out.write("				}\r\n");
      out.write("\r\n");
      out.write("				.wide_twobanner06 .contents-wrapper {\r\n");
      out.write("					width: 1120px;\r\n");
      out.write("					margin: 0 auto;\r\n");
      out.write("				}\r\n");
      out.write("\r\n");
      out.write("				.wide_twobanner06 .contents-wrapper a {\r\n");
      out.write("					overflow: hidden;\r\n");
      out.write("				}\r\n");
      out.write("			</style>\r\n");
      out.write("			<!--  sale 특가 시원하게 쏩니다 부분  끝 -->\r\n");
      out.write("			<section>\r\n");
      out.write("				<div class=\"wide_twobanner06\">\r\n");
      out.write("					<div class=\"contents-wrapper only-pc\">\r\n");
      out.write("						<a href=\"eventview9b14.html?idx=462\">\r\n");
      out.write("							<img src=\"../resources/images/main_wide_banner_21.jpg\" alt=\"SALE\" title=\"SALE\">\r\n");
      out.write("						</a>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("			</section>\r\n");
      out.write("\r\n");
      out.write("			<!-- 하단 움직이는 이미지  scroller 부분  -->\r\n");
      out.write("			<div class=\"contents-wrapper mont-event-wrapper pc-width\">\r\n");
      out.write("				<div id=\"mont-event-title\" style=\"text-align:center; margin-top:50px; width:100%\"><img\r\n");
      out.write("						src=\"../resources/images/main_title_06.png\"></div>\r\n");
      out.write("				<div class=\"more-btn\">\r\n");
      out.write("					<img onclick=\"location.href='event.html'\" style=\"cursor:pointer;\" src=\"../resources/images/bt_event_more.png\">\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div id=\"mont-event\">\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"eventview695e.html?idx=517\">\r\n");
      out.write("									<p><img src=\"../resources/images/1_20210917pm11158.jpg\" alt=\"\"></p>\r\n");
      out.write("								</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"eventviewbca9.html?idx=523\">\r\n");
      out.write("									<p><img src=\"../resources/images/2_20211022pm24809.jpg\" alt=\"\"></p>\r\n");
      out.write("								</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"eventview1798.html?idx=522\">\r\n");
      out.write("									<p><img src=\"../resources/images/3_20211022pm23332.jpg\" alt=\"\"></p>\r\n");
      out.write("								</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"eventviewf30c.html?idx=513\">\r\n");
      out.write("									<p><img src=\"../resources/images/4_20211008pm33238.jpg\" alt=\"\"></p>\r\n");
      out.write("								</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"eventview297f.html?idx=519\">\r\n");
      out.write("									<p><img src=\"../resources/images/6_20210929am84821.jpg\" alt=\"\"></p>\r\n");
      out.write("								</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- 하단 배송 교환 문의 아이콘 부분  -->\r\n");
      out.write("				<div id=\"mont-bn\">\r\n");
      out.write("					<div class=\"bn-div mr\" onClick=\"location.href='list.html'\" style=\"cursor:pointer;\">\r\n");
      out.write("						<div class=\"bn-img\" style=\"height:107px;\"><img src=\"../resources/images/main_icon_cs.png\" alt=\"\"></div>\r\n");
      out.write("						<div class=\"bn-txt\">배송/교환/환불 등<br><span>문의는 여기로!</span></div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div class=\"bn-div\" onClick=\"location.href='members.html'\" style=\"cursor:pointer;\">\r\n");
      out.write("						<div class=\"bn-img\"><img src=\"../resources/images/main_icon_member.png\" alt=\"\"></div>\r\n");
      out.write("						<div class=\"bn-txt\">혜택뿜뿜<br><span>MEMBERSHIP</span></div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- 하단 배송 교환 문의 아이콘 부분   끝-->\r\n");
      out.write("			</div>\r\n");
      out.write("			<script>\r\n");
      out.write("				$('#mont-event').owlCarousel({\r\n");
      out.write("					loop: true,\r\n");
      out.write("					nav: true,\r\n");
      out.write("					autoplay: true,\r\n");
      out.write("					items: 1,\r\n");
      out.write("					margin: 0,\r\n");
      out.write("					dotsEach: 1,\r\n");
      out.write("					navText: ['<img src=\"../resources/images/btn_prevw.png\">', '<img src=\"../resources/images/btn_next-2.png\">'],\r\n");
      out.write("					dots: false,\r\n");
      out.write("					responsive: {\r\n");
      out.write("						360: { items: 1, margin: 0, dotsEach: 1, slideBy: 1 },\r\n");
      out.write("						1000: { items: 2, margin: 10, dotsEach: 1, slideBy: 2 }\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("			</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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