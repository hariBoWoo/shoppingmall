<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>수정</title>
<meta charset="utf-8">

</head>
<body>

	<div class="container">
		<h1 class="col-sm-offset-2 col-sm-10">공지사항 수정</h1>
		<form class="form-horizontal" action="/notice/update" method="post">
			<input type="hidden" name="noticeno" value="${dto.noticeno}">
			<div class="form-group">
				<label class="control-label col-sm-2" >작성자</label>
				<div class="col-sm-6">
					<input type="text" class="form-control" value="관리자">
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-sm-2" for="title">제목</label>
				<div class="col-sm-8">
					<input type="text" name="title" id="title" class="form-control"
						value="${dto.title}">
				</div>
			</div>

			<div class="form-group">
				<label class="control-label col-sm-2" for="content">내용</label>
				<div class="col-sm-8">
					<textarea rows="12" cols="7" id="content" name="content"
						class="form-control">${dto.content}</textarea>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-offset-2 col-sm-5">
					<button class="btn">수정</button>
					<button type="reset" class="btn">원래대로</button>
					<button class="btn" onclick="location.href='/notice/list'">취소</button>
				</div>
			</div>
			<input type="hidden" name="cnt" value="${dto.cnt}">
			<input type="hidden" name="nodate" value="${dto.nodate}">
		</form>
	</div>
</body>
</html>
