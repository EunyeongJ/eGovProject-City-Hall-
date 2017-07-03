<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>
<body>
	mySql 연결확인 : ${dual}
	
	<hr/>

	<form action="../member/memberJoin" name="memberJoinForm" method="post">
		<table>				
			<tr>
				<th>아이디</th>
				<td><input type="text" name="mber_id"></td>
			</tr>
			
			<tr>
				<th>비밀번호</th>
				<td><input type="password" name="mber_pw"></td>
			</tr>
						
			<tr>
				<th>이름</th>
				<td><input type="text" name="mber_nm"></td>
			</tr>
			
			<tr>
				<th>직급</th>
				<td>
					<select name='mber_ps'>
						<option value='01'>사원</option>
						<option value='02'>과장</option>
						<option value='03'>부장</option>
						<option value='04'>사장</option>
					</select>
				</td>
			</tr>			

			<tr>
				<td colspan="2" align="center">				
					<input type="submit"value="회원가입">
					<input type="reset" value="취소">
				</td>
			</tr>
		</table>			
	</form>

</body>
</html>