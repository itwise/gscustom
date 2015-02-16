<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../common/header.jsp"%>
<%@include file="../common/nav.jsp" %>
<script src="<%=request.getContextPath()%>/public/js/shop/list.js"></script>
<div class="container">
	<div class="product">
		<div class="product-category product-title-bar">
			<ul class="list-inline">
				<li>데스크탑</li>
				<li>모니터</li>
			</ul> 
		</div>
		<div class="product-info">
			<div class="product-info-image" style="background-image:url('${product.imgPath}')" data-background-image-scale></div>
			<div class="product-info-content">
				<div class="product-info-title-bar">
					오늘의 딜 7일 남음 / 234개 판매
				</div>
				<div class="product-info-description">
					<h1>${product.title}</h1>
					<span class="product-info-price">${product.price}원</span>
				</div>
				<div class="product-info-bottom">
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
					<hr />
					<div class="product-info-buying-action">
						<div class="col-xs-4">
							<input type="text" class="form-control"/>
						</div>
						<div class="col-xs-8">
							<button class="btn btn-success col-xs-12">바로구매</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="clearfix"></div>
		<div class="product-detail-info-menus product-title-bar">
			<ul class="list-inline">
				<li class="col-xs-3">상세정보</li>
				<li class="col-xs-3">구매정보</li>
				<li class="col-xs-3">상품평</li>
				<li class="col-xs-3">Q&A</li>
			</ul>
		</div>
		<div class="product-detail-description">
			${product.description}
		</div>
	</div>
</div>	
<%@include file="../common/footer.jsp"%>
