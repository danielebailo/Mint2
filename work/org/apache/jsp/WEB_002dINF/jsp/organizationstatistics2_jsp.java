/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2014-04-04 13:08:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class organizationstatistics2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write("\n");
      out.write("      \n");
      out.write("     $(function(){\n");
      out.write("    \t var self = this;\n");
      out.write("    \t var content = $('#chart_div');\n");
      out.write("    \t var panel = content.closest('div[id^=\"kp\"]');\n");
      out.write("    \t $K.kaiten('maximize', panel);\n");
      out.write(" \n");
      out.write("\t\t\tdrawBarChart()\n");
      out.write("\t\t\n");
      out.write("\t  \n");
      out.write("\n");
      out.write(" \tfunction drawBarChart()\n");
      out.write("    {\n");
      out.write("\n");
      out.write("     $('#chart_div').html('<span><img src=\"images/buttons/loading.gif\" alt=\"\"></span>');\n");
      out.write("     $('#chart_1').html('<span><img src=\"images/buttons/loading.gif\" alt=\"\"></span>');\n");
      out.write("\n");
      out.write("     \n");
      out.write("     \n");
      out.write("    $.ajax({\n");
      out.write("    type:'GET',\n");
      out.write("    url:\"OrganizationStat.action\",\n");
      out.write("  \tdata:\"organizationId=\"+");
      out.print(request.getAttribute("getOrganizationId()"));
      out.write(",\n");
      out.write("    success:function(data) {\n");
      out.write("\n");
      out.write("    \tvar sets = []\n");
      out.write("     \tvar headers = [];\n");
      out.write("     \tvar keys = [];\n");
      out.write("     \tvar org = data.result;\n");
      out.write("     \t\n");
      out.write("     \t\n");
      out.write("     \t\n");
      out.write("     \tvar values = [];\n");
      out.write("     \tfor (var i = 0; i< org.length;i++){\n");
      out.write("     \t\tvar attributes = org[i];\n");
      out.write("\t     \tfor (var key in attributes){\n");
      out.write("    \t \t\tconsole.log(key);\n");
      out.write("     \t\t\theaders.push(key);\n");
      out.write("     \t\t\tvalue = attributes[key];\n");
      out.write("     \t\t\tconsole.log(value);\n");
      out.write("     \t\t\tvalues.push(value);\n");
      out.write("     \t\t\tconsole.log(values);\n");
      out.write("     \t\t}\n");
      out.write("\t     \t\n");
      out.write("     \t}\n");
      out.write("      \tsets.push(headers);\n");
      out.write("      \tsets.push(values);\n");
      out.write("     \t\n");
      out.write("     \tconsole.log(sets);  \n");
      out.write("     \t\n");
      out.write("     \t\n");
      out.write("     \tvar data = google.visualization.arrayToDataTable(sets);\n");
      out.write("    \t\n");
      out.write("\t\tvar options = {'title':'Items counted : ");
      out.print(request.getAttribute("getName()"));
      out.write("'}\n");
      out.write("        \n");
      out.write("\t\tvar table = new google.visualization.Table(document.getElementById('chart_1'));\n");
      out.write("        table.draw(data, options);\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        var chart = new google.visualization.ColumnChart(document.getElementById('chart_div'));\n");
      out.write("        chart.draw(data, options);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("       \n");
      out.write("    });\n");
      out.write("    }\n");
      out.write(" \t\n");
      out.write("     })\n");
      out.write("    </script>\n");
      out.write("   \n");
      out.write("   \t\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<div class=\"panel-body\"  style=\"height: 100%; width: 100%\">\n");
      out.write("\t<div class=\"block-nav\"  style=\"height: 100%; width: 100%\">\n");
      out.write("\t\t<div class=\"summary\">\n");
      out.write("\t\t\t<div class=\"label\">\n");
      out.write("\t\t\t");
      out.print(request.getAttribute("getName()"));
      out.write("</div>\n");
      out.write("\t\t\t<div class=\"info\"><br/></div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t<h3>Overall</h3>\n");
      out.write("\t\t<div id=\"chart_div\"  style=\"height: 50%; width: 100%\"></div>\n");
      out.write("\t\t\t<div id=\"chart_1\"  style=\"height: 50%; width: 100%\"></div>\n");
      out.write("       \t\t\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
