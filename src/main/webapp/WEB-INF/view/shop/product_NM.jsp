<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp"%>
<%@include file="../common/nav.jsp" %>
<script src="<%=request.getContextPath()%>/public/js/shop/product.js"></script>
<div class="container">
	<div class="row">
		<div class="product">
			<div class="product-category product-title-bar">
				<ul class="list-inline">
					<li>데스크탑</li>
					<li>모니터</li>
				</ul> 
			</div>
			<div class="product-info-title-bar">
				오늘의 딜 7일 남음 / 234개 판매
			</div>		
			<img src="${product.imgPath}" class="product-image"/>
			<div class="product-info-content">				
				<div class="product-info-description">
					${product.title}					
				</div>
				<div>
					<span class="product-info-price">${product.price}원</span>
				</div>
				<div>
					신한 7% KB 국민 5%
				</div>
				<ul class="list-inline product-info-action text-center">
					<li class="col-xs-3">
						<button class="btn">찜</button>
					</li>
					<li class="col-xs-3">
						<button class="btn">방송알림</button>
					</li>
					<li class="col-xs-3">
						<button class="btn">공유</button>
					</li>
					<li class="col-xs-3">
						<button class="btn">미리계산</button>
					</li>
				</ul>
				
				<div class="product-info-buying-action">
					<div class="col-xs-4">
						<input type="text" class="form-control"/>
					</div>
					<div class="col-xs-8">
						<button class="btn btn-success col-xs-12">바로구매</button>
					</div>
				</div>
			</div>
			<div>
				<ul class="list-inline product-title-bar">
					<li>상세정보</li>
					<li>구매정보</li>
					<li>상품평</li>
					<li>Q&A</li>
				</ul>
				<div class="product-detail-description">
				${product.description}
			</div>
			</div>			
		</div>
	</div>
</div>	
<%@include file="../common/footer.jsp"%>

