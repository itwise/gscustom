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
	<div class="text-center">
		<div class="well">
			<div>
				<strong>디바이스 검증 기준</strong> <span id="parsing-type"></span>
			</div>
			<div>
				<strong>현재 해상도</strong> <span id="device-width"></span> x <span id="device-height"></span>, <strong>픽셀배율</strong> <span id="pixel-ratio"></span>
			</div>
			<div>
				<strong>VIEW TYPE</strong> <span id="view-type"></span>,
				<strong>Display Group</strong> <span id="display-group"></span>
			</div>
			<div>
				<strong>현재 CSS</strong> ${loadedCSS}
			</div>
			<div>
				<strong>현재 VIEW JSP</strong> <code>view/${requestScope.viewName}.jsp</code>
				<button class="btn btn-sm btn-danger" id="remove-cookie-button">쿠키 초기화</button>
			</div>			
		</div>
	</div>
</body>
</html>