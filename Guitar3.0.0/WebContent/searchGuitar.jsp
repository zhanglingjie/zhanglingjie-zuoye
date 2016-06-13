<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Guitar sales system V2.0.0</h1>
<form action="SearchGuitar" >
<label>model</label>
<select name="model" >
<option>01</option><option>02</option>
</select><br/>
<label>类型</label>
<select name="type" >
<option>ACOUSTIC</option><option>ELECTRIC</option>
</select><br/>
<label>制造商</label>
<select name="builder" >
<option>AMY</option><option>RYAN</option>
</select><br/>
<label>上部材料</label>
<select name="topwood" >
<option>ALDER</option><option>MAPLE</option><option>CEDAR</option>
</select><br/>
<label>背部材料</label>
<select name="backwood" >
<option>ALDER</option><option>MAPLE</option><option>CEDAR</option>
</select><br/>
<label>上部材料</label>
<select name="numStrings" >
<option>6</option>
</select>
<br/>
<input type="submit" value="请查询">
</form>



</body>
</html>