<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>College Accountant - PayPal</title>
</head>
<body onload="document.forms['paypalForm'].submit();">
<form name="paypalForm" action="https://www.sandbox.paypal.com/cgi-bin/webscr" method="post">
 <input type="hidden" name="cmd" value="_xclick" />
 <input type="hidden" name="business" value="dilip_dmk@yahoo.com" />
 <input type="hidden" name="password" value="1395751333" />
 <input type="hidden" name="custom" value="1123" />
 <input type="hidden" name="item_name" value="Library Fee" />
 <input type="hidden" name="amount" value="20">
 <input type="hidden" name="rm" value="1" />
 <input type="hidden" name="return" value="http://localhost:8080/CollegeAcct/paypalResponse.jsp" />
 <input type="hidden" name="cancel_return" value="http://localhost:8080/CollegeAcct/paypalResponseCancel.jsp" />
 <input type="hidden" name="cert_id" value="AFcWxV21C7fd0v3bYYYRCpSSRl31A36FtMm2z0Y2fhkdiUEM.qIHyMxD" />
</form>
</body>
</html>