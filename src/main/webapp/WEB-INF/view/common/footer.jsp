<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<c:if test="${cookie.displayGroup.value eq 'N'}">
		<div class="text-center">
			<c:choose>
				<c:when test="${cookie.viewType.value eq 'wide'}">
					<button class="btn btn-lg btn-success switch-view-mode-button" data-view-mode="mobile">MOBILE 보기</button>
				</c:when>
				<c:when test="${cookie.viewType.value eq null or cookie.viewType.value eq 'mobile'}">
					<button class="btn btn-lg btn-success switch-view-mode-button" data-view-mode="wide">PC보기</button>
				</c:when>
			</c:choose>
		</div>		
	</c:if>
	</body>
</html>