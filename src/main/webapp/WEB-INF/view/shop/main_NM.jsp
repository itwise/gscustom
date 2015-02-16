<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp"%>
<%@include file="../common/nav.jsp" %>
<div class="container">
	<div class="row">		
		<c:forEach var="product" items="${productList}">
			<a href="product.gs">
				<div class="col-xs-6 col-sm-4">
					<div class="shop-product-image single-block" style="background-image:url('${product.imgPath}')" data-background-image-scale></div>
					<div class="shop-product-info">
						<h5>${product.title}</h5>
						<span>${product.price}</span>원
					</div>
				</div>
			</a>
		</c:forEach>
	</div>
</div>	
<%@include file="../common/footer.jsp"%>
