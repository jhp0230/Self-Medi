<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<style type="text/css">

table{
	border: 1px solid #ccc;
	margin: 0 auto;
	
	width: 1200px;
}
tr{
	border: 1px solid #ccc;

}
td{


}
</style>

<title>Insert title here</title>
</head>
<body>

<div>
<table>
	<tr>
		<td>게시글 번호</td>
		<td>제목</td>
		<td>사용자 아이디</td>
		<td>내용</td>
		<td>추천수</td>
		<td>작성날짜</td>
	</tr>
<c:forEach items="${boardlist }" var="boardlist">
	<tr>
		<td>${boardlist.boardno }</td>
		<td>${boardlist.userid }</td>
		<td>${boardlist.hit }</td>
		<td>${boardlist.writeDate }</td>
	</tr>
</c:forEach>
</table>
</div>




</body>
</html>