package com.edu.scau.itcommunity.service;

import java.util.ArrayList;

import com.edu.scau.itcommunity.entity.Categories;

public interface CategoriesService {
	public void save(String categories);
	public void delete(int categories_id);
	public ArrayList<Categories> findAll();
	public Categories findByName(String categories_name);
}
