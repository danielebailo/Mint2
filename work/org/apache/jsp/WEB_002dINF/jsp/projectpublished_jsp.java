/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.30
 * Generated at: 2014-04-04 13:08:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class projectpublished_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    \n");
      out.write(" \n");
      out.write("     $(function(){\n");
      out.write("    \t var self = this;\n");
      out.write("    \t var content = $('#chart_1');\n");
      out.write("    \t var panel = content.closest('div[id^=\"kp\"]');\n");
      out.write("    \t $K.kaiten('maximize', panel);\n");
      out.write("\t\tdrawBarChart()  \n");
      out.write("     \n");
      out.write(" function drawBarChart()\n");
      out.write("\t\t{\n");
      out.write("\t\t\t  // Prepare the data\n");
      out.write("\t\t\t  var data = google.visualization.arrayToDataTable([\n");
      out.write("\t\t\t    ['Country', 'Region/State', 'City', 'Population'],\n");
      out.write("\t\t\t    ['USA', 'California', 'San Francisco', 776733],\n");
      out.write("\t\t\t    ['USA', 'California', 'Los Angeles', 3694820],\n");
      out.write("\t\t\t    ['USA', 'California', 'Mountain View', 70708],\n");
      out.write("\t\t\t    ['USA', 'New York', 'New York', 8175173],\n");
      out.write("\t\t\t    ['USA', 'New York', 'Albany', 857592],\n");
      out.write("\t\t\t    ['France', 'Ile-de-France', 'Paris', 2193031],\n");
      out.write("\t\t\t    ['France', 'Ile-de-France', 'Orly', 21372],\n");
      out.write("\t\t\t    ['France', 'Provence', 'Marseille', 852395],\n");
      out.write("\t\t\t    ['France', 'Provence', 'Nice', 348556]\n");
      out.write("\t\t\t  ]);\n");
      out.write("\n");
      out.write("\t\t\t  // Define category pickers for 'Country', 'Region/State' and 'City'\n");
      out.write("\t\t\t  var countryPicker = new google.visualization.ControlWrapper({\n");
      out.write("\t\t\t    'controlType': 'CategoryFilter',\n");
      out.write("\t\t\t    'containerId': 'control1',\n");
      out.write("\t\t\t    'options': {\n");
      out.write("\t\t\t      'filterColumnLabel': 'Country',\n");
      out.write("\t\t\t      'ui': {\n");
      out.write("\t\t\t        'labelStacking': 'vertical',\n");
      out.write("\t\t\t        'allowTyping': false,\n");
      out.write("\t\t\t        'allowMultiple': false\n");
      out.write("\t\t\t      }\n");
      out.write("\t\t\t    }\n");
      out.write("\t\t\t  });\n");
      out.write("\n");
      out.write("\t\t\t  var regionPicker = new google.visualization.ControlWrapper({\n");
      out.write("\t\t\t    'controlType': 'CategoryFilter',\n");
      out.write("\t\t\t    'containerId': 'control2',\n");
      out.write("\t\t\t    'options': {\n");
      out.write("\t\t\t      'filterColumnLabel': 'Region/State',\n");
      out.write("\t\t\t      'ui': {\n");
      out.write("\t\t\t        'labelStacking': 'vertical',\n");
      out.write("\t\t\t        'allowTyping': false,\n");
      out.write("\t\t\t        'allowMultiple': false\n");
      out.write("\t\t\t      }\n");
      out.write("\t\t\t    }\n");
      out.write("\t\t\t  });\n");
      out.write("\n");
      out.write("\t\t\t  var cityPicker = new google.visualization.ControlWrapper({\n");
      out.write("\t\t\t    'controlType': 'CategoryFilter',\n");
      out.write("\t\t\t    'containerId': 'control3',\n");
      out.write("\t\t\t    'options': {\n");
      out.write("\t\t\t      'filterColumnLabel': 'City',\n");
      out.write("\t\t\t      'ui': {\n");
      out.write("\t\t\t        'labelStacking': 'vertical',\n");
      out.write("\t\t\t        'allowTyping': false,\n");
      out.write("\t\t\t        'allowMultiple': false\n");
      out.write("\t\t\t      }\n");
      out.write("\t\t\t    }\n");
      out.write("\t\t\t  });\n");
      out.write("\n");
      out.write("\t\t\t  // Define a bar chart to show 'Population' data\n");
      out.write("\t\t\t  var barChart = new google.visualization.ChartWrapper({\n");
      out.write("\t\t\t    'chartType': 'BarChart',\n");
      out.write("\t\t\t    'containerId': 'chart1',\n");
      out.write("\t\t\t    'options': {\n");
      out.write("\t\t\t      'width': 400,\n");
      out.write("\t\t\t      'height': 300,\n");
      out.write("\t\t\t      'chartArea': {top: 0, right: 0, bottom: 0}\n");
      out.write("\t\t\t    },\n");
      out.write("\t\t\t    // Configure the barchart to use columns 2 (City) and 3 (Population)\n");
      out.write("\t\t\t    'view': {'columns': [2, 3]}\n");
      out.write("\t\t\t  });\n");
      out.write("\n");
      out.write("\t\t\t  // Create the dashboard.\n");
      out.write("\t\t\t  new google.visualization.Dashboard(document.getElementById('dashboard')).\n");
      out.write("\t\t\t    // Configure the controls so that:\n");
      out.write("\t\t\t    // - the 'Country' selection drives the 'Region' one,\n");
      out.write("\t\t\t    // - the 'Region' selection drives the 'City' one,\n");
      out.write("\t\t\t    // - and finally the 'City' output drives the chart\n");
      out.write("\t\t\t    bind(countryPicker, regionPicker).\n");
      out.write("\t\t\t    bind(regionPicker, cityPicker).\n");
      out.write("\t\t\t    bind(cityPicker, barChart).\n");
      out.write("\t\t\t    // Draw the dashboard\n");
      out.write("\t\t\t    draw(data);\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("     })\n");
      out.write("\n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"block-nav\">\n");
      out.write("\t\t<div class=\"summary\">\n");
      out.write("\t\t\t<div class=\"label\">");
      out.print(request.getAttribute("getName()"));
      out.write("</div>\n");
      out.write("\t\t\t<div class=\"info\"><br/></div>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t \n");
      out.write("\t\t <div style=\"width: 100%; overflow: hidden;\">\n");
      out.write("   \t\t <div id=\"dashboard\">\n");
      out.write("      <table>\n");
      out.write("        <tr style='vertical-align: top'>\n");
      out.write("          <td style='width: 300px; font-size: 0.9em;'>\n");
      out.write("            <div id=\"control1\"></div>\n");
      out.write("            <div id=\"control2\"></div>\n");
      out.write("            <div id=\"control3\"></div>\n");
      out.write("          </td>\n");
      out.write("          <td style='width: 600px'>\n");
      out.write("            <div style=\"float: left;\" id=\"chart1\"></div>\n");
      out.write("            <div style=\"float: left;\" id=\"chart2\"></div>\n");
      out.write("            <div style=\"float: left;\" id=\"chart3\"></div>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("</div>\n");
      out.write("\t\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(" \n");
      out.write("    <script type=\"text/javascript\" src=\"http://www.google.com/jsapi\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      google.load('visualization', '1.1', {packages: ['controls']});\n");
      out.write("    </script>\n");
      out.write("    gui<script type=\"text/javascript\">\n");
      out.write("      function drawVisualization() {\n");
      out.write("        // Prepare the data.\n");
      out.write("         var query = new google.visualization.Query(      'http://spreadsheets.google.com/tq?key=0AozvCNI02VmpdFBsVkxOQ3NENVZ1djhxVmZUNUdtY0E&single=true&gid=0&pub=1');\n");
      out.write("\t\t\tquery.send(handleQueryResponse);\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\tfunction handleQueryResponse(response) {\n");
      out.write("\t\t\tdata = response.getDataTable();\n");
      out.write("\t\t\t// data.addRow(['Total', group.getValue(0, 1)]);\n");
      out.write("\t\t\t\n");
      out.write("        // Define a category picker for the 'Metric' column.\n");
      out.write("        var categoryPicker = new google.visualization.ControlWrapper({\n");
      out.write("          'controlType': 'CategoryFilter',\n");
      out.write("          'containerId': 'control',\n");
      out.write("          'options': {\n");
      out.write("            'filterColumnIndex': 0,\n");
      out.write("            'ui': {\n");
      out.write("              'allowTyping': false,\n");
      out.write("              'allowMultiple': true,\n");
      out.write("              'selectedValuesLayout': 'belowStacked'\n");
      out.write("            }\n");
      out.write("          },\n");
      out.write("\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Define a table.\n");
      out.write("        var table = new google.visualization.ChartWrapper({\n");
      out.write("          'chartType': 'Table',\n");
      out.write("          'containerId': 'chart',\n");
      out.write("          'options': {\n");
      out.write("            'width': 300,\n");
      out.write("            'height': 600\n");
      out.write("          },\n");
      out.write("\t\t  'view': {'columns': [0, 2]}\n");
      out.write("        });\n");
      out.write("\t\t\n");
      out.write("\t\t// get Total sum.\n");
      out.write("\t\tgoogle.visualization.events.addListener(table, 'ready', function () {\n");
      out.write("        var group = google.visualization.data.group(table.getDataTable(), [{\n");
      out.write("            // we need a key column to group on, but since we want all rows grouped into 1, \n");
      out.write("            // then it needs a constant value\n");
      out.write("            column: 0,\n");
      out.write("            type: 'number',\n");
      out.write("            modifier: function () {\n");
      out.write("                return 1;\n");
      out.write("            }\n");
      out.write("        }], [{\n");
      out.write("            // get the Total sum.\n");
      out.write("            column: 2,\n");
      out.write("            label: 'Total Sum',\n");
      out.write("            type: 'number',\n");
      out.write("            aggregation: google.visualization.data.sum\n");
      out.write("        }]);\n");
      out.write("        document.getElementById('sum').innerHTML = group.getValue(0, 1);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("        // Create the dashboard.\n");
      out.write("        var dashboard = new google.visualization.Dashboard(document.getElementById('dashboard')).\n");
      out.write("          // Configure the category picker to affect the table\n");
      out.write("          bind(categoryPicker, table).\n");
      out.write("          // Draw the dashboard\n");
      out.write("          draw(data);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      google.setOnLoadCallback(drawVisualization);\n");
      out.write("    </script>\n");
      out.write("  \n");
      out.write("<div id=\"dashboard\">\n");
      out.write("      <table>\n");
      out.write("        <tr style='vertical-align: top'>\n");
      out.write("          <td style='width: 300px; font-size: 0.9em;'>\n");
      out.write("            <div id=\"control\"></div><br/><br/>\n");
      out.write("          </td></tr>\n");
      out.write("          <tr><td style='width: 600px'>\n");
      out.write("            <div style=\"float: left;\" id=\"chart\"></div><br/>\n");
      out.write("\t\t\tTotal : <span id=\"sum\"></span>\n");
      out.write("          </td>\n");
      out.write("        </tr>\n");
      out.write("\t\t\t<tr><td colspan=\"2\">\n");
      out.write("      </table>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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