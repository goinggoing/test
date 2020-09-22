<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>fmt:formatNumber</h1>
<hr>

<fmt:formatNumber value="1234567890" type="number" /><br>
<fmt:formatNumber value="1234567890" type="currency" /><br>
<fmt:formatNumber value="1234567890" type="percent" /><br>

<hr>
<fmt:formatNumber value="1234567890" type="number"
 groupingUsed="false"/><br>

<hr>
<fmt:formatNumber value="1234567890" type="currency"
 currencySymbol="$" /><br>

<%-- minFractionDigits : 소숫점 자릿수 지정 --%>
<fmt:formatNumber value="1234567890" type="currency"
 currencySymbol="$" minFractionDigits="2"/><br>

<%-- minIntegerDigits : 정수 자릿수 지정 --%>
<fmt:formatNumber value="4" type="currency"
 currencySymbol="$" minIntegerDigits="2" /><br>

<hr>
<fmt:formatNumber value="12345.60" type="currency"
 currencyCode="USD" /><br>

<fmt:formatNumber value="12345.60" type="currency"
 currencyCode="JPY" /><br>



<hr>
<fmt:formatNumber value="12345.67890" type="number"
 pattern="#####.##" /><br>

<fmt:formatNumber value="12345.67890" type="number"
 pattern="###,##.##" /><br>

<fmt:formatNumber value="12345.67890" type="number"
 pattern="0000000000.0000000000" /><br>

<hr>
<fmt:formatNumber value="12345.67890" pattern="$#####.##" /><br>

<fmt:formatNumber value="12345.67890" pattern="USD###,##.##" /><br>

<fmt:formatNumber value="12345.67890" pattern="KRW0000000000.0000000000" /><br>













<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
</body>
</html>
