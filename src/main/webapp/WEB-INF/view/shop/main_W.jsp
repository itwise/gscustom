<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp"%>
<%@include file="../common/nav.jsp" %>
<script src="<%=request.getContextPath()%>/public/js/shop/list.js"></script>
<div class="container">
	<div class="row">
		<c:forEach var="product" items="${productList}">
			<a href="product.gs">	
				<div class="col-xs-3">
					<div class="shop-product">
						<div class="shop-product-image single-block" style="background-image:url('${product.imgPath}')" data-background-image-scale></div>
						<div class="shop-product-info">
							<div class="shop-product-buttons">
								<button>확대</button>
								<button>찜</button>
								<button>새창보기</button>
							</div>
							<div class="shop-product-name">
								${product.title}
							</div>
						</div>				
					</div>
				</div>
			</a>
		</c:forEach>
	</div>
</div>	
<%@include file="../common/footer.jsp"%>
