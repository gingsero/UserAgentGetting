<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
		<div>
			<h2> User Agent Detector </h2>
			<input type="button" id="getbutton" class="" value="Getting User Agent Information" onClick="executeGetting()"/>
		</div>
		<div>
			<h4>--����� ����--</h4>
			<table>
				<thead>
					<tr>
						<td> ����� ������ �� </td>
						<td> ������ </td>
					</tr>
				</thead>
				<tbody>
					<!-- ����� User Agent Information  -->
				</tbody>
			</table>
		</div>
	</div>
	
	<script src="resources/js/jquery-3.2.0.js"></script>
	<script src="resources/js/index.js"></script>
</body>
</html>