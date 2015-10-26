<%@ page language="java"%>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html"%>

<html>
<head>
<title>Wiley Struts Application</title>
</head>

<body>
	<table width="500" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr bgcolor="#36566E">
			<td height="68" width="48%">
				<div align="left">
					<img src="images/hp_logo_wiley.gif" width="220" height="74">
				</div>
			</td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
	</table>

	<html:form action="Lookup" name="lookupForm" type="com.wiley.form.LookupForm">
		<table width="45%" border="0">
			<tr>
				<td>Symbol:</td>
				<td><html:text property="symbol" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><html:submit /></td>
			</tr>
		</table>
	</html:form>

</body>
</html>
