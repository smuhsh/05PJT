package com.model2.mvc.service.product;

import java.util.Map;

import com.model2.mvc.common.Search;
import com.model2.mvc.service.domain.Product;


//==> ȸ���������� ������ ���� �߻�ȭ/ĸ��ȭ�� Service  Interface Definition  
public interface ProductService {
	
	// ȸ������
	public void addProduct(Product product) throws Exception;
	
	// ��ǰ����Ȯ�� / �α���
	//public Product getProduct(int prodNo) throws Exception;
	//public Product getProduct(Product product) throws Exception;//2022-04-09 shhwang
	public Product getProduct(int prodNo) throws Exception;
	
	// ��ǰ��������Ʈ 
	public Map<String , Object> getProductList(Search search) throws Exception;
	
	// ��ǰ��������
	public void updateProduct(Product product) throws Exception;
	
	//��ǰ�̸� �ߺ� Ȯ���� �� �ʿ䰡 ����. sequence �� �־��� ������ �ߺ�üũ�� ������ ����.
	//public boolean checkDuplication(String prodName) throws Exception;
	
}