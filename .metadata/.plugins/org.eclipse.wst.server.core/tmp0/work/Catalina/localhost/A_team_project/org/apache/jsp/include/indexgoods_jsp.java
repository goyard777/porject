/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.53
 * Generated at: 2021-11-07 02:30:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.include;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexgoods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("				<!-- MD's CHOICE 시작-->\r\n");
      out.write("			<div class=\"contents-wrapper best-seller-wrapper pc-width\">\r\n");
      out.write("				<div style=\"text-align:center;  width:100%; margin-bottom: -35px; margin-top:50px\" id=\"best_seller_tit\">\r\n");
      out.write("					<img src=\"../resources/images/main_title_02.png\">\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<div id=\"best-seller\" class=\"item-list-type1\">\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview5b19.html?pack_content_id=1011'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1011_20191226am91347_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 0\" />\r\n");
      out.write("								<p class=\"item-title\">프로도기</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR]<br>노스멜패드 M 200매 (50매 x 4개)</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">60,000</span> <span\r\n");
      out.write("										class=\"now-price\">34,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview29bc.html?pack_content_id=1447'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1447_20200403pm43728_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 1\" />\r\n");
      out.write("								<p class=\"item-title\">프로도기</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR]<br>노스멜패드 L 대용량 패키지 200매</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">76,000</span> <span\r\n");
      out.write("										class=\"now-price\">44,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopviewae08.html?pack_content_id=1448'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1448_20211005pm41949_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 2\" />\r\n");
      out.write("								<p class=\"item-title\">프로도기</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR]<br>트레이닝패드 XL 대용량 패키지 120매</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">64,000</span> <span\r\n");
      out.write("										class=\"now-price\">37,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview6f62.html?pack_content_id=1571'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1571_20210901pm33611_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 3\" />\r\n");
      out.write("								<p class=\"item-title\">프로도기</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR]<br>퍼펙션패드 XL 80매 (20매 x 4개)</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">80,000</span> <span\r\n");
      out.write("										class=\"now-price\">46,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview7151.html?pack_content_id=1551'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1551_20201231am113249_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 4\" />\r\n");
      out.write("								<p class=\"item-title\">디그앤롤</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR] 핑크젤리 에어솔루션 모래 19.5kg (7.5kg + 12kg)</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">70,000</span> <span\r\n");
      out.write("										class=\"now-price\">37,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview107e.html?pack_content_id=1515'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1515_20200825pm35329_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 5\" />\r\n");
      out.write("								<p class=\"item-title\">디그앤롤</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR]<br>핑크젤리 에어솔루션 모래 30kg (7.5kg x 4개)</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">108,000</span> <span\r\n");
      out.write("										class=\"now-price\">58,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopviewc490.html?pack_content_id=1612'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1612_20210622am105512_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 6\" />\r\n");
      out.write("								<p class=\"item-title\">디그앤롤</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR] 핑크젤리 두부솔루션 모래 49L (7L x 7개)</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">77,000</span> <span\r\n");
      out.write("										class=\"now-price\">39,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview110f.html?pack_content_id=1319'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1319_20210905pm114143_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 7\" />\r\n");
      out.write("								<p class=\"item-title\">마스</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR]<br>플러쉬 콤 (19cm)</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">29,000</span> <span\r\n");
      out.write("										class=\"now-price\">15,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview6e57.html?pack_content_id=1035'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1035_20210905pm114331_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 8\" />\r\n");
      out.write("								<p class=\"item-title\">마스</p>\r\n");
      out.write("								<p class=\"item-description\">[생필품FAIR]<br>매트&하드 슬리커</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">30,000</span> <span\r\n");
      out.write("										class=\"now-price\">16,500</span>\r\n");
      out.write("							</li>\r\n");
      out.write("\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopviewd1a3.html?pack_content_id=1641'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1641_20210929am82337_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 9\" />\r\n");
      out.write("								<p class=\"item-title\">에그풀</p>\r\n");
      out.write("								<p class=\"item-description\">허그미 펫 타올 M 2개세트</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">52,000</span> <span\r\n");
      out.write("										class=\"now-price\">25,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"page-block\">\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview37f1.html?pack_content_id=1642'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1642_20210929am82428_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 10\" />\r\n");
      out.write("								<p class=\"item-title\">에그풀</p>\r\n");
      out.write("								<p class=\"item-description\">허그미 펫 타올 L 2개세트</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">66,000</span> <span\r\n");
      out.write("										class=\"now-price\">32,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("\r\n");
      out.write("							<li class=\"item\" style=\"cursor:pointer;\"\r\n");
      out.write("								onclick=\"location.href = 'shopview9687.html?pack_content_id=1637'\">\r\n");
      out.write("								<img class=\"item-image\" src=\"../resources/images/p1637_20210929am81938_1.jpg\"\r\n");
      out.write("									alt=\"MDs Choice 11\" />\r\n");
      out.write("								<p class=\"item-title\">에그풀</p>\r\n");
      out.write("								<p class=\"item-description\">계란후라이 넥카라</p>\r\n");
      out.write("								<p class=\"item-price\"><span class=\"list-price\">23,000</span> <span\r\n");
      out.write("										class=\"now-price\">14,900</span>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<script>\r\n");
      out.write("				$('#best-seller').owlCarousel({\r\n");
      out.write("					loop: true,\r\n");
      out.write("					nav: true,\r\n");
      out.write("					autoplay: true,\r\n");
      out.write("					items: 2,\r\n");
      out.write("					margin: 0,\r\n");
      out.write("					dotsEach: 2,\r\n");
      out.write("					navText: ['<img src=\"../resources/images/btn_prev.png\">', '<img src=\"../resources/images/btn_next.png\">'],\r\n");
      out.write("					dots: true,\r\n");
      out.write("					responsive: {\r\n");
      out.write("						360: { items: 2, margin: 0, dotsEach: 2, slideBy: 2 },\r\n");
      out.write("						1000: { items: 2, margin: 20, dotsEach: 2, nav: false, slideBy: 2 }\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("			</script>\r\n");
      out.write("\r\n");
      out.write("			<!-- MD's CHOICE 끝-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<!-- BEST ITEMS -->\r\n");
      out.write("			<div id=\"best-items\" style=\"margin-bottom:50px;\">\r\n");
      out.write("				<div class=\"pc-width\">\r\n");
      out.write("					<div id=\"category_name_title\"\r\n");
      out.write("						style=\"text-align:center;  width:100%; margin-top:30px; margin-bottom:20px;\"><img\r\n");
      out.write("							src=\"../resources/images/main_title_03.png\"></div>\r\n");
      out.write("					<div class=\"category-item-wrapper\">\r\n");
      out.write("						<div id=\"category-item\" class=\"tmphot\" cate=\"1\">\r\n");
      out.write("							<div class=\"page-block\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview2670.html?thisCategory=0&amp;pack_content_id=1360'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1360_20191204pm24605_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"20\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">노스멜패드 XL 대용량 패키지 120매</p>\r\n");
      out.write("									</li>\r\n");
      out.write("\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopviewa065.html?thisCategory=0&amp;pack_content_id=1499'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1499_20210830am81418_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"101\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">이지츄 그레인프리 피쉬 2kg</p>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"page-block\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview0d4b.html?thisCategory=0&amp;pack_content_id=1497'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1497_20210830am81519_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"101\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">그레인프리 덕 2.72kg</p>\r\n");
      out.write("									</li>\r\n");
      out.write("\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview28fc.html?thisCategory=0&amp;pack_content_id=1074'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1074_20210830am80834_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"54\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">홀리스틱 캣 다이어트 5.4kg (전연령)</p>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"page-block\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopviewd7de.html?thisCategory=0&amp;pack_content_id=1496'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1496_20210830am81546_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"101\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">그레인프리 덕 1.36kg</p>\r\n");
      out.write("									</li>\r\n");
      out.write("\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview8a75.html?thisCategory=0&amp;pack_content_id=1072'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1072_20210830am80849_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"54\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">그레인프리 캣 다이어트 5.4kg (전연령)</p>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"page-block\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopviewb559.html?thisCategory=0&amp;pack_content_id=1515'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1515_20200825pm35329_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"73\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">[생필품FAIR]^핑크젤리 에어솔루션 모래 30kg (7.5kg x 4개)</p>\r\n");
      out.write("									</li>\r\n");
      out.write("\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview3e55.html?thisCategory=0&amp;pack_content_id=1447'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1447_20200403pm43728_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"20\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">[생필품FAIR]^노스멜패드 L 대용량 패키지 200매</p>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"page-block\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopviewa2b5.html?thisCategory=0&amp;pack_content_id=1011'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1011_20191226am91347_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"20\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">[생필품FAIR]^노스멜패드 M 200매 (50매 x 4개)</p>\r\n");
      out.write("									</li>\r\n");
      out.write("\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview69c5.html?thisCategory=0&amp;pack_content_id=1448'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1448_20211005pm41949_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"20\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">[생필품FAIR]^트레이닝패드 XL 대용량 패키지 120매</p>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"page-block\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview7a72.html?thisCategory=0&amp;pack_content_id=1495'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1495_20210830am81652_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"101\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">그레인프리 캣 피쉬 1.81kg</p>\r\n");
      out.write("									</li>\r\n");
      out.write("\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopviewa914.html?thisCategory=0&amp;pack_content_id=1498'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1498_20210830am81446_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"101\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">이지츄 그레인프리 피쉬 1kg</p>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"page-block\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopviewb4f5.html?thisCategory=0&amp;pack_content_id=1581'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1581_20211007pm31955_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"54\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">그레인프리 오션 레시피(연어) 5.9kg</p>\r\n");
      out.write("									</li>\r\n");
      out.write("\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview95e9.html?thisCategory=0&amp;pack_content_id=1500'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1500_20210830am81348_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"101\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">오리지날 치킨 1.36kg</p>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"page-block\">\r\n");
      out.write("								<ul>\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview1209.html?thisCategory=0&amp;pack_content_id=1574'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1574_20210901pm33415_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"20\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">퍼펙션패드 XL 120매 (20매 x 6개)</p>\r\n");
      out.write("									</li>\r\n");
      out.write("\r\n");
      out.write("									<li class=\"item\"\r\n");
      out.write("										onclick=\"location.href = 'shopview06fe.html?thisCategory=0&amp;pack_content_id=1518'\"\r\n");
      out.write("										style=\"cursor:pointer;\">\r\n");
      out.write("										<img class=\"item-image\" src=\"../resources/images/p1518_20210901pm32923_1.jpg\">\r\n");
      out.write("										<p class=\"item-title\">\r\n");
      out.write("											<script language=\"javascript\">view_name(\"view_brand\", \"20\", \"write\")</script>\r\n");
      out.write("										</p>\r\n");
      out.write("										<p class=\"item-description\">퍼펙션패드 XXL 80매 (20매 x 4개)</p>\r\n");
      out.write("									</li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- BEST ITEMS -->\r\n");
      out.write("	\r\n");
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
