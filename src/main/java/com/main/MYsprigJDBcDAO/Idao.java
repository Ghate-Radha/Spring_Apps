package com.main.MYsprigJDBcDAO;

import java.util.List;

import com.mia.etity.passanger;

public interface Idao {
public int save(passanger pass);


public List<passanger> select();


int update(passanger pass);


int delete(String pname);




}
