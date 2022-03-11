package com.jeyaprabakar.advancedprogramming.service;

import java.util.List;

import com.jeyaprabakar.advancedprogramming.repository.ProductRepository;
import com.jeyaprabakar.advancedprogramming.model.entity.Product;
import com.jeyaprabakar.advancedprogramming.util.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
    ProductRepository dao;
	@Autowired
	private StorageService storageService;
	@Autowired SellerService sellerService;
	@Override
	public void addProduct(Product p, MultipartFile pic) {
		// TODO Auto-generated method stub
		String photo=storageService.store(pic);
		p.setPhoto(photo);
		dao.save(p);
	}

	@Override
	public List<Product> findProducts(int sellerId) {
		// TODO Auto-generated method stub
		return dao.findBySeller(sellerService.findById(sellerId),Sort.by(Sort.Direction.DESC,"prodid"));
	}

	@Override
	public void updateProduct(Product p) {
		Product pp=dao.getById(p.getProdid());
		p.setSeller(pp.getSeller());
		dao.save(p);
	}

	@Override
	public void deleteProduct(int prodid) {
		// TODO Auto-generated method stub
		Product p=dao.getById(prodid);
		dao.delete(p);
	}

	@Override
	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		return dao.findAll(Sort.by(Sort.Direction.DESC,"prodid"));
	}

	@Override
	public Product findProductById(int prodid) {
		// TODO Auto-generated method stub
		return dao.getById(prodid);
	}

	@Override
	public List<Product> categoryProducts(String pcat,String subcat) {
		// TODO Auto-generated method stub
		return dao.findByPcatAndSubcat(pcat, subcat,Sort.by(Sort.Direction.DESC,"prodid"));
	}

	@Override
	public Page<Product> allProductsPaginated(int page,int pagesize) {
		Page<Product> prods=dao.findAll(PageRequest.of(page, pagesize,Sort.by(Direction.DESC, "prodid")));
		System.err.println(prods.getSize());
		return prods;
	}
}
