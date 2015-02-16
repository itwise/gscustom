package kr.co.itwise.device.product;

import java.util.ArrayList;
import java.util.List;

public class ProductList {
	
	private List<Product> productList;
	public ProductList(){
		this.productList = new ArrayList<Product>();
		this.productList.add(new Product("LG 올인원 일체형 PC","모니터와 데스크탑이 하나로!","http://image.gsshop.com/mi09/deal/dealno/995ec163-ada6-4a82-9649-2063a132b47b.jpg",8,509680));
		this.productList.add(new Product("[아이리스코리아] 컴퓨터 책상 모음전", "서재에 품격을 더하다~", "http://image.gsshop.com/mi09/deal/dealno/3d4e19d9-efb1-4499-b40a-ad55ddb78115.jpg", 9, 29900));
		this.productList.add(new Product("쿠첸 다이아몬드코팅 와이드 전기그릴 CHG-G1610W", "(분리형/온도조절/기름유도 장치)", "http://image.gsshop.com/image/59/73/5973080_L1.jpg", 30, 89000));
		this.productList.add(new Product("[에스까리에] 빨아쓰는 메모텍스+순면 100% 커버세트", "쾌적한 잠자리에 꿀잠 포레버", "http://image.gsshop.com/mi09/deal/dealno/93917_img_1_2.jpg", 10, 29900));
		this.productList.add(new Product("[New Arrival] 롬머키드픽스 SICT 스톰그레이 (ISOFIX포함)_아동용 카시트", "", "http://image.gsshop.com/image/14/84/14845550_L1.jpg", 33, 398000));
		this.productList.add(new Product("독일 알텐바흐 프리미엄 자일란블랙4중코팅 와이드 전기그릴 풀세트 AW-1300", "", "http://image.gsshop.com/image/11/32/11320144_L1.jpg", 99, 89000));
		this.productList.add(new Product("[스팀큐2] A급리퍼 빨강 다리미 스팀큐2!", "쏵쏵 빨강다리미 가격 칼주름잡는 소리", "http://image.gsshop.com/mi09/deal/dealno/86954_img_1_2.jpg", 155, 35800));
		this.productList.add(new Product("[리큅] 최저가도전! 식품건조기 5종 택1", "냠냠 지금 리큅은 맛있게 말리는 중", "http://image.gsshop.com/mi09/deal/dealno/91545_img_1_1.jpg", 130, 59000));
		this.productList.add(new Product("완벽세척 가습기 미로클린팟 슈가습기", "속까지 씻는 속시원한 가습기", "http://image.gsshop.com/mi09/deal/dealno/5a81ac07-c298-45b5-b731-99d0dc2f128b.jpg", 54, 129000));
		this.productList.add(new Product("[데일리워터] 손걸레전용 물티슈 80매x10팩", "생활물티슈로 즐겁고 편한 청소!", "http://image.gsshop.com/mi09/deal/dealno/31332517-b7e4-46af-a75c-645e9b8ecfe4.jpg", 1641, 14400));
		this.productList.add(new Product("[코렐코디네이츠] 명절선물포장 가족수저세트", "손님들 다 오신다고 고렐?", "http://image.gsshop.com/mi09/deal/dealno/91367_img_1_1.jpg", 869, 19900));
		this.productList.add(new Product("[올리빙] 크로스 리빙박스 2P/언더베드", "탄탄한 프레임으로 내구성 UP!", "http://image.gsshop.com/mi09/deal/dealno/7fd0812a-0b9a-4fb1-bb09-0ba04be7538e.jpg", 1973, 15900));
		this.productList.add(new Product("[올리빙] 도트 행거/옷걸이/헹거/이동식", "좁은공간 OK! 국내산 디자인행거", "http://image.gsshop.com/mi09/deal/dealno/9c0602f4-751c-4943-bed0-c24178693214.jpg", 1791, 14900));
		this.productList.add(new Product("[양키캔들] 설명절 선물세트", "명절선물세트", "http://image.gsshop.com/mi09/deal/dealno/90838_img_1_1.jpg", 1167, 26800));
		this.productList.add(new Product("[씨아이닉스]싱크대 물막이 개구리 물펜스", "이리튀고 저리튀는 물 잡아랏!", "http://image.gsshop.com/mi09/deal/dealno/8e87ade9-4643-4f1d-97d9-75e888b203b7.jpg", 1701, 10970));
		this.productList.add(new Product("[짐승용량]다우니 섬유유연제 8.5L", "향기가 이토록 아름다우니~", "http://image.gsshop.com/mi09/deal/dealno/a26ae721-9389-4db7-afe3-980324c56cdc.jpg", 644, 21900));
	}
	
	
	public List<Product> getProduct(){
		return this.productList;
	}
}
